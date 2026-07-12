import java.util.Scanner;
import java.util.Locale;

public class Problem1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;

        double raio = sc.nextDouble();

        double A = pi * (Math.pow(raio, 2.0));

        System.out.printf("A=%.4f%n", A);

        sc.close();
    }
}