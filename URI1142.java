import java.util.Scanner;
public class URI1142 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, contador=1;

        N = teclado.nextInt();

        for (int i=1; i<=N; i++){                        
                System.out.println(contador+" "+(contador+1)+" "+(contador+2)+" PUM");
                contador+=4;
        }
        teclado.close();
    }    
}