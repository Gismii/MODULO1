import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Requisitos
        System.out.println("Requisitos para aprovação: cumprir no minimo  80% de presença e nota igual ou maior que 7.");

        // Digitar a primeira nota
        System.out.println("Primeira nota:");
        double nota1 = scanner.nextDouble();

        // digitar a segunda nota
        System.out.println("Segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Digitar a terceira nota
        System.out.println("Terceira nota: ");
        double nota3 = scanner.nextDouble();

        //variavel que contem a soma e divisão dos valores inputado
        double calculoDasnotas = ((nota1 + nota2 + nota3) / 3);

        // variavel com o total maximo de aula a ser cumprido
        double totalAula = 20;

        //Digitar total de faltas
        System.out.println("Quantas faltas: ");
        int faltas = scanner.nextInt();

        // variavel com a subtração entre duas variaveis
        double calculo = totalAula - faltas;
        // variavel com a subtração entre duas variaveis
        double porcentagem = (calculo*100) / totalAula;


       //teste para execução do resultado SE aprovado ou NÃO aprovado
        if ( porcentagem >= 80 && calculoDasnotas >=7){
            System.out.println("Aprovado com "+porcentagem+"%"+" presença e nota igual ou superiro a 7. ");
        } else if (porcentagem < 80 && calculoDasnotas <7) {
            System.out.println("Reprovado");

        } else {
            System.out.println("Não atingiu os requisitos para aprovação.");
        }
    }
}


//Solicite número de faltas, 3 notas de 0.0 a 10.0 , após a terceira nota apresente o resultado de aprovação  ,
// para aprovação o aluno deve possuir média superior a 7.0 e presença superior a 80% e o número total de aulas é 20 ;