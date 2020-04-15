import java.util.Scanner;
public class URI1050 {
    public static void main(String args[]){
        Scanner teclado = new  Scanner(System.in);
        int ddd;

        ddd = teclado.nextInt();
        
        switch(ddd){
            case 61: //Brasilia
                System.out.println("Brasilia");
                break;
            case 71: //Salvador
                System.out.println("Salvador");
                break;
            case 11: //Sao Paulo
                System.out.println("Sao Paulo");
                break;
            case 21: //Rio de Janeiro
                System.out.println("Rio de Janeiro");
                break;
            case 32: //Juiz de Fora
                System.out.println("Juiz de Fora");
                break;
            case 19: //Campinas
                System.out.println("Campinas");
                break;
            case 27: //Vitoria
                System.out.println("Vitoria");
                break;
            case 31: //Belo Horizonte
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("DDD nao cadastrado");
        }  
    }
}