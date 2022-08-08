//import java.lang.String;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int escolhas=0;
        System.out.println("Escolha uma das opções 1-True, 0-false :");

        String menu = scanner.next();

        while (menu =="1" || menu =="0") {

            System.out.println(" Escolha uma das opções 1-True, 0-false :");
            menu = scanner.next();
            if ( menu !="0" && menu !="1") {
                System.out.println("Opção invalida!! Escolha uma das opções 1-True, 0-false :");
                menu = scanner.next();

                if (menu == "-5")

                    System.out.println("FINALIZADO PELO USUSARIO!!");

            }
        }


    }
}






