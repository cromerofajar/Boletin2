
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double sb, sf, sl, st,ven, com=0.05, km, die, irpf=0.18, ss=36;
        System.out.println("Introduzca Sueldo total");
        sf=ler.nextDouble();
        System.out.println("Introduzca km recorridos");
        km=ler.nextDouble();
        System.out.println("Introduzca candidad de dias de desplazamiento");
        die=ler.nextDouble();
        System.out.println("Introduzca cantidad de ventas");
        ven=ler.nextDouble();
        sb= sf +(km*2)+(die*30)+(ven*com);
        System.out.println("sueldo bruto = " + sb+ "€");
        sl= (sb*irpf)-ss;
        sl= sl -sb;
        System.out.println("sueldo liquido ="+sl+"€");
        // TODO code application logic here
    }
    
}
