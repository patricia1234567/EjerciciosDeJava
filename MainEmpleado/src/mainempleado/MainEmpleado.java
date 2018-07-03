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
public class MainEmpleado {

    public static void main(String[] args) {
        // TODO code application logic here

        Empleado empleado1 = new Empleado(15000, "Patricia", "Ravera", new FechaIngreso(16, 11, 2000));

        System.out.println("El salario del empleado es " + empleado1.obtenerSalario());
        System.out.println("El nombre es " + empleado1.obtenerNombre());
        System.out.println("El Apellido es " + empleado1.obtenerApellido());
        System.out.println("La fecha de ingreso del empleado es " + empleado1.obtenerFechaIngreso().obtenerDia() + empleado1.obtenerFechaIngreso().obtenerMes() + empleado1.obtenerFechaIngreso().obtenerAño());
    }
}
