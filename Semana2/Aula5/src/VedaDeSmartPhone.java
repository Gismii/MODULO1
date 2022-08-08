import java.lang.Package;
import java.util.Scanner;

public class VedaDeSmartPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1-Samsung, 2-Motorola, 3-Apple");
        System.out.print(" - Digite o fabricante:");
        int fabricante = scanner.nextInt();
        float s20;
        switch (fabricante) {
            case 1:
                System.out.println(" Samsung - S20\n" +
                        "R$ 1.979,10\n" +
                        "M12\n" +
                        "R$ 1,049,00\n" +
                        "A03\n" +
                        "R$ 674,10\n");
                System.out.println("Qual modelo irá levar? ");
                String modeloSamsung = scanner.next();
                switch (modeloSamsung) {
                    case"S20":
                         s20 = 1979.0f;

                }

        }


    }
}


