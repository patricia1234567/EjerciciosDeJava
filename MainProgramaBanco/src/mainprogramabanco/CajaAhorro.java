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
public class CajaAhorro {

    private float monto;
    
    // Crear funcion vacia para que devuelva 100 si no ingresa nada
    public CajaAhorro(){
        this.monto = 100;
    }

    //Por si ingresamos el monto
    public CajaAhorro(float monto) {
        this.monto = monto;
    }

    //SET
    public void setMonto(float monto) {
        this.monto = monto;
    }

    //GET
    public float getMonto() {
        return monto;
    }
    
    //Crear funciones de Cálculo de interés
    public double calcularInteres(int CantDias){
       return calcularInteres(CantDias, 20); //reuso función con tasa interés 20
    }
    
    public double calcularInteres(int CantDias, double tasaInteres) {
        return this.monto * (CantDias/365.0) * (tasaInteres /100);
    }
}
