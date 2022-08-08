import java.util.Scanner;


public class CompraMacan {

    public static double Duzia = 0.25;
    public static double unidade = 0.30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeComprada;
        double valorDaCompraUnidade;
        double valorDaCopraAtacdo;
        double totalDesconto;


        System.out.println("Informe quantas Macans foram compradas: ");
        quantidadeComprada = scanner.nextInt();
        valorDaCompraUnidade = unidade * quantidadeComprada;
        valorDaCopraAtacdo = Duzia * quantidadeComprada;
        totalDesconto = 0.05 * quantidadeComprada;

        if (quantidadeComprada < 12) {
            System.out.println(" O valor da compra é R$" + valorDaCompraUnidade);

        } else {
            System.out.println(" O valor da compra é R$" + valorDaCopraAtacdo + ", você recebeu R$"+totalDesconto+" de desconto!");


        }

    }
}
