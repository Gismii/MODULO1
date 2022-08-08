
import java.util.Scanner;
public class consumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantos KM rodados:");
        double kmRodado = scanner.nextDouble();
        System.out.println("Informe a quantidade de combustivel gasto: ");
        double totalDeCombustivel = scanner.nextDouble();
        double totalConsumoMedio = kmRodado /totalDeCombustivel;
        System.out.println(String.format("Voce andou " + "%.0f", kmRodado) + " quilometros, e gastou " + totalDeCombustivel + " litros de combustivel!");
        System.out.println(".........");
        System.out.println("Gostaria de saber a média de consumo do seu veiculo? Digite 1 para (Sim) 0 para (Não).");
        int resposta = scanner.nextInt();

        if (resposta == 1){
         System.out.println("Sua média de consumo é: " + totalConsumoMedio + " KM para cada 1L de combustivel!");
        } else if (resposta == 0) {
            System.out.println("Se beber, não dirija!");

        } else {
            System.out.println("Resposta invalida :( repita a operação!");
        }
    }
}