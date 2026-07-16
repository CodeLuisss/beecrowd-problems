import java.util.Locale;
import java.util.Scanner;

public class Problem1017 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();

        double consumo = (velocidade * tempo) / 12.0;

        System.out.printf("%.3f%n", consumo);

        sc.close();
    }
}
