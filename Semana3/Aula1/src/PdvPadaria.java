import java.util.Scanner;

public class PdvPadaria {

        //        Utilizando a estrutura While, faça um programa que simule um caixa de uma padaria,
        //        a cada produto deve solicitar ao usuário o preço do produto e se o usuário quer encerrar a venda.
        //        Ao final informar o valor total da venda.


        public static void main(String[] args) {

            String opcaoMenu = "1";
            double precoProduto = 0.0;
            double totalVenda = 0.0;

            Scanner entrada = new Scanner(System.in);

            //Criando estrutura de opção para o usuário

            System.out.println("--------------------------------------------");
            System.out.println("Programa iniciado , escolha uma opção");
            System.out.println("--------------------------------------------");
            System.out.println("1 - incluir produto");
            System.out.println("2 - encerrar venda");
            System.out.println("--------------------------------------------");
            opcaoMenu = entrada.next();

            while (opcaoMenu.equals("1")) {
                System.out.println("digite o preço do produto");
                System.out.println("--------------------------------------------");
                precoProduto = entrada.nextDouble();
                totalVenda += precoProduto;
//            totalVenda = totalVenda + precoProduto;
//            o trecho acima é a mesma coisa que ( totalVenda = totalVenda + precoProduto )

                System.out.println("--------------------------------------------");
                System.out.println("Total de produtos R$" + totalVenda);
                System.out.println("--------------------------------------------");
                System.out.println("Selecione uma opção");
                System.out.println("1 - incluir novo produto");
                System.out.println("2 - encerrar venda");
                System.out.println("--------------------------------------------");
                opcaoMenu = entrada.next();

            }

            System.out.println("--------------------------------------------");
            System.out.println("Venda encerrada");
            System.out.println("--------------------------------------------");
            System.out.println("Total de produtos R$" + totalVenda);
            System.out.println("--------------------------------------------");

        }
    }











