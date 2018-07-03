/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypares;

/**
 *
 * @author Paty OncaCor
 */
public class ArrayPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Carga de la Matriz
        int array[][] = new int[3][3];
        int contador = 0;
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                array[fila][columna] = contador;
                contador = contador + 2;
            }
        }
        //Mostrar
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.printf(" %d", array[fila][columna]);
            }
            System.out.printf(" \n");
        }
    }

}
