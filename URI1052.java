import java.util.Scanner;
public class URI1052 {
    public static void main(String args[]){
        Scanner teclado = new  Scanner(System.in);
        int input_mes;

        String[] mes = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        input_mes = teclado.nextInt();

        System.out.println(mes[input_mes-1]);
    }
}