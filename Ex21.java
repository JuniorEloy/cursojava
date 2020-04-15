
import java.util.Scanner;

public class Ex21 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int idade;

        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();

        /**
         * Condição eleitoral:
         * não eleitores menores de 16 anos de idade
         * obrigatórios entre 18 e 65 anos
         * facultativos entre 16 e 18 e maiores de 65 anos
         */

        if (idade < 16){
            System.out.println("Nao eleitores");
        }else{
            if ((idade >=18 ) && (idade <= 65)){
                System.out.println("Obrigatorio");
            }else{
                System.out.println("Facultativo");
            }
        }

        teclado.close();

    }

}