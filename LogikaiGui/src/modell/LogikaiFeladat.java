package modell;

public class LogikaiFeladat {
    
    private Lada[] ladak;
    private String leiras;
    
    public LogikaiFeladat(){
        leiras = "Csak 1 állítás igaz!";
        Lada arany = new Lada("arany", "én rejtem");
        Lada ezust = new Lada("ezüst", "nem én rejtem", true);
        Lada bronz = new Lada("bronz", "az arany hazudik");
        ladak = new Lada[3];
        ladak[0] = arany;
        ladak[1] = ezust;
        ladak[2] = bronz;
    }

    public Lada[] getLadak() {
        return ladak;
    }

    public String getLeiras() {
        return leiras;
    }
   
}
