import java.util.Locale;
import java.util.Scanner;

public class AnalisandoCandidatos {


     public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
          
            System.out.println("Qual sua pretensão salarial: ");
            double salary = scanner.nextDouble();

          System.out.println( checkPretensionSalary(salary));

          
     }

    public static String checkPretensionSalary(double salary){
        double salaryCandidate = 2000.00;

        if(salaryCandidate > salary) {
           return "LIGAR PARA O CANDIDATO";
        }else if(salary > salaryCandidate){
           salaryCandidate = salaryCandidate  * 10;
           return  "FAZER CONTRAPOSTA AO CANDIDATO " + salaryCandidate;
        }else{
            return  "PEDIR QUE O CANDIDATO AGUARDE";
        }
     }
}


