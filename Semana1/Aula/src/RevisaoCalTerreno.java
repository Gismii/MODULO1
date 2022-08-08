import java.util.Scanner;

public class RevisaoCalTerreno {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a largura do terreno:");
        double largura = scanner.nextDouble();
        System.out.println("Informe o comprimento do terreno:");
        double comprimento = scanner.nextDouble();
        double area =(largura + comprimento);
        System.out.println("Seu terreno tem um tamanho de" + area * largura );

    }
}