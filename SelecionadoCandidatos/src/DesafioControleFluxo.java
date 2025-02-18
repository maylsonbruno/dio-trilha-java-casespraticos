import java.util.Locale;
import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Informe um numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        int numero2 = scanner.nextInt();
        
        try {
			imprimirNumero(numero1, numero2);
		} catch (ParametrosInvalidosException e) {
			
			e.printStackTrace();
		}
    }

    public static void imprimirNumero(int numero1, int numero2) throws ParametrosInvalidosException{
    	
        if(numero1 > numero2) {
            throw new ParametrosInvalidosException("O segundo paramentro deve ser maior que o primeiro");
        }
        
        for(int i = 1; numero1 <= numero2; i++) {
            System.out.println("Imprimindo o numero " + numero1++);
        }
 }
}
