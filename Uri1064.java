
import java.util.Scanner;
public class Uri1064{
    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);
        float valor=0, mediaPositivos=0;
        int totalPositivos=0;
        for (int i=1; i<=6; i++){
            valor = teclado.nextFloat();
            if (valor > 0){
                totalPositivos++;
                mediaPositivos += valor;
            }
        }
        mediaPositivos = mediaPositivos/totalPositivos;
        System.out.println(totalPositivos + " valores positivos");
        System.out.printf("%.1f%n",mediaPositivos );
        teclado.close();

    }    
}

