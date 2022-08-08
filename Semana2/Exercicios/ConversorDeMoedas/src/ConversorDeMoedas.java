import java.util.Scanner;
public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe qual moeda deseja converter para o real: ");
        System.out.print("1 - Dólar\n" +
                "2 - Euro\n" +
                "3 - Libra\n" +
                "4 - Peso Argentino\n");
        int opcao=scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Digite a quantia em real:");
                double real =scanner.nextDouble();
                double dolar =real/5.24;
                System.out.println("O valor de R$"+real+" é equivalente a $"+dolar);
                System.out.println("A contação do dolar americano é R$5,24.");
                break;

            case 2:
               System.out.println("Digite a quantia em real:");
            double real2 =scanner.nextDouble();
            double euro =real2/5.53;
               System.out.println("O valor de R$"+real2+" é equivalente a $"+euro);
               System.out.println("A contação do EURO é R$5,24.");
               break;
            case 3:
                System.out.println("Digite a quantia em real:");
            double real3 =scanner.nextDouble();
            double libra =real3/6.42;
                System.out.println("O valor de R$"+real3+" é equivalente a $"+libra);
                System.out.println("A contação em libra é R$5,24.");
                break;
            case 4:
                System.out.println("Digite a quantia em real:");
                double real4 =scanner.nextDouble();
                double pesoArgentino =real4/0.04;
                System.out.println("O valor de R$"+real4+" é equivalente a $"+pesoArgentino);
                System.out.println("A contação do dolar americano é R$5,24.");
                break;


        }


    }
}