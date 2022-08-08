import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String joao;
        double nota1, nota2, nota3, nota4, media;

        System.out.println("n1");
        nota1 = scanner.nextDouble();
        System.out.println("n2");
        nota2 = scanner.nextDouble();
        System.out.println("n3");
        nota3 = scanner.nextDouble();
        System.out.println("n4");
        nota4 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 3;
        if (media >= 7) {
            System.out.println("Aprovado por media");

        } else {
            System.out.println("Informe a nota de recuperação:");
            double notaRecuperacao = scanner.nextDouble();
            if (notaRecuperacao + media < 10) {
                System.out.println("reprovado");
                if (notaRecuperacao + media > 10) {
                    System.out.println("reprovado");

                }
            }
        }
    }
}
