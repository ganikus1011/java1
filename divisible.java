/*Leer un número por teclado y que diga si es divisible por 2; si no lo es que también lo indica*/
import java.util.Scanner;
public class divisible {
    public static void main(String[] args){
            {
             Scanner sc = new Scanner (System.in);
             System.out.print("Por favor digite el núemro: ");
             int numero = sc.nextInt();
             if (numero % 2 == 0)
                {
                    System.out.print("El número "+ numero+ " es divisible por 2");  
                }
                    else{
                        System.out.print("El número "+ numero+ " NO es divisible por 2");
                    }

                
            }

    }
    
}
