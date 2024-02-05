
package kolekciok;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Listak {

  
    public static void main(String[] args) {
        List<Integer> szamok = new ArrayList<>();
        szamok.add(12);
        szamok.add(2);
        szamok.add(56);
        System.out.println(szamok);
        szamok.remove(1);
        System.out.println(szamok);
        
         List<Integer> szamokat = new ArrayList<>();
         Random r = new Random();
         int low = 20;
         int high = 30;
         int veg = r.nextInt(high-low)+low;
         
         
         for (int i = 0; i < veg; i++) {
             low = 10;
             high = 99;
             szamokat.add(r.nextInt(high-low)+low);
         }
         int i = szamokat.size()-1;
         System.out.println(i);
         System.out.println(szamokat);
        for (int j = i; j > 0; j--) {
             if(szamokat.get(j) % 2 == 0){
                szamok.remove(j);
        }
        }
    }
    
}
