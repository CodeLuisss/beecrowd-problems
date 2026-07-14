import java.util.Scanner;

public class Problem1016 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        int minutos = X * 2;

        System.out.printf("%d minutos%n", minutos);

        sc.close();
    }
}
