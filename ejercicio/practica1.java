                    package ejercicio;

                    import java.util.Scanner;

                    /**
                     * practica1
                     */
                    public class practica1 {


                        static Scanner leerT=new Scanner(System.in);


                    public static void algoritmos() {
                        System.out.println("ingrese altura de la letra:");
                        int cantF=leerT.nextInt();
                        System.out.print("ingrese num fila para linea:");
                        int numFilLinea=leerT.nextInt();
                        int medio=cantF+1;
                        for (int f = 1; f<=cantF; f++) {
                            for(int c= 1; c <=2*cantF+1; c++){
                                if (f==1 && medio==c ) {
                                    System.out.println("*");
                                }else if(c==medio-f && f>1){
                                    System.out.print("*");
                                }else if(c==medio+f && f>1){
                                    System.out.print("*"); 
                                }else if(f==numFilLinea && c>=medio-f && c<=medio+f){
                                    System.out.print("*"); 
                                }else{
                                    System.out.print(" "); 
                                }
                            }
System.out.print("\n");
                            
                        }
System.out.print("");
                        

}
public static void ggg() {
    System.out.println("ingrese la altura de la letra");
    int a=leerT.nextInt();
    System.out.println("ingrese el numero de fila ");
    int b=leerT.nextInt();
    int medio=a+1;
    System.out.println("ingrese el numero filas del cuadrado ");
    int d=leerT.nextInt();
    
    for (int f = 1; f <= a; f++) {
        for (int c = 0; c <= 2*a+1; c++) {
            if(f==1 && medio==c){
                System.out.print("*");
            }else if (c==medio-f && f>1){
                System.out.print("*");
            }else if (c==medio+f && f>1){
                System.out.print("*");
            }else if (f==a && c>=medio-f && c<=medio+f){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
    
        }
        System.out.println("\n");
    }
    
    for (int i = 0; i <d; i++) {
        
            for (int j = 0; j < d; j++) {
                System.out.print("   *");
            }
            System.out.print("\n");
        
    }
        
}
  

    
    
        public static void main(String[] args) {
           ggg();
        }
    }

    

