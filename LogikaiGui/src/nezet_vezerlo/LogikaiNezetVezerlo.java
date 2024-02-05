package nezet_vezerlo;

import javax.swing.JRadioButton;
import modell.Feladat;
import modell.Lada;

public class LogikaiNezetVezerlo extends javax.swing.JFrame {

    private Feladat modell;
    private Lada[] ladak;
    
    private JRadioButton[] rdbs;
    private boolean rogton;
    
    public LogikaiNezetVezerlo() {
        initComponents();
        
        /* legyen esemény alapján:
         * esemény: windowOpened
         * esemény kezelő metódusa: formWindowOpened <--az esemény hatására lefutó metódus
        */
        //jLabel1.setText("Csak 1 állítás igaz!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblLeiras = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaFeladat = new javax.swing.JTextArea();
        rdbArany = new javax.swing.JRadioButton();
        rdbEzust = new javax.swing.JRadioButton();
        rdbBronz = new javax.swing.JRadioButton();
        chbRogton = new javax.swing.JCheckBox();
        btnVizsgal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtEredmeny = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logikai GUI");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblLeiras.setText("jLabel1");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Feladat"));

        txaFeladat.setEditable(false);
        txaFeladat.setColumns(20);
        txaFeladat.setRows(5);
        jScrollPane1.setViewportView(txaFeladat);

        buttonGroup1.add(rdbArany);
        rdbArany.setText("jRadioButton1");
        rdbArany.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kincsVizsgalat(evt);
            }
        });

        buttonGroup1.add(rdbEzust);
        rdbEzust.setText("jRadioButton2");
        rdbEzust.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kincsVizsgalat(evt);
            }
        });

        buttonGroup1.add(rdbBronz);
        rdbBronz.setText("jRadioButton3");
        rdbBronz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kincsVizsgalat(evt);
            }
        });

        chbRogton.setText("rögtön vizsgál");
        chbRogton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbRogtonItemStateChanged(evt);
            }
        });

        btnVizsgal.setText("Vizsgál");
        btnVizsgal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVizsgalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdbArany)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chbRogton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdbBronz)
                                .addGap(39, 39, 39)
                                .addComponent(btnVizsgal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbEzust))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbArany)
                    .addComponent(chbRogton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbEzust)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbBronz)
                    .addComponent(btnVizsgal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Eredmény:");

        txtEredmeny.setEditable(false);
        txtEredmeny.setText("Hol a kincs? Válassz 1 lehetőséget!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLeiras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txtEredmeny))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLeiras, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        rogton = false;
        
        /* modellből jönnek: */
//        lblLeiras.setText("Csak 1 állítás igaz!");
//        
//        String[] anyagok = {"arany", "ezüst", "bronz"};
//        String[] feliratok = {"én rejtem!", "nem én rejtem!", "az arany hazudik!"};
        modell = new Feladat();
        ladak = modell.getLadak();
        

        rdbs = new JRadioButton[3];
        rdbs[0] = rdbArany;
        rdbs[1] = rdbEzust;
        rdbs[2] = rdbBronz;
        for (int i = 0; i < rdbs.length; i++) {
            //String anyag = anyagok[i];
            /* ha nincs ladak: */
            //String anyag = modell.getLadak()[i].getAnyag();
            Lada lada = ladak[i];
            String anyag = lada.getAnyag();
            
            rdbs[i].setText(anyag);
            //String f = feliratok[i];
            String f = lada.getFelirat();
            f = anyag + ": " + f + "\n";
            txaFeladat.append(f);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnVizsgalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVizsgalActionPerformed
        vizsgal();
    }//GEN-LAST:event_btnVizsgalActionPerformed

    private void chbRogtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbRogtonItemStateChanged
        btnVizsgal.setEnabled(!chbRogton.isSelected());
        rogton = chbRogton.isSelected();
    }//GEN-LAST:event_chbRogtonItemStateChanged

    /* rdbArany, rdbEzust, rdbBronz ItemStateChanged események kezelője: 
    ez a közös eseménykezelő
    */
    private void kincsVizsgalat(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kincsVizsgalat
        if (rogton) {
            vizsgal();
        }
    }//GEN-LAST:event_kincsVizsgalat

    private void vizsgal() {
        int i = 0;
        while(i < rdbs.length && !rdbs[i].isSelected()){
            i++;
        }
        
        if(i >= rdbs.length){
            txtEredmeny.setText("Nincs választott láda!");
        //}else if(i == 1){//OOP használatával --> lada.isKincs()
        }else if(ladak[i].isKincs()){
            txtEredmeny.setText("Eltaláltad!");
        }else{
            txtEredmeny.setText("Nem talált!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVizsgal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbRogton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLeiras;
    private javax.swing.JRadioButton rdbArany;
    private javax.swing.JRadioButton rdbBronz;
    private javax.swing.JRadioButton rdbEzust;
    private javax.swing.JTextArea txaFeladat;
    private javax.swing.JTextField txtEredmeny;
    // End of variables declaration//GEN-END:variables
}
