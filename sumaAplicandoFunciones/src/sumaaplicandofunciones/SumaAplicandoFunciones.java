/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaaplicandofunciones;

import java.util.Scanner;

/**
 *
 * @author Paty OncaCor
 */
public class SumaAplicandoFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero1 = ingresarNumero1();
        int numero2 = ingresarNumero2();
        int suma = sumarNumeros(numero1, numero2);

        System.out.printf("\nLa suma de los dos números es: %d\n\n", +suma);
    }

    private static int ingresarNumero1() {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Ingrese el primer número de la suma: ");
        int num = entrada.nextInt();
        return (num);
    }

    private static int ingresarNumero2() {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Ingrese el segundo número de la suma: ");
        int num = entrada.nextInt();
        return (num);
    }

    private static int sumarNumeros(int num1, int num2) {
        int numerosSumados = num1 + num2;
        return (numerosSumados);
    }

}
