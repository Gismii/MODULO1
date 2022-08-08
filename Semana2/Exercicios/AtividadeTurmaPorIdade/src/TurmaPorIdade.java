import java.util.Scanner;
public class TurmaPorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo a Escola!!");
        System.out.println("Para saber a classe, por gentileza, informe seu nome e idade.");
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();


            switch (idade) {
                case 8:
                    System.out.println(nome+" Sua turma é a 1; ");
                    break;
                case 9:
                    System.out.println(nome+" Sua turma é a 2; ");
                    break;
                case 10:
                    System.out.println(nome+" Sua turma é a 3; ");
                    break;
                case 11:
                    System.out.println(nome+" Sua turma é a 4; ");
                    break;
                case 12:
                    System.out.println(nome+" Sua turma é a 5; ");
                    break;
                case 13:
                    System.out.println(nome+" Sua turma é a 6; ");
                    break;
                case 14:
                    System.out.println(nome+" Sua turma é a 7; ");
                    break;
                case 15:
                    System.out.println(nome+" Sua turma é a 8; ");
                    break;



            }
        }
    }
