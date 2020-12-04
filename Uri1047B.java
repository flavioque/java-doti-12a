import java.util.Scanner;

public class Uri1047B {

    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);

        int inicioH = teclado.nextInt();
        int inicioM = teclado.nextInt();
        int fimH = teclado.nextInt();
        int fimM = teclado.nextInt();
        int duracaoH, duracaoM;

        
        if (inicioH >= fimH){
            duracaoM = ((fimH + 24)*60 - inicioH*60) ;            
        }
        else {
            duracaoM = fimH*60  - inicioH*60;
        }
        duracaoM = duracaoM+ fimM - inicioM;
 
        duracaoH = duracaoM /60;
        duracaoM = duracaoM % 60;

        if (duracaoH ==0 && duracaoM==0){
            duracaoM = 1;
        }

        if (duracaoH >=24 && duracaoM>=0){
            duracaoM = 0;
            duracaoH = 24;
        }

        System.out.println ("O JOGO DUROU " + duracaoH + " HORA(S) E " + duracaoM + " MINUTO(S)");
    }
}