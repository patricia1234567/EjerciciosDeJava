/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorausandofunciones;

import java.util.Scanner;

/**
 *
 * @author Paty OncaCor
 */
public class CalculadoraUsandoFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float resultado = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Ingrese el primer número a operar: ");
        int num1 = entrada.nextInt();

        System.out.printf("Ingrese el segundo número a operar: ");
        int num2 = entrada.nextInt();

        System.out.printf("****** MENU ******\n");
        System.out.printf(" 1. suma\n");
        System.out.printf(" 2. resta\n");
        System.out.printf(" 3. multiplicación\n");
        System.out.printf(" 4. división\n\n");
        System.out.printf("Digite su opción: ");

        
        String opcion = entrada.nextInt();
        Scanner.

        switch (opcion) {
            case 1:
                resultado = suma(num1, num2);
                break;

            case 2:
                resultado = resta(num1, num2);
                break;

            case 3:
                resultado = multiplicacion(num1, num2);
                break;

            case 4:
                resultado = division(num1, num2);
                break;
        }
        mostrar(resultado);
    }

    private static float suma(float numero1, float numero2) {
        return (numero1 + numero2);
    }

    private static float resta(float numero1, float numero2) {
        return (numero1 - numero2);
    }

    private static float multiplicacion(float numero1, float numero2) {
        return (numero1 * numero2);
    }

    private static float division(float numero1, float numero2) {
        return (numero1 / numero2);
    }

    private static void mostrar(float result) {
        System.out.printf("El resultado es: %.2f\n\n", result);
    }

}
