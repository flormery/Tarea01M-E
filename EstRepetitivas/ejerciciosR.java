import java.util.Scanner;

public class ejerciciosR {
        /**
         * InnerejerciciosR
         */
        public static void imprimirwhileN1_20() {
            int numInit=21;
            while (numInit<=20) {
                System.out.println(numInit);
                numInit=numInit+1;
            }
        } 
        public static void imprimirForN1_20() {
            for (int numInit = 1; numInit <=20; numInit++) {
                System.out.println(numInit);
                
            } 
                
            
            
        }
        public static void imprimirDowhileN1_20() {
            int numInit=21;
            do {
                System.out.println(numInit);
                numInit++;
            } while (numInit<=20);
            
        }
        public static void nombreinvertiso() {
            Scanner It=new Scanner(System.in);
            System.out.println("Ingrese su nombre:");
            String nombre=It.next();
            for (int i = nombre.length()-1; i >=0;i--) {
                System.out.println(nombre.charAt(i));
            }
            
        }


     public static void main(String[] args) {
         /*System.out.println("imprime While:"); imprimirwhileN1_20();
         System.out.println("imprime Do while:"); imprimirDowhileN1_20();
         System.out.println("imprime flor:"); imprimirForN1_20();*/
         
         nombreinvertiso();
     }
}
