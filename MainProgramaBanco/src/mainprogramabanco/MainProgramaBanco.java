/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprogramabanco;

import java.util.Scanner;

/**
 *
 * @author CoCos'
 */
public class MainProgramaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear objeto cliente
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = entrada.next();

        System.out.println("Ingrese el apellido del cliente: ");
        String apellido = entrada.next();

        System.out.println("Ingrese el DNI del cliente: ");
        int dni = entrada.nextInt();

    }

    //crear objeto caja de ahorro
    private static CajaAhorro crearCajaAhorro() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el monto (-1 para defecto): ");
        double montoIngresadoUsuario = entrada.nextDouble();

        if (montoIngresadoUsuario == -1) {
            CajaAhorro = new CajaAhorro();

            CajaAhorro cajaAhorro = new CajaAhorro();
        } else {
            CajaAhorro cajaAhorro = new CajaAhorro(montoIngresadoUsuario);
        }
        return CajaAhorro;
    }

    //Establecer la relacion entre los objetos
    cliente1.setCajaAhorro (cajaAhorro);
}

private static void mostrarInteres(Cliente cliente, int cantDias, float interes){
        System.out.println("Interés: " + interes);
    }
    
}
