import java.util.Scanner;

public class URI1051 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        float salario=0, imposto=0, res_imposto=0;

        salario = teclado.nextFloat();

        if (salario <= 2000)
            System.out.print("Isento\n");
        else if (salario > 2000){
            res_imposto = salario - 2000.00f;            
            
            if (res_imposto > 999.99f){//valida a primeira onda de imposto a 8%    
                res_imposto = 999.99f;                        
                imposto = res_imposto * 0.08f;
            }
            else{
                imposto = res_imposto * 0.08f;
            }
            if (res_imposto == 999.99f){
                res_imposto = salario - 3000.00f;
                if (res_imposto > 1499.99f){//valida a primeira onda de imposto a 18%    
                    res_imposto = 1499.99f;                        
                    imposto = imposto+(res_imposto * 0.18f);
                }else{
                    imposto = imposto+(res_imposto * 0.18f);
                }
            }
            if (res_imposto == 1499.99f){//valida a primeira onda de imposto a 28%    
                res_imposto = salario - 4500.00f;                       
                imposto = imposto+(res_imposto * 0.28f);
            }
            
            System.out.printf("R$ %.2f\n",imposto);
        }

        teclado.close();
    }

}