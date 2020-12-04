import java.util.Scanner;
public class Leituras {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Por favor, digite um valor inteiro:");
        int a= teclado.nextInt();
        System.out.println ("Você digitou " + a);

        System.out.println("Agora digite um valor double");
        double b = teclado.nextDouble();
        System.out.println("Você digitou " + b);

        System.out.println("Agora digite um valor double");
        double c = teclado.nextDouble();
        System.out.println("Você digitou " + c);
    }
}
