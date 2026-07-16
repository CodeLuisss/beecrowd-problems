import java.util.Scanner;

public class Problem1018 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int original = N;

        int nota100 = N / 100;
        N = N % 100;

        int nota50 = N / 50;
        N = N % 50;

        int nota20 = N / 20;
        N = N % 20;

        int nota10 = N / 10;
        N = N % 10;

        int nota5 = N / 5;
        N = N % 5;

        int nota2 = N / 2;
        N = N % 2;

        int nota1 = N;

        System.out.println(original);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");

        sc.close();
    }
}
