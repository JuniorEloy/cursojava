/*
DDMMAAAA

    ano = 13042020

    13042020 / 10000
        2020 - 1304 ----> ano

    1304 / 100
      04 - 13 ----------> dia
      *-----------------> mes
*/

import java.util.Scanner;

public class CapturaData {
    public static void main(String args[]){
        int data, ano, mes, dia, resto_ano;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a data DDMMAAAA\n");

        data = teclado.nextInt();

        ano = data%10000;
        resto_ano = data / 10000;

        dia = resto_ano / 100;
        mes = resto_ano % 100;

        System.out.printf("Data: %s/%s/%s \n",dia,mes,ano);
        System.out.println("Ano:  "+ano);
        System.out.println("Mes:  "+mes);
        System.out.println("Dia:  "+dia);
    }
}