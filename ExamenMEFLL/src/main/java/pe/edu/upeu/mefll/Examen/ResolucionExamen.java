package pe.edu.upeu.mefll.Examen;

import java.util.Scanner;

import javax.print.attribute.standard.NumberOfDocuments;

public class ResolucionExamen {
    static Scanner leer = new Scanner(System.in);

    public  void ExamenMEFLL02(){
    int i, n = 3;
    double cate1, cate2, cate3, clave, costo;
    double impuesto, impuestopagar;
    cate1 = 0;
    cate2 = 0;
    cate3 = 0;
    impuestopagar = 0;
        System.out.print("Ingresa el numero de autos: ");
        n = leer.nextInt();
        leer.nextLine();
    for (i = 1; i <= n; i++) {
        System.out.print("PROCESO " + i);

        System.out.print("   Ingresa la categoria 1-2-3 : ");
            clave = leer.nextDouble();

        leer.nextLine();
        System.out.print("Ingresa el costo del vehiculo: ");
            costo = leer.nextDouble();
            leer.nextLine();
            impuesto = 0;
    if (clave == 1) {
            impuesto = costo * 0.1;
            cate1 = cate1 + impuesto;
        }
    if (clave == 2) {
            impuesto = costo * 0.07;
            cate2 = cate2 + impuesto;
        }
    if (clave == 3) {
            impuesto = costo * 0.05;
            cate3 = cate3 + impuesto;
        }
            impuestopagar = impuestopagar + impuesto;
        System.out.println("total del impuesto: " + impuesto);
        System.out.println();
    }
    System.out.println("total del impuesto categoria 1: " + cate1);
    System.out.println("total del impuesto categoria 2: " + cate2);
    System.out.println("total del impuesto 3: " + cate3);
    System.out.println("total a pagar del impuesto es de : " + impuestopagar);
}

    public  void ExamenMEFLL03() {
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
