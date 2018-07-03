/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Paty OncaCor
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[][] = new int[3][3];

        int antesAnterior = array[0][0] = 0;
        int anterior = array[0][1] = 1;

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if ((fila == 0) && ((columna == 0) || (columna == 1))) {
                    continue;
                }
                array[fila][columna] = antesAnterior + anterior;
                antesAnterior = anterior;
                anterior = array[fila][columna];
            }
        }
        //Mostrar
        for(int fila=0; fila<3; fila++){
            for (int columna=0; columna<3; columna++){
                System.out.printf(" %d", +array[fila][columna]);
            }
            System.out.printf(" \n");
        }
    }
}
