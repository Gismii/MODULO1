import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();

        if ( numero / 2 == 0 ) {
            System.out.println("numero informado é par ");

        }else{

            System.out.println("Esse numero é impar!");
        }

    }
}
