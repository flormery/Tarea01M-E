package pe.edu.upeu.mefll;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Scanner lt=new Scanner(System.in);
        int n;
        System.out.println("Ingrese el numero de algoritmo(2-5):");
        n=lt.nextInt();
        switch (n) {
            case 2: new ResolucionExamen().ExamenMEFLL02(); break;
            case 3: new ResolucionExamen().ExamenMEFLL03(); break;
            case 4: new ResolucionExamen().ExamenMEFLL04(); break;
            case 5: new ResolucionExamen().ExamenMEFLL05(); break;
            default: System.err.println("Esa opcion no existe"); break;
        }
    }
}
