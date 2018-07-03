/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprogramabanco;

/**
 *
 * @author CoCos'
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    
    //También creamos un constructor
    private CajaAhorro cajaAhorro;

public Cliente (String nombre, String apellido, int dni) {
    this.setNombre(nombre);
    this.setApellido(apellido);
    this.setDni(dni);
} 

//  SET
public final void setNombre(String nombre){
    this.nombre = nombre;
}
public final void setApellido(String apellido){
    this.apellido = apellido;
}
public final void setDni (int dni){
    this.dni = dni;
}

public final void setCajaAhorro(CajaAhorro cajaAhorro){
    this.cajaAhorro = cajaAhorro;
}

// get

public String getNombre(){
    return this.nombre;
}
public String getApellido(){
    return this.apellido;
}
public int getDni(){
    return this.dni;
}
}
