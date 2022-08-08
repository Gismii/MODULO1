import java.util.Scanner;

public class OpLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("N1: ");
        int numero1 = scanner.nextInt();
        System.out.println("N2: ");
        int numero2 = scanner.nextInt();

        if ( numero1 > numero2  ) {
            System.out.println("N1 é maior que N2 ");

        }else if ( numero1 < numero2){

            System.out.println("N2 e maior que N1");
        }
        else {
            System.out.println("Os numeros são iguais");
        }

    }
}
