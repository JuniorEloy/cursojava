import java.util.Scanner;

public class URI1180 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);        
        int N;

        N = teclado.nextInt();
        int vet[] = new int[N];

        for(int i=0; i<N; i++){
            vet[i] = teclado.nextInt();
        }

        int menor=vet[0], pos=0;

        for(int j=1; j<N; j++){
            if(vet[j] < menor){
                menor = vet[j];
                pos = j;
            }
        }

        System.out.println("Menor valor: "+menor);
        System.out.println("Posicao: "+pos);
    }
}