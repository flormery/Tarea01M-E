import java.util.Scanner;
  public class ejercicio{
    
    public static void main(String[] args){
      
      Scanner entrada=new Scanner(System.in);
      int edad = 0;
      String mensaje="";
      String nombre;
      System.out.println("¿cual es tu nombre");
      nombre=entrada.next();
      System.out.println("¿"+ nombre + "cual es la edad");
      edad = entrada.nextInt();
      if(edad<=18){
      System.out.print(nombre+"puede escribir su edad es"+edad);}else if (edad<18){
        System.out.println(nombre+"no puede votar porque tu edad es"+edad);}else{
        
      } 
      }
    }
  