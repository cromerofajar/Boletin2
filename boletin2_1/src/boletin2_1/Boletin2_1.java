
package boletin2_1;

import java.util.Scanner;


public class Boletin2_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double prta, prpa, d=100;
        System.out.println("introduzca precio tarifa");
        prta=ler.nextDouble();
        System.out.println("introduzca precio pagado");
        prpa=ler.nextDouble();
        System.out.println ((d-(prpa*100)/prta)+"% de descuento.");
        // TODO code application logic here
    }
    
}
