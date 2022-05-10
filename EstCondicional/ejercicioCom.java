import java.util.Scanner;

public class ejercicioCom {

    public void alumno() {
     System.out.println("Enseñar");
   }
    public void profesor() {
     System.out.println("Aprender o estudiar");
   }
    public static void maquinaPC(){
       System.out.println("Procesa información");
    }

    public static void proyector() {
      System.out.println("Procesa imagenes");
    }

  public static void main(String[] args) {
    ejercicioCom obj=new ejercicioCom ();
    Scanner lt=new Scanner(System.in);
    System.out.println("Ingrese el numero de algoritmo:\n1=alumno"+
    "\n2=profesor\n3=maquinaPc\n4=proyector");
   int opcionMet=lt.nextInt();

    switch (opcionMet) {
      case 1: obj.profesor(); break;
      case 2: obj.alumno(); break;
      case 3: maquinaPC(); break;
      case 4: proyector(); break;
      default: System.err.println("Esa opcion no existe"); break;
    }
    
 }
}
