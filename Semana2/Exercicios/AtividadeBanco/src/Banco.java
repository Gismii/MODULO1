import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double transferer;
        //String name = "Gismi";
        System.out.println("BankOfAmerica");
        System.out.println("Qual o seu saldo? ");
        double saldoDaconta = scanner.nextDouble();
        System.out.println("1 - saque\n" +
                "2 - depósito\n" +
                "3 - transferência\n");
        System.out.print("Digite: ");
        int Digite = scanner.nextInt();
        if (Digite == 1) {

            System.out.println("Qual valor do saque? ");
            double valorDoSaque = scanner.nextDouble();
            if (saldoDaconta >= valorDoSaque) {
                saldoDaconta = saldoDaconta - valorDoSaque;
                System.out.println("Saque realizado com sucesso. Seu saldo atual é R$" + (saldoDaconta));
            } else if (saldoDaconta < valorDoSaque) {
                System.out.println("Saldo insuficiente. Saldo da conta R$" + saldoDaconta);

            }

        }
        if (Digite == 2) {
            System.out.println("Qual valor do deposito?");
            double deposito = scanner.nextDouble();
            saldoDaconta = saldoDaconta + deposito;
            System.out.println("Deposito realizado com sucesso! Seu saldo é de R$" + saldoDaconta);
        }
        switch (Digite) {
            case 3:
                System.out.println("1 - PIX\n" +
                        "2 - TED\n");
                System.out.println("Digite:");
                int digitii = scanner.nextInt();
                switch (digitii) {
                    case 1:

                        System.out.println("Será cobrado o valor de R$1,50 por transferencia. Digite o valor operação ?");
                        transferer = scanner.nextInt();
                        if (transferer <= saldoDaconta) {
                            saldoDaconta = (saldoDaconta - transferer - 1.5);
                            System.out.println("Pix realizado com sucesso! Seu saldo é de R$" + saldoDaconta);
                        } else if (transferer > saldoDaconta) {
                            System.out.println("Saldo insuficiente. Saldo da conta R$" + saldoDaconta);
                        }

                        //switch (digitii) {
                    case 2:
                        System.out.println("Será cobrado o valor de R$9,80 por transferencia. Digite o valor operação ?");
                        transferer = scanner.nextDouble();
                        if (transferer >= saldoDaconta) {
                            System.out.println("Saldo insuficiente! Seu saldo é de R$" + saldoDaconta);
                            break;
                        } else if (saldoDaconta>transferer) {


                            saldoDaconta = saldoDaconta - transferer - 9.80;
                            System.out.println("TED realizado com sucesso! Seu saldo é de R$" + saldoDaconta);
                        }


                }
        }
    }

}