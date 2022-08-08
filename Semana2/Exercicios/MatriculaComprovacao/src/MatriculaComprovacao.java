import java.util.Scanner;
public class MatriculaComprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo a Escola!!");
        System.out.println("Para saber a classe, por gentileza, informe seu nome e idade.");
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        //System.out.println(nome+" Comprovante de conclusão do ano anterior? 1-sim, 2-não.");
        int comprovante;

        switch (idade) {
            case 8:
                System.out.println(nome + " sua turma é a S1; ");
                break;
            case 9:
                System.out.println(nome + " Comprovante de conclusão do ano anterior? 1-sim, 2-não.");
                comprovante = scanner.nextInt();
                if (comprovante == 1) {
                    System.out.println(nome + " você tem "+idade+" anos, e pertence a turma S2. ");
                } else if (comprovante == 2) {
                    System.out.println(nome + " você não pode concluir a matricula sem a comprovação.");
                }
                break;
            case 10:
                System.out.println(nome + " Comprovante de conclusão do ano anterior? 1-sim, 2-não.");
                comprovante = scanner.nextInt();
                if (comprovante == 1) {
                    System.out.println(nome + " você tem "+idade+" anos, e pertence a turma S3; ");
                } else if (comprovante == 2) {
                    System.out.println(nome + " você não pode concluir a matricula sem a comprovação.");
                }
                break;
            case 11:
                System.out.println(nome + " Comprovante de conclusão do ano anterior? 1-sim, 2-não.");
                comprovante = scanner.nextInt();
                if (comprovante == 1) {
                    System.out.println(nome + " você tem "+idade+" anos, e pertence a turma S4; ");
                } else if (comprovante == 2) {
                    System.out.println(nome + " você não pode concluir a matricula sem a comprovação.");
                }
                break;
            case 12:
                System.out.println(nome + " Comprovante de conclusão do ano anterior? 1-sim, 2-não.");
                comprovante = scanner.nextInt();
                if (comprovante == 1) {
                    System.out.println(nome + " você tem "+idade+" anos, e pertence a turma S5; ");
                } else if (comprovante == 2) {
                    System.out.println(nome + " você não pode concluir a matricula sem a comprovação.");
                }
                break;
            case 13:
                System.out.println(nome + " Comprovante de conclusão do ano anterior? 1-sim, 2-não.");
                comprovante = scanner.nextInt();
                if (comprovante == 1) {
                    System.out.println(nome + " você tem "+idade+" anos, e pertence a turma S6; ");
                } else if (comprovante == 2) {
                    System.out.println(nome + " você não pode concluir a matricula sem a comprovação.");
                }
                break;
            case 14:
                System.out.println(nome + " Comprovante de conclusão do ano anterior? 1-sim, 2-não.");
                comprovante = scanner.nextInt();
                if (comprovante == 1) {
                    System.out.println(nome + " você tem "+idade+" anos, e pertence a turma S7; ");
                } else if (comprovante == 2) {
                    System.out.println(nome + " você não pode concluir a matricula sem a comprovação.");
                }
                break;
            case 15:
                System.out.println(nome + " Comprovante de conclusão do ano anterior? 1-sim, 2-não.");
                comprovante = scanner.nextInt();
                if (comprovante == 1) {
                    System.out.println(nome + " você tem "+idade+" anos, e pertence a turma S8; ");
                } else if (comprovante == 2) {
                    System.out.println(nome + " você não pode concluir a matricula sem a comprovação.");
                }
                break;
        }
    }
}


