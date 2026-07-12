import java.util.Locale;
import java.util.Scanner;

public class Problem1010 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codPeca1, codPeca2, numPeca1, numPeca2;
        double valorPeca1, valorPeca2, valorAPagar;

        codPeca1 = sc.nextInt();
        numPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();

        codPeca2 = sc.nextInt();
        numPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        valorAPagar = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);

        sc.close();
    }
}
