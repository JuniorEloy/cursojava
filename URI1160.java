import java.util.Scanner;
public class URI1160 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int T, PA,PB, ano=0;
        float G1,G2;

        T = teclado.nextInt();

        for (int i=0; i<T; i++){
            PA = teclado.nextInt();
            PB = teclado.nextInt();
            G1 = teclado.nextFloat();
            G2 = teclado.nextFloat();
            ano=0;
            
            do{
                PA = (int) (PA + PA*G1/100);
                PB = (int) (PB + PB*G2/100);

                ano++;
                if(ano>100)
                    break;
            }while(PB>=PA);

            if(ano>100)
                System.out.println("Mais de 1 seculo.");
            else
                System.out.println(ano+" anos.");
        }

        teclado.close();

        
    }
}