
package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int b100, b20, b5, m1, t, r;
        System.out.println("Introduzca cantidad exacata de €");
        t= ler.nextInt();
        b100=t/100; //cojemos el cociente como resultado para la cantidad de villetes, tras eso calculamos el resto y se lo restamos al total.
        r=t%100;
        t=t-(t-r);
        b20=t/20;
        r=t%20;
        t=t-(t-r);
        b5=t/5;
        r=t%5;
        m1=r;
        System.out.println("cantidad de billestes de 100€= " + b100 +"\ncantidad de billetes de 20€= " + b20 + "\ncantidad de billetes de 5€= " + b5 + "\ncantidad de monedas de 1€= "+m1);
             
        // TODO code application logic here
    }
    
}
