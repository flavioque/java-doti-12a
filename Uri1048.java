import java.util.Scanner;

public class Uri1048 {

    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);

        double salario = teclado.nextDouble();
        if (salario >=0 && salario <= 400){
            double novoSalario = salario * (double)1.15 ;
            System.out.print ("Novo salario: ");
            System.out.printf("%.2f", + novoSalario);
            System.out.println();            
            System.out.print ("Reajuste ganho: ");
            System.out.printf("%.2f",  (novoSalario - salario));
            System.out.println();
            System.out.println ("Em percentual: 15 %");
        }
        else  if (salario > 400 && salario <= 800){
            double novoSalario = salario * (double)1.12 ;
            System.out.print ("Novo salario: ");
            System.out.printf("%.2f", + novoSalario);
            System.out.println();            
            System.out.print ("Reajuste ganho: ");
            System.out.printf("%.2f",  (novoSalario - salario));
            System.out.println();
            System.out.println ("Em percentual: 12 %");
        }
        else  if (salario > 800 && salario <= 1200){
            double novoSalario = salario * (double)1.10 ;
            System.out.print ("Novo salario: ");
            System.out.printf("%.2f", + novoSalario);
            System.out.println();            
            System.out.print ("Reajuste ganho: ");
            System.out.printf("%.2f",  (novoSalario - salario));
            System.out.println();
            System.out.println ("Em percentual: 10 %");
        }
        else  if (salario > 1200 && salario <= 2000){
            double novoSalario = salario * (double)1.07 ;
            System.out.print ("Novo salario: ");
            System.out.printf("%.2f", + novoSalario);
            System.out.println();            
            System.out.print ("Reajuste ganho: ");
            System.out.printf("%.2f",  (novoSalario - salario));
            System.out.println();
            System.out.println ("Em percentual: 7 %");
        }
        else {
            double novoSalario = salario * (double)1.04 ;
            System.out.print ("Novo salario: ");
            System.out.printf("%.2f", + novoSalario);
            System.out.println();            
            System.out.print ("Reajuste ganho: ");
            System.out.printf("%.2f",  (novoSalario - salario));
            System.out.println();
            System.out.println ("Em percentual: 4 %");
        }
    }
}