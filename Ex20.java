import java.util.Scanner;

public class Ex20 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int sexo;
        double pesoIdeal, altura;


        System.out.print("Digite:\n1 - Homem\n2 - Mulher\n");
        sexo = teclado.nextInt();
        System.out.print("Digite a altura atual:\n");
        altura = teclado.nextDouble();

        /** 
            homens   : (72.7 * H) – 58
            mulheres : (62.1 * H) – 44,7  
        */
        if (sexo == 1){
            //condição para Homem
            pesoIdeal = (72.7 * altura) - 58;

        }else{
            //condição para Mulher
            pesoIdeal = (62.1 * altura) - 44.7;
        }

        System.out.println("Seu peso ideal e: "+pesoIdeal);

    }
}