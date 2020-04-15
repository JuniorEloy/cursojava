import java.util.Scanner;
public class URI1143 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, cont1=1,cont2=1,calc_2 =1 ;

        N = teclado.nextInt();

        for (int i=0; i<N; i++){            
            System.out.print((cont1)+" "+(cont1*cont1)+" "+(cont1*(cont1*cont1))+"\n");
            cont1++;            
        }
    }
}