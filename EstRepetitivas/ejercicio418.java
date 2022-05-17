package EstRepetitivas;

import java.util.Scanner;

public class ejercicio418 {
  
    static Scanner It=new Scanner(System.in);

    public static void impuestoVehiculo418() {
        //Definir variables
        String cateV= "";
        int cantidad=0;
        double costV=0, impUnit=0, impTotal=0, TotalImpV=0;
        //Datos de Entrada y Proceso y Salida
       for (int i = 0; i < 3; i++) {
           System.out.println("Ingrese cantidad vehiculo de categorias "+(i+1)+": ");
           cantidad=It.nextInt();
           System.out.println("Ingrese el precio de la categoria "+(i+1)+": ");
           costV=It.nextDouble();
           if(i==0){
               impUnit=costV*0.10;
           }else if(i==1){
               impUnit=costV*0.07;
           }else{
               impUnit=costV*0.05;
           }
           impTotal=impUnit*cantidad;
           System.out.println("Impuesto de categoria "+(i+1)+"es:"+impUnit);
           System.out.println("Impuesto total de categoria "+(i+1)+"es:"+impUnit);
           TotalImpV=TotalImpV+impTotal;
        }
        System.out.println("Impuesto total de los vinculos es :"+TotalImpV);

    } 
    public static void main(String[] args) {
        impuestoVehiculo418();
    }        
        


        
    }

