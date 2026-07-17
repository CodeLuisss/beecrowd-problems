import java.util.Scanner;

public class Problem1020 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        int ano = idade / 365;
        idade = idade % 365;

        int meses = idade / 30;

        int dias = idade % 30;

        System.out.printf("%d ano(s)%n", ano);
        System.out.printf("%d mes(es)%n", meses);
        System.out.printf("%d dia(s)%n", dias);

        sc.close();
    }
}
