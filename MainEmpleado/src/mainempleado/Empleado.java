/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainempleado;

/**
 *
 * @author CoCos'
 */
public class Empleado {

    private int salario;
    private String nombre;
    private String apellido;
    private FechaIngreso fechaIngreso;

    public Empleado(int salario, String nombre, String apellido, FechaIngreso fechaIngreso) {
        this.establecerSalario(salario);
        this.establecerNombre(nombre);
        this.establecerApellido(apellido);
        this.establecerFechaIngreso(fechaIngreso);

    }

    public final void establecerSalario(int salario) {
        this.salario = salario;

    }

    public final void establecerNombre(String nombre) {
        this.nombre = nombre;

    }

    public final void establecerApellido(String apellido) {
        this.apellido = apellido;

    }

    public final void establecerFechaIngreso(FechaIngreso fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int obtenerSalario() {
        return this.salario;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public String obtenerApellido() {
        return this.apellido;
    }

    public FechaIngreso obtenerFechaIngreso() {
        return this.fechaIngreso;
    }

}
