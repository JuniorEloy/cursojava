import java.util.Scanner; 

public class URI1164 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n,qnt, cont=0;

        qnt = teclado.nextInt();

        for (int j=0; j<qnt; j++){
            cont = 0;
            n = teclado.nextInt();

            for (int i=1; i<n; i++){            
                if(n % i == 0){
                    cont+=i;
                }
            }

            if (n == cont)
                System.out.println(n+" eh perfeito");
            else
                System.out.println(n+" nao eh perfeito");
        }
    }
}