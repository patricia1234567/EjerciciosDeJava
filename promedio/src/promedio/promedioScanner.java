
package promedio;

import java.util.Scanner;

public class promedioScanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota = 0;
        int contador = 1;
        float sumaNotas = 0;
        int aprobados = 0;
        int desaprobados = 0;
        float promedio = 0;

        while (true) {  // true continua solo si la condición es verdadera.
            System.out.printf("Ingrese la nota %d: ", contador);
            nota = entrada.nextInt();

            if (nota == 0) {
                break; // finaliza acción si se cumple la condición
            } else {
                if (nota <= 0 || nota > 10) {
                    System.out.println("Nota Inválida");
                    continue; // continua solo si la condición se cumple, si no la salta.
                }

                sumaNotas += nota;
                contador++;

                if (nota > 5) {
                    aprobados++;

                } else {
                    desaprobados++;
                }
            }
        }
        if (contador != 1) { // este if está solamente para que no muestre promedio si ha ingresado la opción 0 al comienzo.
            promedio = sumaNotas / (aprobados + desaprobados);

            System.out.printf("\nCantidad de aprobados: %d\n", aprobados);
            System.out.printf("Cantidad de desaprobados: %d\n", desaprobados);
            System.out.printf("Promedio de notas: %.2f\n", promedio);
        } else {
            System.out.printf("\n*******Gracias por utilizar nuestro software!!*****\n\n");
        }
    }
}
