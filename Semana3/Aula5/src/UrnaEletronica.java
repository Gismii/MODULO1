import java.util.Scanner;

public class UrnaEletronica {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);


        int Zé = 0;
        int Maria = 0;
        int Tonho = 0;
        int Fernanda = 0;
        int Nulo = 0;
        int Branco = 0;
        int voto = 0;
        int encerra;


        do System.out.println("1 - Zé do bar\n" +
                "2 - Maria do bairro\n" +
                "3 - Tonho\n" +
                "4 - Fernanda Cruz de la paz\n" +
                "5 - Nulo\n" +
                "6 - Branco\n" +
                "Entre com seu voto: ");

        // fazer com o swit