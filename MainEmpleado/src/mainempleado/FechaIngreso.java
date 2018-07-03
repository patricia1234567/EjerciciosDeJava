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
public class FechaIngreso {

    private int dia;
    private int mes;
    private int año;

    public FechaIngreso(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void establecerDia(int dia) {
        this.dia = dia;
    }

    public void establecerMes(int mes) {
        this.mes = mes;
    }

    public void establecerAño(int año) {
        this.año = año;
    }

    public int obtenerDia() {
        return dia;
    }

    public int obtenerMes() {
        return mes;
    }

    public int obtenerAño() {
        return this.año;
    }

}
