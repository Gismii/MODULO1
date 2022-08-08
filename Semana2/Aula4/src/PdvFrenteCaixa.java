import java.text.DecimalFormat;
import java.util.Scanner;
public class PdvFrenteCaixa {

    public static void main(String[] args) {
        double valorProduto, valorTotal;
        int quantidadeComprada;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatacao = new DecimalFormat(".##");

        System.out.println("Informe o valor do produto:");
        valorProduto = scanner.nextDouble();
        System.out.println("Informe a quantidade comprada:");
        quantidadeComprada = scanner.nextInt();

        if (quantidadeComprada > 6) {
            valorProduto = valorProduto / 1.05;
        }

        valorTotal = valorProduto * quantidadeComprada;

        System.out.println("1 - Á prazo\n2 - À vista");
        int opcaoSelecionada = scanner.nextInt();

        switch (opcaoSelecionada) {
            case 1:
                System.out.println("Em quantas parcelas você dejesa dividir?");
                int quantidadeParcela = scanner.nextInt();
                System.out.println("Valor total da compra: R$ " + formatacao.format(valorTotal) +
                        "\nEm " + quantidadeParcela + " de R$ " + formatacao.format ((valorTotal / quantidadeParcela)));
                break;
            case 2:
                System.out.print("Valor da compra R$ "+String.format("%.2f", (valorTotal*0.97)));
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}

//System.out.print("Valor da compra R$ "+String.format("%.2f", (valorTotal*0.97)));