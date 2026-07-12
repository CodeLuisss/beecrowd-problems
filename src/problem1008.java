import java.util.Scanner;
import java.util.Locale;

public class problem1008 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int NUMBER, horasTrabalhadas;
        double valorHora, SALARY;

        NUMBER = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorHora = sc.nextDouble();

        SALARY = valorHora * horasTrabalhadas;

        System.out.printf("NUMBER = %d%n", NUMBER);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);

        sc.close();
    }
}
