import java.util.Scanner;
public class CalculadoraDois {

    public static void main(String[] args) {
        float num1, num2;
        String operacao = "";
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(": \n");


            System.out.println(" soma: +");

            System.out.println(" Subtacao: -");

            System.out.println(" multiplicacao: * ");

            System.out.println(" divisao: /");
            System.out.println("Digite qual operação deseja? ");
            String conta = scanner.next();

            switch (conta) {
                case "+":
                    System.out.println("Digite o primeiro numero: ");
                    num1 = scanner.nextFloat();
                    System.out.println("Digite outro: ");
                    num2 = scanner.nextFloat();
                    float som = num1 + num2;
                    System.out.println("Resultado: " + som);
                    break;

                case "-":
                    System.out.println("Digite um numero: ");
                    num1 = scanner.nextFloat();
                    System.out.println("Digite outro: ");
                    num2 = scanner.nextFloat();
                    float sub = num1 - num2;
                    System.out.println("Resultado: " + sub);
                    break;
                case "*":
                    System.out.println("Digite um numero: ");
                    num1 = scanner.nextFloat();
                    System.out.println("Digit outro: ");
                    num2 = scanner.nextFloat();
                    float mult = num1 * num2;
                    System.out.println("Resultado: " + mult);
                    break;
                case "/":
                    System.out.println("Digite um numero: ");
                    num1 = scanner.nextFloat();
                    System.out.println("Digite outro: ");
                    num2 = scanner.nextFloat();
                    float dividir = num1 / num2;
                    System.out.println("Resultado: " + dividir);
                    break;
                default:
                    System.out.println("Comando nao reconhecido.");
            }
            System.out.println("Deseja realizar outra operacao SIM para continuar e Não para sair?");

            scanner.nextLine();
            operacao = scanner.nextLine();
            System.out.println("Repita o procedimento.");

        }while (operacao.equalsIgnoreCase("SIM")) ;
            System.out.println("Operacao finalizada.");

        }

    }






