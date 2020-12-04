import java.util.Scanner;


public class Uri1043 {

    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        
        boolean eTriangulo = ((A + B)> C);

        eTriangulo  = eTriangulo && ((B+C) > A);

        eTriangulo  = eTriangulo && ((C+A) > B);


        if (eTriangulo == true){
            double perimetro = A+B+C;
            System.out.println("Perimetro = " + perimetro);            
        }
        else{
            double area  = ((A+B)*C)/2;
            System.out.println("Area = " + area);
        }

    }
}