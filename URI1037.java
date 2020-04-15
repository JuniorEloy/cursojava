import java.util.Scanner;
public class URI1037 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        float valor;

        valor = teclado.nextFloat();

        if (valor >= 0 && valor <= 25)
            System.out.print("Intervalo [0,25]\n");
        else if (valor > 25 && valor <= 50)
            System.out.print("Intervalo (25,50]\n");
        else if (valor > 50 && valor <= 75)
            System.out.print("Intervalo (50,75]\n");
        else if (valor > 75 && valor <= 100)
            System.out.print("Intervalo (75,100]\n");
        else
            System.out.print("Fora de intervalo\n");
    }
}