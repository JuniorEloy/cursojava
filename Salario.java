import java.util.Scanner;

/* 
Voce foi contratado para fazer o calculo do salário de um novo 
colaborador do time de DEV
O calculo é estipulado como:
dado o salário o imposto é fixo em 15%
voce deve informar o salario que foi digitado, o imposto que foi
calculado é o salario liquido final

1 - Meu programa sabe quanto vale o salário?
    Não! preciso informar
2 - Sei como calcular o imposto?
    Sim! preciso do valor do salário e também armazenar esse imposto calculado
3 - Sei como calcular o salario liquido?
    Sim! do valor do salario original e do imposto calculado, conseguimos subtrair esse valor e ter o salario liquido


Itens:
Passo 1 - Saber o valor do salario
Passo 2 - Calcular o imposto de 15%
Passo 3 - Subtrair o valor do passo 1 do valor do passo 2
Passo 4 - Exibir tudo na tela

*/


import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        float salario_liquido, salario, imposto;       

        Scanner sc1 = new Scanner(System.in);      
        
        System.out.print("Digite o salario: ");
        salario = sc1.nextFloat();

        imposto = salario * 15 / 100;
        salario_liquido = salario - imposto;

        System.out.println("Salario Bruto:  R$"+salario);
        System.out.println("Imposto         R$"+imposto);
        System.out.println("Salario liquido R$"+salario_liquido);
        
    }
}