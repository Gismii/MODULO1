import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe as três notas de 0 a 10.");
        System.out.println("Primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Terceira nota: ");
        double nota3 = scanner.nextDouble();
        double calculoDasnotas = ((nota1 + nota2 + nota3) / 3);


        if (calculoDasnotas >= 7){
            System.out.println("Aprovado");
        } else if (calculoDasnotas < 7) {
            System.out.println("Reprovado");

        } else {
            System.out.println("Reprovado");
        }
    }
}

       //Solicite 3 notas de 0.0 a 10.0 , após a terceira nota
        // apresente o resultado de aprovação , para aprovação o aluno deve possuir média superior a 7.0 ;





