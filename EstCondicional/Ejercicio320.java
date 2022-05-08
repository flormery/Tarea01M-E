package tarea;
import java.util.Scanner;

/**
 * Ejercicio320
 */
public class Ejercicio320 {

    public static void main(String[] args) {
        //declarar variables
        int talla;
        double cantTela, costoTela, cantPant,pbase=0,utilUni,pfinal, utilTotal,cantTP;
    String modelo;
    //datos de entrada
    Scanner It=new Scanner(System.in);
    System.out.println("Ingrese Modelo : ");
    modelo=It.next();
    System.out.println("Ingrese talla a confeccionar:");
    talla=It.nextInt();
    System.out.println("cantidad de tela :");
    cantTela=It.nextDouble();
    System.out.println("costo  de tela x MT :");
    costoTela=It.nextDouble();
    System.out.println("Mt tela x panatalon:");
    cantTP=It.nextDouble();
    //Proceso
    cantPant=Math.round(cantTela/cantTP);
    if (modelo.equals("A")) {
        if (talla==32 || talla==36) {
            pbase=costoTela+costoTela*0.80+costoTela*0.04;
            
        }else{
            pbase=costoTela+costoTela*0.95;
        }
        if (modelo.equals("A")) {
            if (talla==32 || talla==36) {
                pbase=costoTela+costoTela*0.95+costoTela*0.04;
                
            }else{
                pbase=costoTela+costoTela*0.95;
            }  
    } else {
        
    }
     utilUni=pbase*0.30;
     pfinal=utilUni+pbase;
     utilTotal=utilUni*cantPant; 
      //Datos de salida
      System.out.println("Precio de cada pantalon : "+pfinal);
      System.out.println("Utilidad total : "+utilTotal);
    }
}
}