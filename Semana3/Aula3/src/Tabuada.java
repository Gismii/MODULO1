import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);
        //int patinhos=10;
        System.out.println("Digite n: ");
        int n = sacnner.nextInt();

        for (int i = 1; i <=11; i++) {
            System.out.print(n + "*" + i + "=" + (n * i+","));

        }
    }
}


