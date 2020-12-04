import java.util.Scanner;
public class Uri1144 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        for (int i=1; i<=N;i++){ 
            //for (int j=1 ; j<=2; j++){                      
            System.out.println( i + " " +(i*i) + " " + i* i*i);
            System.out.println( i + " " + (i*i+1) + " " + (i*i*i+1));
            //}
        }
    }
}
