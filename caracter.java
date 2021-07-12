import java.util.Scanner;
public class caracter
{
     public static void main(String[] args) {
       var sc = new Scanner(System.in); 
       System.out.print("Digite por favor el número ");
       int cifra = sc.nextInt();
       int digitos = cifras(cifra);
       System.out.print("El número tiene: "+ cifra +" tiene "+digitos+ " cifras");
    }
    public static int cifras(int numero){
        int tama;
        tama = 1; 
        while (numero>=10)
        {
         numero = (numero / 10);
         tama ++;
        }
     return tama;
    }
}