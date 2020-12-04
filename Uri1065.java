import java.util.Scanner;

public class Uri1065{
    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);
        int totalPares=0;
        for (int i=1; i<=5;i++){
            int valor = teclado.nextInt();
            if (valor % 2 ==0){
                totalPares ++;
            }
        }
        System.out.println (totalPares + " valores pares");
    }
}