/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysumaanterior;

/**
 *
 * @author Paty OncaCor
 */
public class ArraySumaAnterior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[][] = new int[3][3];

        //Carga Matriz
        int antesDelAnterior = array[0][0];
        int anterior = array[0][1];
        int actual = antesDelAnterior + anterior;
        actual = array[0][2];

        for (int fila = 1; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                int suma = antesDelAnterior + anterior;
                antesDelAnterior = array[fila][columna - 1];
                anterior = array[fila][columna];
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
