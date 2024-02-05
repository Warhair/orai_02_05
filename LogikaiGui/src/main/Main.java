package main;

import modell.LogikaiFeladat;
import nezet.LogikaiNezet;
import vezerlo.LogikaiVezerlo;

public class Main {
    public static void main(String[] args) {
        LogikaiNezet nezet = new LogikaiNezet();
        LogikaiFeladat modell = new LogikaiFeladat();
        new LogikaiVezerlo(modell, nezet);
        
        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LogikaiNezet().setVisible(true);
//            }
//        });
    }
}
