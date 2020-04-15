/**Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Exemplo de Entrada	    Exemplo de Saída
7 8 9 10                O JOGO DUROU 2 HORA(S) E 2 MINUTO(S)

7 7 7 7                 O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)

7 10 8 9                O JOGO DUROU 0 HORA(S) E 59 MINUTO(S) */

import java.util.Scanner;
public class URI1047 {
    public static void main(String args[]){
        Scanner teclado = new  Scanner(System.in);
        int hora_inicial, minuto_inicial, hora_final, minuto_final, hora_duracao, minuto_duracao;

        hora_inicial = teclado.nextInt();
        minuto_inicial = teclado.nextInt();
        hora_final = teclado.nextInt();
        minuto_final = teclado.nextInt();

        //valida a hora para o calculo das 24 horas no dia
        if (hora_final > hora_inicial) // se o horário for maior no tempo final é hora final - hora inicial simples
            hora_duracao = hora_final - hora_inicial;
        else // se o horário foi maior é subtraido 24 do horario inicial e adicionado mais as horas finais do outro dia
            hora_duracao = (24 - hora_inicial)+hora_final; 

        if (minuto_final == minuto_inicial){ //validação caso o minuto final e minuto inicial for o mesmo é uma hora a mais
            minuto_duracao = 0;
        }
        else if (minuto_final > minuto_inicial) //validação caso o minuto final e o minuto incial é uma simples subtração
            minuto_duracao = minuto_final - minuto_inicial;
        else{//caso não seja simples subtração é subtraido de 60 minutos e retirado uma hora final 
            minuto_duracao = (60 - minuto_inicial) + minuto_final; 
            hora_duracao = hora_duracao - 1;        
        }

        if (hora_duracao >= 24 && minuto_duracao > 0)// valida se a duração foi inferior a 1 hora
            hora_duracao = 0;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hora_duracao, minuto_duracao);       

        teclado.close();        
    }
}