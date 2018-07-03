/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegotateti;

import java.util.Scanner;

/**
 *
 * @author CoCos'
 */
public class JuegoTaTeTi {

    /**
     * @param args the command line arguments
     */
    char array[][] = {
        {'-', '-', '-'},
        {'-', '-', '-',},
        {'-', '-', '-'},};

    public static void main(String[] args) {

        //Bienvenida
        System.out.printf("Bienvenido al juego TA TE TI\n");

        mostrar();
        ingreso();
    }

    private static void ingreso() {

        String opcion;

        Scanner entrada = new Scanner(System.in);
        opcion = entrada.nextLine();

        while () {

        }
    }

    private static void mostrar() {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {

                System.out.printf("", array[fila][columna]);
            }
        }

    }
}
