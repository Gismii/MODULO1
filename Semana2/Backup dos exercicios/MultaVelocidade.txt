import java.util.Scanner;

public class MultaVelocidadeRadar {

    public static double multaBaixa = 50.00;
    public static double multaModerada = 100.00;
    public static double multaAlta = 300.00;

    public static void main(String[] args) {
        int velocidadeVeiculo, velocidadeMaximaVia;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a velocidade maxima permitida da via: ");
        velocidadeMaximaVia = scanner.nextInt();
        System.out.print("Informe o excesso de velocidade do veiculo: ");
        velocidadeVeiculo = scanner.nextInt();
        int excesso = velocidadeVeiculo - velocidadeMaximaVia;



        if (excesso > 0 && excesso <= 10) {
            System.out.println("Excesso de velocidade de " + excesso + "km/h, multado em R$" + multaBaixa + ".");
        } else if (excesso > 10 && excesso <= 30) {
            System.out.println("Excesso de velocidade de " + excesso + "km/h, multado em R$" + multaModerada + ".");

        }
        if (excesso > 30) {
            System.out.println("Excesso de velocidade de " + excesso + "km/h, multado em R$" + multaAlta + ".");


        }
    }
}