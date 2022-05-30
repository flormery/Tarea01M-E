package MEFLLtareaFP;

import java.util.Scanner;

/**
 * ejercicio
 */
public class MEFLL41 {

    static Scanner it=new Scanner (System.in);
    public static void ejercicio41() {
        //Definir variables
        double total=1500;
        //Proceso
        for(int i = 0; i< 6; i++){
            total=total+(total*0.10);
            System.out.println("su salario es"+(i+i)+"año sera de: "+total);
        }
        
    }
    public static void main(String[] args) {
        ejercicio41();
    }
    }
