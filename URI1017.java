/**
 * Autonomia        = 12km/l
 * Velocidade média = ?
 * Tempo gasto      = ?
 * Distancia        = ?
 */


import java.util.Scanner;

public class URI1017 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo_viajem, vel_media;
        int autonomia = 12;
        float qnt_litros,distancia;

        tempo_viajem = teclado.nextInt();
        vel_media = teclado.nextInt();

        distancia = tempo_viajem * vel_media;

        qnt_litros = distancia / autonomia;

        
        System.out.printf("%.3f\n", qnt_litros);

        teclado.close();
    }
}