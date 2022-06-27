package pe.edu.upeu.arrys;

public class Matrices {
    public void matricesFBasicos() {
        int notas[][];//declarar una matriz
        int [][]notasx;
        notas=new int[2][2];//tamanho/dimension
        notas[0][0]=20;//colocando valores en la matriz
        notas[0][1]=18;
        notas[1][0]=16;
        notas[1][1]=10;
        System.out.println(notas[1][1]);//mostrar nota
        System.out.println("cant filas:"+notas.length);//cantidad filas
        System.out.println("cant columnas:"+notas[0].length);//cantidad columnas

        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[0].length; c++) {
                System.err.print(notas[f][c]+"\t");
                
            }
            System.out.println("");
        }
            
        
        
    }
    
    public void matricesX() {
        int notas[][] ={
                        {28,18},
                        {16,10}

                    };
        notas[1][1]=15;
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[0].length; c++) {
                System.err.print(notas[f][c]+"\t");
                
            }
            System.out.println("");
        }    
        
    }



        
    


    public static void main(String[] args) {
        //new Matrices().matricesFBasicos();
        new Matrices().matricesX();
}
}
