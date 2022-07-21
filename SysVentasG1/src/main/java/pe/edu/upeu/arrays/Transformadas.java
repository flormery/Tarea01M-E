package pe.edu.upeu.arrays;

import java.util.Scanner;

import pe.edu.upeu.util.LeerTeclado;
public class Transformadas {
    Scanner cs=new Scanner(System.in);

    public void transformada01() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor=cs.nextInt();            
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                if(c<dimension-f){
                    matriz[f][c]=String.valueOf(valor+(f+c)*(f+c+1)/2 + f);
                }                
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformada17() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension=cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor=cs.nextInt();            
        String[][] matriz=new String[dimension][dimension];   
        for (int c = matriz[0].length-1; c >=0 ; c--) {
            for (int f =0 ; f < matriz.length-((dimension-1)-c); f++) {               
                matriz[f][c]=String.valueOf(valor);
                valor++;
            }
        }        
        imprimirMatriz(matriz);
    }
    public void transformada21() {
       String[][] matriz;
       System.out.println("Ingrese la dimension de la Matriz:");
       int dimension=cs.nextInt();//5
       System.out.println("");
       int valor=0;
       matriz=new String[dimension][dimension];
       for (int columna = 0; columna < matriz[0].length; columna++) {
           if(columna%2==0){
                for (int fila = 0; fila < matriz.length; fila++) {
                    matriz[fila][columna]=String.valueOf(valor);
                    valor=valor+1;
                }
           }else{
               for (int fila = matriz.length-1; fila >= 0; fila--) {
                    matriz[fila][columna]=String.valueOf(valor);
                    valor=valor+1;
               }
           }
       }
       imprimirMatriz(matriz);
    }

    public void transformada29() {
        String[][] matriz;
        System.out.println("Ingrese la dimension de la Matriz:");
        int dimension=cs.nextInt();//5
        System.out.println("");
        int valor=0;
        matriz=new String[dimension][dimension];         
        for (int v = 0; v < dimension/2; v++) {
            for (int ls = v; ls < dimension-1-v; ls++) {
                matriz[v][ls]=String.valueOf(valor);
                valor++;
            }
            for (int ld = v; ld < dimension-1-v; ld++) {
                matriz[ld][dimension-1-v]=String.valueOf(valor);
                valor++;
            }
            for (int lin = dimension-1-v; lin > v; lin--) {
                matriz[dimension-1-v][lin]=String.valueOf(valor);
                valor++;
            }
            for (int liz =dimension-1-v; liz > v; liz--) {
                matriz[liz][v]=String.valueOf(valor);
                valor++;
            }            
        }
        if (dimension%2!=0) {
            matriz[dimension/2][dimension/2]=String.valueOf(valor);
        }
        imprimirMatriz(matriz);

    }
    public void matriz05MEFLL() {
        System.out.println("Ingrese la dimesion de Matriz:");
        int dimension =cs.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor =cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <= f; c++) {
                matriz[f][(dimension - 1) - c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void matriz06MEFLL() {
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        String[][] matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <= f; c++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void matriz07MEFLL() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c <= (matriz.length - 1) - f; c++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void matriz08MEFLL() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = f; c < matriz[f].length; c++) {
                matriz[f][c] = String.valueOf(valor); 
                valor++;        
            }          
        }
        imprimirMatriz(matriz);
    }
    public void matriz12MEFLL() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial");
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = matriz[fila].length-1; columna >= fila; columna--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }          
        }
        imprimirMatriz(matriz);
    }
    public void matriz13MEFLL() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int c = 0; c < matriz.length; c++) {
            for (int f = 0; f <= (matriz.length - 1) - c; f++) {
                matriz[f][c] = String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
    public void matriz19MEFLL() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial");
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila >= 0; fila--) {
            for (int columna = matriz[fila].length-1; columna >= fila; columna--) {
                matriz[columna][fila] = String.valueOf(valor); 
                valor=valor+1;        
            }          
        }
        imprimirMatriz(matriz);
    }
    public void matriz20MEFLL() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = matriz[0].length - 1; fila >= 0; fila--) {
            for (int columna = matriz[fila].length-1; columna >= fila; columna--) {
                matriz[columna][fila] = String.valueOf(valor); 
                valor=valor+1;        
            }          
        }
        imprimirMatriz(matriz);
    }
    public void matriz22MEFLL() {
        String[][] matriz;
       System.out.println("Ingrese la dimension de la Matriz:");
       int dimension=cs.nextInt();
       System.out.println("Ingrese el valor inicial");
       int valor=0;
       matriz=new String[dimension][dimension];
       for (int columna = 0; columna < matriz[0].length; columna++) {
        if(columna%2==0){
            for (int fila = matriz.length-1; fila >= 0; fila--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
           }
        }else{
            for (int fila = 0; fila < matriz.length; fila++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }
    }
       imprimirMatriz(matriz);
    }
    public void matriz23MEFLL() {
        String[][] matriz;
    System.out.println("Ingrese la dimension de la Matriz:");
    int dimension=cs.nextInt();
    System.out.println("Ingrese el valor inicial");
    int valor=cs.nextInt();
    matriz=new String[dimension][dimension];
    for ( int columna = 0; columna < matriz.length; columna++) {
        if(columna%2==0){
            for (int fila = matriz.length-1; fila >=0; fila--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
            }else{
            for (int fila = 0; fila < matriz.length; fila++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }
    }
    imprimirMatriz(matriz);
    }
    public void matriz24MEFLL() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int columna = matriz[0].length - 1; columna >= 0; columna--) {
            if (columna%2== 0) {
                for (int fila = matriz.length - 1; fila >= 0; fila--) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor+1;
                }
            } else {
                for (int fila = 0; fila < matriz.length; fila++) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor = valor+1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
    public void matriz25MEFLL() {
        String[][] matriz;
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            if (f % 2 == 0) {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int c = matriz.length - 1; c >= 0; c--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }

    public void matriz26MEFLL() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese valor inicial:");
        int valor = cs.nextInt();
        matriz = new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            if (f % 2 == 0) {
                for (int c = matriz.length - 1; c >= 0; c--) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            } else {
                for (int c = 0; c < matriz.length; c++) {
                    matriz[f][c] = String.valueOf(valor);
                    valor = valor + 1;
                }
            }

        }
        imprimirMatriz(matriz);
    }
    public void matriz27MEFLL() {
        System.out.println("Ingrese la dimesion de la Matriz:");
        int dimension = cs.nextInt();
        System.out.println("Ingrese el valor inicial");
        int valor =0;
        String[][] matriz = new String[dimension][dimension];
        for (int fila =matriz.length - 1; fila >= 0; fila--) {
            if (fila % 2 == 0) {
                for (int columna = matriz.length - 1; columna >= 0; columna--) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor=valor+1;
                }
            } else {
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna] =String.valueOf(valor);
                    valor=valor+1;
                }
            }
        }
        imprimirMatriz(matriz);
    }




    public void imprimirMatriz(String[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                if(m[f][c]==null){
                    System.out.print("\t");
                }else{
                    System.out.print(m[f][c]+"\t");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //new Transformadas().transformada01();
        //new Transformadas().transformada29();
        //new Transformadas().matriz05MEFLL();
        //new Transformadas().matriz26MEFLL();
        new Transformadas().matriz27MEFLL();
    }

}