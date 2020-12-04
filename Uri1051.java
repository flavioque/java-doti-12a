import java.util.Scanner;

public class Uri1051 {

    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);

        double salario = teclado.nextDouble();

       
        double parcelaFaixa4= salario - (double)4500;
        if (parcelaFaixa4 < 0){
            parcelaFaixa4=0;
        }
        double parcelaFaixa3 = salario - (double)3000 - parcelaFaixa4;
        if (parcelaFaixa3 < 0){
            parcelaFaixa3=0;
        }
        double parcelaFaixa2 = salario - (double)2000 - parcelaFaixa4 - parcelaFaixa3;
        if (parcelaFaixa2 < 0){
            parcelaFaixa2=0;
        }        
        double parcelaFaixa1 = salario - (double)20001 - parcelaFaixa4 - parcelaFaixa3 - parcelaFaixa2;
        if (parcelaFaixa1 < 0){
            parcelaFaixa1=0;
        }

        double imposto = parcelaFaixa4 * (double)0.28;
        imposto = imposto + parcelaFaixa3 * (double)0.18;
        imposto = imposto + parcelaFaixa2 * (double)0.08;
        imposto = imposto + parcelaFaixa1 * 0;

        if (imposto == 0){
            System.out.println("Isento");
        }
        else{
            System.out.print("R$ ");
            System.out.printf("%.2f", imposto);
        }

    }
}