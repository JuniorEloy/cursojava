import java.util.Scanner;

public class URI1168 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int vet_led[] = {6,2,5,5,4,5,6,3,7,6}, contador=0;
        String letreiro, loops;       
        
        loops = teclado.nextLine();

        for (int x=0; x<Integer.parseInt(loops); x++){
            contador = 0;

            letreiro = teclado.nextLine();
            
            for(int i=0;i<letreiro.toCharArray().length;i++){
                contador +=  vet_led[Character.getNumericValue(letreiro.charAt(i))];
            }

            System.out.println(contador+" leds");
        }
        
        teclado.close();
    }
}