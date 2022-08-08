import java.util.Scanner;

public class SwitchVogal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a vogal: ");
        String vogal = scanner.next();

        switch (vogal) {
            case "a":
                System.out.println("A");
                break;
            case "b":
                System.out.println("b");
                break;
            default :
                System.out.println("https://github.com/Gismii");


        }
    }
}