/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author laboratorio
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese un número: ");
        int numero1 = entrada.nextInt();
        
        System.out.println("Ingrese otro número: ");
        int numero2 = entrada.nextInt();
        
        System.out.println("***** MENU *****");
        System.out.println("s: sumar");
        System.out.println("m: multiplicar");
        System.out.println("d: dividir");
        System.out.println("r: restar");
        System.out.println("\n");
        
        System.out.println("Ingrese la opción deseada: ");
        String letra = entrada.nextLine();
        
      int resultado=0;
        
        if(letra.equals("s")){
            resultado=numero1+numero2;
        }
        
        if(letra.equals ("m")){
            resultado=numero1*numero2;
        }
        
        if(letra.equals ("d")){
            resultado=numero1/numero2;
        }
        
        if(letra.equals ("r")){
            resultado=numero1-numero2;
        }
        
        System.out.println("El resultado es: " +resultado);
        System.out.println("\n");
        
    }
    
}
