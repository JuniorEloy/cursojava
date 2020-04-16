import java.util.Scanner;

import sun.net.www.content.text.plain;
public class URI1177 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int T,cont=0, vet[];
        vet = new int[1000];
        
        T = teclado.nextInt();
        
        //usei dois loops `´ (burro)

        /*
        do{
            for (int i=0; i<T; i++){
                if(cont==1000)
                    break;

                vet[cont] = i;
                System.out.println("N["+cont+"] = "+vet[cont]);
                cont++;                
            }            
        }while(cont<1000);*/

        //1 loop, muito melhor;
        for(int i=0; i < vet.length; i++){
            vet[i] = cont;

            System.out.println("N["+cont+"] = "+vet[cont]);

            cont++;
            if (cont == T){
                cont = 0;
            }
        }
        teclado.close();
    }
}