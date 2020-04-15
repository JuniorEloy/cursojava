import java.util.Scanner; 

public class URI1018 {
    public static void main(String args[]){
        /**Declaração das variáveis */
        Scanner teclado = new Scanner(System.in);            
        int valor, qnt;
        int[] celula={100,50,20,10,5,2,1};

        /**Valor total do teclado do usuário com o total geral */
        valor = teclado.nextInt();

        /**Loop para apresentar o usuário e para diminuir o valor total */
        System.out.println(valor);
        for (int i = 0; i < 7; i++) {    
            qnt = valor / celula[i];
            valor = valor - (celula[i] * qnt);            
            System.out.printf("%d nota(s) de R$ %d,00\n", qnt,celula[i]);
        }
        
        teclado.close();
    }
}