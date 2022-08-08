import java.util.Scanner;

public class Fruta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qual fruta: ");
        String fruta = scanner.next();

        switch (fruta) {
            case "macan":
                System.out.println("Não temos na loja!");
                break;
            case "uva":
                System.out.println("Apenas 3 unidades");
                break;
            case "Banana":
                System.out.println("Promoção de R$1,99 a caixa!");
                break;
            default :
                System.out.println( "Veja nossocardapio https://github.com/Gismii");


        }
    }
}