import java.util.Scanner;
public class ejercicio{
  
  public static void main(string args[]){
    Scaneer entrada=new scanner(system.in);
    float pagahora=0;
    float sueldomensual=0;
    int cantidaddehora=0;

  system.out.println("ingrese el costo por hora: ");
  pagohora=entrada.nextFloat();
  system.out.println("ingrese la cantidad de horas trabajadas en la semana");
  cantidaddehora=entrada.nextInt();

    if (cantidaddehora>40){
      sueldomensual=40*pagohora+2*((cantidadadehora-40)*pagohora);
      system.out.println("el sueldo del trabajador es " + sueldomensual),}else if (cantidaddehora<=40){
      sueldomensual=cantidaddehora*pagohora;
      system.out.println("el sueldo del trabador es "+ sueldomensuel);}else{
      
      }
  }
}