package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import modell.LogikaiFeladat;
import modell.Lada;
import nezet.LogikaiNezet;

public class LogikaiVezerlo {
    private LogikaiFeladat modell;
    private Lada[] ladak;
    
    private LogikaiNezet nezet;
    private JRadioButton[] rdbs;

    private boolean rogton;
    
    public LogikaiVezerlo(LogikaiFeladat modell, LogikaiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        
        this.nezet.setVisible(true);
        
        this.modell = new LogikaiFeladat();
        ladak = modell.getLadak();
        
        rogton = false;
        
        this.nezet.setLblLeiras(this.modell.getLeiras());

        rdbs = this.nezet.getRdbs();
        for (int i = 0; i < rdbs.length; i++) {
            Lada lada = ladak[i];
            String anyag = lada.getAnyag();
            
            rdbs[i].setText(anyag);
            String f = lada.getFelirat();
            f = anyag + ": " + f + "\n";
            
            /* ha public lesz a field láthatósága: */
            //this.nezet.txaFeladat.append(f);
            
            /* getterrel, ami 1 setter: */
            this.nezet.getTxaFeladat().append(f);
            /* itt a setter: */
            //this.nezet.getTxaFeladat().setText("asd");
            
            rdbs[i].addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    kincsVizsgalat(e);
                }
            });
        }
        
        JButton btnVizsgal = this.nezet.getBtnVizsgal();
        btnVizsgal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vizsgal();
            }
        });
        
        JCheckBox chbRogton = this.nezet.getChbRogton();
        chbRogton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                btnVizsgal.setEnabled(!chbRogton.isSelected());
                rogton = chbRogton.isSelected();
            }
        });
    }
    
    private void vizsgal() {
        int i = 0;
        while(i < rdbs.length && !rdbs[i].isSelected()){
            i++;
        }
        
        JTextField txtEredmeny = nezet.getTxtEredmeny();
        if(i >= rdbs.length){
            //txtEredmeny.setText("Nincs választott láda!");
            txtEredmeny.setText("Nincs választott láda!");
        }else if(ladak[i].isKincs()){
            //txtEredmeny.setText("Eltaláltad!");
            txtEredmeny.setText("Eltaláltad!");
        }else{
            //txtEredmeny.setText("Nem talált!");
            txtEredmeny.setText("Nem talált!");
        }
    }
    
    private void kincsVizsgalat(java.awt.event.ItemEvent evt) {                                
        if (rogton) {
            vizsgal();
        }
    }   
}
