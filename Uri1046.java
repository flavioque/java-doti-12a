import java.util.Scanner;

public class Uri1046 {

    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);

        int inicio = teclado.nextInt();
        int fim = teclado.nextInt();
        int duracao;

        if (inicio >= fim){
            duracao = ((fim + 24) - inicio);
        }
        else {
            duracao = fim - inicio;
        }
        System.out.println ("O JOGO DUROU " + duracao + " HORA(S)");
    }
}