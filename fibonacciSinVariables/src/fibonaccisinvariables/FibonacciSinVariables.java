/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccisinvariables;

/**
 *
 * @author Paty OncaCor
 */
public class FibonacciSinVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[][] = new int[3][3];

        array[0][0] = 0;
        array[0][1] = 1;

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if ((fila == 0) && ((columna == 0) || (columna == 1))) {
                    continue;
                }

                if (columna == 0) {
                    array[fila][columna] = array[fila - 1][columna + 1] + array[fila - 1][columna + 2];
                }
                if (columna == 1) {
                    array[fila][columna] = array[fila][columna - 1] + array[fila - 1][columna + 1];
                }
                if (columna == 2) {
                    array[fila][columna] = array[fila][columna - 1] + array[fila][columna - 2];
                }
            }
        }
        // Mostrar
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.printf(" %d", +array[fila][columna]);
            }
            System.out.printf(" \n");
        }
    }

}
