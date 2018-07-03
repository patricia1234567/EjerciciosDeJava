/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tateti;

/**
 *
 * @author Paty OncaCor
 */
public class TaTeTi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //DECLARANDO LOS VALORES PREDETERMINADOS
       //carga de la matriz
        int array[][] = {
            {9, 8, 7},
            {6, 5, 4,},
            {3, 2, 1},};

        //mostrar
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                int numero = array[fila][columna];
                System.out.printf(" Fila %d, Columna %d = %d\n", +fila, +columna, +numero);
            }
        }
    }
}
