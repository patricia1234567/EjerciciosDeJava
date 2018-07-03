/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

import javax.swing.JOptionPane;

public class Promedio {
    public static void main(String[]args){
int cantNota=0;
int aprobados=0;
int desaprobados=0;
int cantAlumnos=0;
float sumaNotas=0;
float promedio=0;


while(cantNota<10){
    cantNota++;
    
    String nota = JOptionPane.showInputDialog("Introduce la nota: ");
    cantAlumnos++;
    sumaNotas=sumaNotas+Integer.valueOf(nota);
    
    if(Integer.valueOf(nota)>5){
        aprobados++;
    }else{
        desaprobados++;
    } 
}
promedio=sumaNotas/cantAlumnos;
JOptionPane.showMessageDialog(null, "Cantidad de Aprobados: \n"+aprobados);
    JOptionPane.showMessageDialog(null, "Cantidad de Desaprobados: "+desaprobados);
    JOptionPane.showMessageDialog(null, "Promedio de notas: "+promedio);
}
}
    
