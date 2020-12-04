import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        boolean match = false;
        do{
            int senha = teclado.nextInt();
            if (senha == 2002){
                match = true;
                System.out.println("Acesso permitido");
            }
            else{
                System.out.println("Senha Invalida");
            }
        }while (match !=true);
        teclado.close();
    }
}
