import java.util.Scanner;

public class Uri1051B {

    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);

        double salario = teclado.nextDouble();
        double imposto;
        
        if (salario <= 2000){
            System.out.println("Isento");
        }
        else if (salario <=3000){
            imposto = (salario -2000) * 0.08 ;            
            System.out.printf ("R$ %.2f%n",imposto);
        }
        else if (salario <=4500){
            imposto = (salario -3000) * 0.18 +  80;  
            System.out.printf("R$ %.2f%n", imposto);
        }
        else{
            imposto = (salario - 4500)*0.28+270+80;
            System.out.printf("R$ %.2f%n",imposto);
        }

    }
}