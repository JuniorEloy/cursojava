
/*
este programa é um exemplo de como fazer uma leitura de dados 
vinda do teclado, um pequeno calculo e finalmente, exibir o 
valor final na tela.
*/

/*Para fazer a leitura vou precisar de uma bib */

import java.util.Scanner;

public class Leitura {
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int valor; 
        System.out.print("Digite um valor");
        valor = teclado.nextInt();

        valor = valor * 100;

        System.out.print("Novo valor: "+ valor);
        
        

    }
}