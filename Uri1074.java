import java.util.Scanner;
public class Uri1074 {
    public static void main (String args[])   {

        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        int valor =0;
        for (int i=1; i<=N; i++){
            valor = teclado.nextInt();
            if (valor  ==0){
                System.out.println("NULL");
            }
            else if(valor % 2 ==0){
                System.out.print("EVEN");
            }
            else{
                System.out.print("ODD");
            }

            if (valor >0){
                System.out.println(" POSITIVE");
            }
            else if (valor <0){
                System.out.println(" NEGATIVE");
            }
        }
    }
}
