import java.util.Scanner;

public class Uri1047 {

    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);

        int inicioH = teclado.nextInt();
        int inicioM = teclado.nextInt();
        int fimH = teclado.nextInt();
        int fimM = teclado.nextInt();
        int duracaoH, duracaoM;

        if (inicioM>=60 || fimM >=60 || inicioM<1 || fimM <1 || inicioH>24 || fimH > 24 ){
            System.exit(0);
        }

        if (inicioH >= fimH){
            duracaoH = ((fimH + 24) - inicioH);
        }
        else {
            duracaoH = fimH - inicioH;
        }

        if (fimM >= inicioM){
            duracaoM = fimM - inicioM;            
        }
        else{
            duracaoH= duracaoH-1;
            duracaoM = (60+fimM)-inicioM;
        }

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