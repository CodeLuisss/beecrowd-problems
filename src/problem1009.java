import java.util.Scanner;
import java.util.Locale;

public class problem1009 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        double salario, vendas, TOTAL;

        nome = sc.next();
        salario = sc.nextDouble();
        vendas = sc.nextDouble();

        TOTAL = salario + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", TOTAL);

        sc.close();
    }
}
