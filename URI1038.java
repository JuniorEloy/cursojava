import java.util.Scanner;
public class URI1038 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int pedido, quantidade; 

        pedido = teclado.nextInt();
        quantidade = teclado.nextInt();

        switch(pedido){
            case 1: //cachorro quente R$4.00
                System.out.printf("Total: R$ %.2f\n",quantidade*4.0);
                break;

            case 2: //x-salada R$4.50
                System.out.printf("Total: R$ %.2f\n",quantidade*4.5);
                break;

            case 3: //x-bacon R$5.00
                System.out.printf("Total: R$ %.2f\n",quantidade*5.0);
                break;

            case 4: //torrada simples R$2.00
                System.out.printf("Total: R$ %.2f\n",quantidade*2.0);
                break;

            case 5: // refrigerante R$1.50
                System.out.printf("Total: R$ %.2f\n",quantidade*1.5);
                break;
        }
    }
}