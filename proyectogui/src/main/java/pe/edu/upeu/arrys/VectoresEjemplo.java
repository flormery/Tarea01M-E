package pe.edu.upeu.arrys;

import pe.edu.upeu.modelo.Persona;

public class VectoresEjemplo {
    public void vectores() {
        int edades[]=new int[12];
        edades=new int[12];
        edades[0]=20;
        edades[1]=18;
        edades[11]=30;
        System.out.println("Edades:");
        System.out.println("Indice 0:"+edades[0]);
        System.out.println("Indice 11:"+edades[11]);
        //forma dos
        System.out.println("forma dos");
        int edadesX[]={20,18,30, 40, 16};
        System.out.println(edadesX.length);
        System.out.println("indice 0:"+edadesX[0]);
        System.out.println("indice 4:"+edadesX[4]);
        
    }
    public void vectorialobjetos() {
    
        
    }

    public static void main(String[] args) {
        VectoresEjemplo objx=new VectoresEjemplo();
        objx.vectores();

    }
}
