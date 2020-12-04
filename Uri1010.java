import java.util.Scanner;

public class Uri1010 {

    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);

        String entrada1 = teclado.nextLine();
        String entrada2 = teclado.nextLine();
        int qtdPeca1 =  Integer.parseInt(entrada1.split(" ")[1]);
        double valorPeca1 =  Double.parseDouble(entrada1.split(" ")[2]);

        int qtdPeca2 =  Integer.parseInt(entrada2.split(" ")[1]);
        double valorPeca2 =  Double.parseDouble(entrada2.split(" ")[2]);      

        double valorTotal = ((qtdPeca1*valorPeca1)+ (qtdPeca2*valorPeca2)) ;
        

        System.out.print("VALOR A PAGAR: R$ " );
        System.out.printf("%.2f",valorTotal);
        System.out.println();
       
    }
}