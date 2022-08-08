import java.util.Scanner;

public class Stacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione uma Stack: " );
            System.out.println("1 - backend"  );
                System.out.println("2 - front"  );
                        System.out.println("3 - Devops"  );
                                System.out.println("4 - Cloud " );


        String stack = scanner.next();
        switch (stack) {
            case "backend":
                System.out.print("Java\n" +
                        "Spring\n" +
                        "Python\n" +
                        "Node\n");

                break;
            case "frontend":
                System.out.print("HTML\n" +
                        "CSS\n" +
                        "JAvaScript\n");

                break;
            case "devops":
                System.out.print("Docker\n" +
                        "Kubernetes\n");

                break;
            case "Cloud":
                System.out.print("AWS\n" +
                        "Azure\n");

                break;
            default:
                System.out.print("Opção invalida, repita operação!");


        }
    }


}
