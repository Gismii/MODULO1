import java.util.Scanner;
public class Whilee {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String continuar;
        int escolha;
        System.out.println("Digite de 1 a 10:");
            escolha=scanner.nextInt();
        while ( escolha < 1 || escolha> 10){
            System.out.println("Digite de 1 a 10:");
            escolha=scanner.nextInt();

        }
    }
}