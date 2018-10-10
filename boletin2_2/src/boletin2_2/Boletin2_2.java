
package boletin2_2;

import java.util.Scanner;


public class Boletin2_2 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double gcent, gfar, gkel;
        System.out.println("introduzca ºC");
        gcent= ler.nextDouble();
        gfar= (gcent*9/5)+32 ;
        gkel= gcent + 273;
        System.out.println(gcent+"ºC corresponde a " + gkel+" K y a " + gfar +"ºF");
        // TODO code application logic here
    }
    
}
