import java.util.Scanner;

public class Bomba {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio = 1;



        System.out.println("Digite: ");
        inicio = scanner.nextInt();

        for (int i = 0; i < 5000; i--) {


            if (inicio > 0) {
                inicio = inicio - 1;

                System.out.println(inicio);


            } else {
                if (i < 1) {
                    System.out.println("Booommmm");
                }break;


            }
        }
    }
}


 //by: Gismi Guimarães


