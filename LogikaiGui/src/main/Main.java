package main;

import nezet_vezerlo.LogikaiNezetVezerlo;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogikaiNezetVezerlo().setVisible(true);
            }
        });
    }
}
