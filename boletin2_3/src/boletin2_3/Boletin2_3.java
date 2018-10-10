
package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
        Scanner ler= new Scanner (System.in);
        int b100, b20, b5, m1;
        System.out.println("Introduzca cantidad de billetes de 100€");
        b100= ler.nextInt();
        System.out.println("Introduzca cantidad de billetes de 20€");
        b20= ler.nextInt();
        System.out.println("Introduzca cantidad de billetes de 5€");
        b5= ler.nextInt();
        System.out.println("Introduzca cantidad de monedas de 1€");
        m1= ler.nextInt();
        System.out.println("El total es " + ((b100*100)+(b20*20)+(b5*5)+m1)+"€");
        
        // TODO code application logic here
    }
    
}
