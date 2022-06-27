package pe.edu.upeu.mefll.Examen;

import java.util.Scanner;

import javax.print.attribute.standard.NumberOfDocuments;

public class ResolucionExamen {
    static Scanner leer = new Scanner(System.in);

    public static void ExamenMEFLL02(){
       // definir variables
    int i, n = 3;
    double cate1, cate2, cate3, clave, costo;
    double impuesto, impuestopagar;
    cate1 = 0;
    cate2 = 0;
    cate3 = 0;
    impuestopagar = 0;
    // datios de entrada proceso y salida 
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

    public static void ExamenMEFLL03() {
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

    public static void ExamenMEFLL04() {
        int  num , i ,suma;
        System.out.println("numeros perfectos entre 1 y 20:");
        num=leer.nextInt();
        num=20; i=1;
        while(i<num);{
            suma = 0;
         while(i<=20);
            if(i % num==0){
             suma = suma + num;
                 }
         }
          if(i == suma){                          
             System.out.println(i);
            }
          }

public static void ExamenMEFLL05() {
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
