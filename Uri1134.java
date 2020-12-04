import java.util.Scanner;
public class Uri1134{
    public static void main (String args[]){
        int escolha=0;
        Scanner teclado = new Scanner(System.in);
        int diesel=0, gasolina=0, alcool=0;
        do{
            escolha = teclado.nextInt();
            switch (escolha){
                case 1: alcool++;break;
                case 2: gasolina++;break;
                case 3: diesel++; break;
            }
        }while(escolha !=4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}