import java.util.Scanner;
public class Uri1142 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        int contador = 1;
        for (int i=1; i<=N;i++){
                for (int j=1; j<=3;j++){
                    System.out.print(contador + " "); 
                    contador ++;                   
                }
                contador++;
                System.out.println("PUM");
            
            
        }
    }
    
}
