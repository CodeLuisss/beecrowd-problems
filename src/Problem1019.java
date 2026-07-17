import java.util.Scanner;

public class Problem1019 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int hora = N / 3600;
        N = N % 3600;

        int minuto = N / 60;

        int segundos = N % 60;

        System.out.printf("%d:%d:%d%n", hora, minuto, segundos);

        sc.close();
    }
}
