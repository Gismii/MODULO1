import java.util.Scanner;

public class DoWhileNumeroImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro>1: ");


        int entre = scanner.nextInt();

        for (int i = 0; i <= entre; i++) {

            if (i % 2 == 0) {
                System.out.print("PAR➡ ");
                System.out.println(i);
            }

        } System.out.println("**************☕");
        for (int p = 0; p <= entre; p++) {

            if (p % 2 == 1) {
                System.out.print("IMPA ➡ ");
                System.out.println(p);
            }

        }

    }
}








