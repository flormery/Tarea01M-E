package tareaFP;

import java.util.Scanner;

public class Ejercicio416 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int billetes_10, billetes_20, billetes_50, billetes_100, billetes_200;
        int monedas_01, monedas_02, monedas_05, monedas_1, monedas_2, monedas_5;
        int monedas_de_, total;
        System.out.print("Ingresa el valor de billetes de 10: ");
        billetes_10 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 20: ");
        billetes_20 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 50: ");
        billetes_50 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 100: ");
        billetes_100 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 200: ");
        billetes_200 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 01: ");
        monedas_01 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 02: ");
        monedas_02 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 05: ");
        monedas_05 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 1: ");
        monedas_1 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 2: ");
        monedas_2 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 5: ");
        monedas_5 = in.nextInt();
        in.nextLine();
        total=billetes_10*10+billetes_20*20+billetes_50*50+billetes_100*100+billetes_200*200+monedas_01*01+monedas_02*02+monedas_05*05+monedas_1*1+monedas_2*2+monedas_5*5+monedas_1;
        System.out.println("Valor de total: " + total);
    }

}

