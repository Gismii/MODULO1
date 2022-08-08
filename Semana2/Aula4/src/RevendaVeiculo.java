import java.util.Scanner;

public class RevendaVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual modelo?: ");
        String veiculo = scanner.next();
        //String moto = scanner.next();
        //String veiculoDois = scanner.next();


        switch (veiculo) {
            case "hatch":
                System.out.println("Temos esse modelo sim.! Vamos fechar acompra? ");
                String decisao = scanner.next();
                switch (decisao) {
                    case "sim":
                        System.out.print("Compra efetuado com sucesso!!");
                        break;
                    case"motoca":
                        System.out.print("Não trabalhamos com esse modelo!");
                        break;
                    case "nao":
                        System.out.print("volte sempre!! ");
                        break;


                }
        }
    }
}