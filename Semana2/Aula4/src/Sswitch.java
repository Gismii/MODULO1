import java.util.Scanner;

public class Sswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Saque \n2 - Deposito");
        int opcaoUsuario = scanner.nextInt();

        switch (opcaoUsuario) {
            case 1:
                System.out.println("Saque Realizado");
                break;
            case 2:
                System.out.println("1 - Deposito pelo envelope \n2 Deposito em dinheiro");
                int opcaodeDepositp = scanner.nextInt();
        }switch (opcaoUsuario) {
            case 1:
                System.out.println("Deposito pelo envelope");
                break;
            case 2:
                System.out.println("Deposito em dinheiro");
                break;
            default:
                System.out.println("Opção invalida");

        }
    }
}