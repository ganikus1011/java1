/*Un String que diga el saludo inicial "Bienvenidos al curso" */
import java.util.Scanner;
public class ejemplo3 {
    public static void main(String[] args){
            {
             Scanner s = new Scanner (System.in);
             String cadena;
             int edad;
             System.out.println("Ingresa tu nombre: ");
             cadena = s.nextLine();
             System.out.println("Ingresa tu edad:");
             edad = s.nextInt();
             System.out.println("mi nombre es: "+cadena+" y mi edad es: "+ edad);           
             s.close();               
            }

    }
    
}