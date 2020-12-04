import java.util.Scanner;
public class Uri1066 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int pares=0,impares=0,positivos=0,negativos=0;
        for (int i=1; i<=5;i++){
            int valor = teclado.nextInt();
            if (valor %2==0){
                pares++;
            }
            else{
                impares++;
            }
            if (valor >0){
                positivos++;
            }
            else if (valor < 0){
                negativos++;
            }
        }
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");


    }
    
}
