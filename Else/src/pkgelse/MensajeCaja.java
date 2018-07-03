
package pkgelse;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MensajeCaja {
    public static void main(String[]args){
        
        Scanner entrada=new Scanner(System.in);
        
        int resultado=0;
        
        do{
        
        String numero=JOptionPane.showInputDialog("Ingrese un número: ");
        int numero1=Integer.valueOf(numero);
            
            resultado=resultado+numero1;
    }while(resultado<30);
        
        System.out.println("La suma de todos los números es: "+resultado);
    }
}

    

        
        