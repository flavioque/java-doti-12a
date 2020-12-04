import java.util.Scanner;
public class Uri1070 {
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int x = teclado.nextInt();        
        int count = 0;
        do{
            if (x % 2 !=0){
                System.out.println(x);
                count++;
            }
            x++;
               
        } while (count <6);
    }
    
}
