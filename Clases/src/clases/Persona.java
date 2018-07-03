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
public class Persona {

    private String nombre;
    private String segundoNombre;
    private String apellido;
    // Si comento con las dos barras no genera docs.

    /**
     * Sexo de la persona debe ser 'F' o 'M'
     */
    private char sexo;
    private int edad;
    private String telefono;
    private Domicilio domicilio;
    
    public Persona(String nombre, String segundoNombre, String apellido, char sexo, int edad, String telefono, Domicilio domicilio){
        this.establecerNombre(nombre);
        this.establecerSegundoNombre(segundoNombre);
        this.establecerApellido(apellido);
        this.establecerSexo(sexo);
        this.establecerEdad(edad);
        this.establecerTelefono(telefono);
        this.establecerDomicilio(domicilio);
        
    }

    public final void establecerNombre(String nombre) {
        this.nombre = nombre;
       
    }

    public final void establecerSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
        
    }

    public final void establecerApellido(String apellido) {
        this.apellido = apellido;
        
    }

    public final void establecerSexo(char sexo) {

        if ((sexo != 'F') || (sexo != 'M')) {
            sexo = 'F';
            this.sexo = sexo;
            
        }
    }

    public final void establecerEdad(int edad) {

        if (edad < 0) {
            edad = 18;
            this.edad = edad;
        }else{
            this.edad = edad;
        }
    }

    public final void establecerTelefono(String telefono) {
        this.telefono = telefono;
    }

    public final void establecerDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public String obtenerSegundoNombre() {
        return this.segundoNombre;
    }

    public String obtenerApellido() {
        return this.apellido;
    }

    public char obtenerSexo() {
        return this.sexo;
    }

    public int obtenerEdad() {
        return this.edad;
    }

    public String obtenerTelefono() {
        return this.telefono;
    }

    public Domicilio obtenerDomicilio() {
        return this.domicilio;
    }
}
