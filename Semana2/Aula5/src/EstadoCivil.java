import java.util.Scanner;

public class EstadoCivil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "joão";
        //int estadocivil = scanner.nextInt();

        System.out.println("Qual seu estado civil "+name+"?" );
        System.out.println("1 - Solteira");
        System.out.println("2 - casado");
        System.out.println("3- Viuvo");
        System.out.println("4-Divorciado!");
        int estadocivil = scanner.nextInt();
        switch (estadocivil) {
            case 1:
                System.out.print(" Sou Solteira.  ");

                break;
            case 2:
                System.out.print("Sou Casado");

                break;
            case 3:
                System.out.print("Sou Viuvo");

                break;
            case 4:
                System.out.print("Sou Divorciado");

                break;
            default:
                System.out.print("Opção invalida, repita operação!");


        }
    }

}