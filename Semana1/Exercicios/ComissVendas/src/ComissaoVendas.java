
import java.util.Scanner;
public class ComissaoVendas {

        public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        String nome = "Gismi";

        float salarioBase = 1000;
        double tv, folgao, computador, celular, drone, mesa;
        double SalarioMaisComisao;
        System.out.println("Valor dos produtos Vendidos por Gismi: ");
        System.out.println("Tv R$: ");
        tv = scanner.nextDouble();
        System.out.println("fogão R$: ");
        folgao = scanner.nextDouble();
        System.out.println("Computador R$: ");
        computador = scanner.nextDouble();
        System.out.println("Celular R$: ");
        celular = scanner.nextDouble();
        System.out.println("Drone R$: ");
        drone = scanner.nextDouble();
        System.out.println("Mesa R$: ");
        mesa = scanner.nextDouble();
        double totalVendas = (tv + folgao + computador + celular + drone + mesa);
        double porceT = (totalVendas / 100 * 12);
        double x = salarioBase + totalVendas / 100 * 12;
        System.out.println("(Total de vendas R$" + totalVendas + ")");
        System.out.println(String.format("Comissão sobre total de vendas é de R$" + "%.0f",porceT)+".");
        System.out.println("Salario base: R$" + salarioBase + ".");
        System.out.println(String.format("Total dos vencimentos é: R$" + "%.0f", x) +".");


    }
}



