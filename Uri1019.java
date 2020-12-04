import java.util.Scanner;

public class Uri1019 {

    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);

        int totalSegundos = teclado.nextInt();
        int horas = totalSegundos /3600;
        int minutos = (totalSegundos  % 3600) / 60;
        int segundos = (totalSegundos  % 3600) % 60; ;
        System.out.println( horas +":" + minutos + ":" + segundos);
        

       
    }
}