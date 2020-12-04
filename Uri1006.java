import java.util.Scanner;

public class Uri1006 {

    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        double MEDIA = ((A * 2) + (B*3)+ (C*5))/10;

        System.out.print("MEDIA = " );
        System.out.printf("%.1f",MEDIA);
        System.out.println();
    }
}