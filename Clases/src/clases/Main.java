/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author CoCos'
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona personaA = new Persona("Patricia", "Marisol", "Ravera", 'F', 43, "(0351)789-6498", new Domicilio("Bv. 25 de Mayo", 2274));
        /**
         * personaA.establecerNombre("Patricia");
         * personaA.establecerSegundoNombre("Marisol");
         * personaA.establecerApellido("Ravera"); personaA.establecerSexo('F');
         * personaA.establecerEdad(43);
         * personaA.establecerTelefono("(351)789-6498");
         * personaA.establecerDomicilio("Bv. 25 de Mayo 2274");
        *
         */

        System.out.println("El primer nombre es " + personaA.obtenerNombre());
        System.out.println("El segundo nombre es " + personaA.obtenerSegundoNombre());
        System.out.println("El Apellido es " + personaA.obtenerApellido());
        System.out.println("El sexo de la persona es " + personaA.obtenerSexo());
        System.out.println("La edad de la persona es " + personaA.obtenerEdad());
        System.out.println("El teléfono de la persona es " + personaA.obtenerTelefono());
        System.out.println("El domicilio de la persona es " + personaA.obtenerDomicilio().obtenerNombre() + personaA.obtenerDomicilio().obtenerNumero());

    }

}
