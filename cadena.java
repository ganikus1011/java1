/*Un String que diga el saludo inicial "Bienvenidos al curso" */
import java.util.Scanner;
public class cadena {
    public static void main(String[] args){
            {
             Scanner sc = new Scanner (System.in);
             System.out.print("Digite por favor su nombre: ");
             String nombre = sc.nextLine();
             System.out.print("Digte por favor su apellido: ");
             String apellido = sc.nextLine();
             System.out.print("Su nombre completo es: " + nombre +" "+ apellido);
   
            }

    }
    
}