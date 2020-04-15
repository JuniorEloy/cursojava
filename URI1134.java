import java.util.Scanner;

public class URI1134 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int tipo, qnt_alcool=0, qnt_gasolina=0, qnt_diesel=0;

        do{
            tipo = teclado.nextInt();
            
            switch(tipo){                
                case 1:
                    qnt_alcool++;
                    break;
                case 2:
                    qnt_gasolina++;
                    break;
                case 3:
                    qnt_diesel++;
                    break;
            }
        }while(tipo!=4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+qnt_alcool);
        System.out.println("Gasolina: "+qnt_gasolina);
        System.out.println("Diesel: "+qnt_diesel);

        teclado.close();
    }
}