import java.util.Scanner;

public class Uri1005 {

    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double MEDIA = ((A * 3.5) + (B*7.5))/11;

        System.out.print("MEDIA = " );
        System.out.printf("%.5f",MEDIA);
    }
}