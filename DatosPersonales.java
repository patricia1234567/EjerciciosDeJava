package datos.personales;
import java.util.Scanner;

public class DatosPersonales {
    public static void main(String[] args) {
               
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Nombre: ");
        String Nombre=entrada.nextLine();
        
        System.out.println("Apellido: ");
        String Apellido=entrada.nextLine();
        
        System.out.println("Edad: ");
        String Edad=entrada.nextLine();
        
        System.out.println("email: ");
        String email=entrada.nextLine();
        
        System.out.println("Nombre: "+Nombre);
        System.out.println("Apellido: "+Apellido);
        System.out.println("Edad: "+Edad);
        System.out.println("email: "+email);
        System.out.println("\n");
    }  
}
