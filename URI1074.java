
import java.util.Scanner;

public class URI1074 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, val_calc;

        N = teclado.nextInt();

        for (int i=0; i<N; i++){
            val_calc = teclado.nextInt();

            if (val_calc == 0){//valida se o valor e 0
                System.out.print("NULL\n");
                continue;
            }

            if (val_calc % 2 == 0){//valida se o valor e par ou impar sem quebrar a linha                
                System.out.print("EVEN ");
            }else{
                System.out.print("ODD ");
            }
            
            if (val_calc > 0){//concatena com o valor é par ou nao e adiciona no print se é positivo ou nao
                System.out.print("POSITIVE\n");
            }else{
                System.out.print("NEGATIVE\n");
            }                       
        }
    }
}