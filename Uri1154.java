import java.util.Scanner;
public class Uri1154 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);        
        float media = 0;
        int idade=0;
        int entradas =0;
        do{

            idade = teclado.nextInt();
            if (idade >=0){
                media += idade;            
                entradas++;
            }

        }while ( idade >= 0);
        media = media / entradas;
        System.out.printf("%.2f%n",media);
    }
    
}
