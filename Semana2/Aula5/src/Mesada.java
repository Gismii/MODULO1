
import java.util.Scanner;
public class Mesada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double produto = 200;
        double mesada;
        System.out.println("Seja bem-vindo a loja!!");
        System.out.println("1 - Apenas olhar, 2 - Comprar - o que desejas ?");
        int Resposta = scanner.nextInt();
        switch (Resposta) {
            default: System.out.println("Opçao invalida!");
            break;
            case 1:
                System.out.println("Tudo bem!!");
                break;
            case 2:
                System.out.println("Qual valor em carteira? ");
                mesada = scanner.nextDouble();
                if (mesada >=produto) {
                    System.out.println("Compra efetuada com sucesso! - seu saldo é R$" + (mesada - produto));

                } else if (mesada < produto){
                    System.out.println("Saldo insuficiente!!");

                }


                }
        }
    }
