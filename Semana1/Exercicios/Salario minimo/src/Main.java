import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double salarioMinimo = 1212.00;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        double salarioUsuario = entrada.nextDouble();
        double quantidadeSalario = salarioUsuario / salarioMinimo;
        System.out.println(String.format("Você recebe " + "%.2f",
                quantidadeSalario) +
                " salário(s) mínimos(s).");
    }
}