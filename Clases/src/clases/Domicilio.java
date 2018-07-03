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
public class Domicilio {

    private String nombreCalle;
    private int numero;

    public Domicilio(String nombreCalle, int numero) {
        this.nombreCalle = nombreCalle;
        this.numero = numero;
    }

    public void establecerNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public void establecerNumero(int numero) {
        this.numero = numero;
    }

    public String obtenerNombreCalle() {
        return nombreCalle;
    }

    public int obtenerNumero() {
        return numero;
    }
    public String obtenerNombre()
    {
        return this.nombreCalle;
    }
   

}
