
import java.util.Scanner;
public class Datasheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual fabricante: ");
        String fabricante = scanner.next();

        switch (fabricante) {
            case"samsung":
                System.out.print("S20\n" +
                        "R$ 1.979,10\n" +
                        "M12\n" +
                        "R$ 1,049,00\n" +
                        "A03\n" +
                        "R$ 674,10\n");
                break;
            case"motorola":
                System.out.print("G22\n" +
                        "R$ 1.158,10\n" +
                        "E32\n" +
                        "R$ 1.079,10\n" +
                        "E6i\n" +
                        "R$ 809,10\n");
                break;
            case"aplle":
                System.out.print("IPhone 13\n" +
                        "R$ 5.999,00\n" +
                        "IPhone 11\n" +
                        "R$ 3.499,00\n" +
                        "IPhone SE\n" +
                        "R$  2.599,00\n");
                break;

        }


    }
}






