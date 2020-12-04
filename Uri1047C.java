import java.util.Scanner;

public class Uri1047C {

    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);

        int inicioH = teclado.nextInt();
        int inicioM = teclado.nextInt();
        int fimH = teclado.nextInt();
        int fimM = teclado.nextInt();
        int duracaoH, duracaoM;
        int tempoF, tempoI, duracao;

        tempoI = inicioH*60 + inicioM;
        tempoF = fimH*60 + fimM;
        duracao = tempoF - tempoI;
        
        if (duracao <=0)
        {
            duracao =duracao +  24*60;
        }

        duracaoH = duracao /60;
        duracaoM = duracao % 60;
       
        System.out.println ("O JOGO DUROU " + duracaoH + " HORA(S) E " + duracaoM + " MINUTO(S)");
    }
}