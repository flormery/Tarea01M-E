package pe.edu.upeu.mefll.Examen;

import java.util.Scanner;

import javax.print.attribute.standard.NumberOfDocuments;

public class ResolucionExamen {
    static Scanner leer = new Scanner(System.in);

    public void ExamenMEFLL02(){
        Scanner in = new Scanner(System.in);
        int i, n;
        double categoria_1, categoria_2, categoria_3, clave, costo;
        double impuesto, impuesto_a_pagar;
        categoria_1 = 0;
        categoria_2 = 0;
        categoria_3 = 0;
        impuesto_a_pagar = 0;
        System.out.print("Ingresa el numero de vehiculos que desea adquirir : ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            
            System.out.print("Ingresa la categoria 1-2-3 : ");
            clave = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de costo: ");
            costo = in.nextDouble();
            in.nextLine();
            impuesto=0;
            if(clave==1)
            {
                impuesto=costo*0.12;
                categoria_1=categoria_1+impuesto;
            }
            if(clave==2)
            {
                impuesto=costo*0.08;
                categoria_2=categoria_2+impuesto;
            }
            if(clave==3)
            {
                impuesto=costo*0.05;
                categoria_3=categoria_3+impuesto;
            }
            impuesto_a_pagar=impuesto_a_pagar+impuesto;
            System.out.print("Valor de impuesto: " + impuesto);
            System.out.println();
        }
        System.out.println("Valor de categoria 1: " + categoria_1);
        System.out.println("Valor de categoria 2: " + categoria_2);
        System.out.println("Valor de categoria 3: " + categoria_3);
        System.out.println("Valor de impuesto a pagar: " + impuesto_a_pagar);
    }

    public void ExamenMEFLL03() {
        int nut;
        System.out.print("ingrese la altura de la X:");
        nut = leer.nextInt();
        for (int i = 1; i <= nut; i++) {
            for (int j = 1; j <= nut; j++) {
                if (i == j || i + j == nut + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }

    public void ExamenMEFLL04() {
        int i, j, suma, sec = 0;
        System.out.println("Ingrese cuantos numeros perfectos desea ver (dentro del rango): ");
        int canti = leer.nextInt();
        System.out.println("Los numero perfectos son: ");
        for (i = 1; i > 0; i++) {

            suma = 0;
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    suma = suma + j;
                }
            }
            if (i == suma) {

                sec++;
                if (sec <= canti) {
                    System.out.println(i);
                } else {
                    break;
                }
            }
        }
    }

public void ExamenMEFLL05() {
        int n;
        Scanner sistemadecimal = new Scanner(System.in);
        do {
            System.out.print("Introduzca un numero: ");
            n = leer.nextInt();
        } while (n < 0);
        System.out.println();
        System.out.print(" a binario: ");
        decBin(n);
        System.out.println();
    } public static void decBin(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            decBin(n / 2);
            System.out.print(n % 2);
            return;
        }
    }
}
