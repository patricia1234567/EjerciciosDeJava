/*
7.19 
(Sistema de reservaciones de una aerolínea) Una pequeña aerolínea acaba de comprar 
una computadora para su nuevo sistema de reservaciones automatizado. 
Se le ha pedido a usted que desarrolle el nuevo sistema. 
Usted escribirá una aplicación para asignar asientos en cada vuelo del único avión
de la aerolínea (capacidad: 10 asientos). Su aplicación debe mostrar las siguientes 
alternativas: Por favor escriba 1 para Primera Clase y Por favor escriba 2 para Economico. 
Si el usuario escribe 1, su aplicación debe asignarle un asiento en la sección de primera 
clase (asientos 1 a 5). Si el usuario escribe 2, su aplicación debe asignarle un asiento 
en la sección económica (asientos 6 a 10). Su aplicación deberá entonces imprimir un pase 
de abordaje, indicando el número de asiento de la persona y si se encuentra en la sección 
de primera clase o clase económica del avión. Use un arreglo unidimensional del tipo 
primitivo boolean para representar la tabla de asientos del avión. 
Inicialice todos los elementos del arreglo con false para indicar que todos los asientos 
están vacíos. A medida que se asigne cada asiento, establezca los elementos correspondientes 
del arreglo en true para indicar que ese asiento ya no está disponible. 
Su aplicación nunca deberá asignar un asiento que ya haya sido asignado. 
Cuando esté llena la sección económica, su programa deberá preguntar a la persona si 
acepta ser colocada en la sección de primera clase (y viceversa). 
Si la persona acepta, haga la asignación de asiento apropiada. 
Si no acepta, imprima el mensaje "El proximo vuelo sale en 3 horas".
 */
package ejercicio719pag311avion;

import java.util.Scanner;

/**
 *
 * @author Paty OncaCor
 */
public class Ejercicio719Pag311Avion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean primera[] = new boolean[4];
        boolean economica[] = new boolean[4];
        int asientoPrimera = 0, asientoEconomica = 0, opcion = 0, asignadoPrimera = 0, opcion1 = 0, asignadoEconomica = 0;

        do {
            System.out.printf("******** MENU *********\n");
            System.out.printf("\t Presione: \n");
            System.out.printf(" 1. Primera Clase\n");
            System.out.printf(" 2. Clase Económica\n");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                if (asignadoPrimera < 5) {
                    primera[asientoPrimera] = true;
                    asientoPrimera++;
                } else {
                    System.out.printf("Primera clase se encuentra llena.\nDesea pasarse a Clase económica?\n 1. Si\n2. No\nSu opción: ");
                    opcion1 = entrada.nextInt();
                    if (opcion1==1) {
                        economica[asientoEconomica] = true;
                        asientoEconomica++;
                    }
                }
                if (opcion == 2) {
                    economica[asientoEconomica] = true;
                    asignadoEconomica++;
                }
            }
            while ((opcion != 1) && (opcion != 2));

        }
    
    
    }
