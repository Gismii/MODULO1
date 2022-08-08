import java.util.Scanner;
public class ParesEimpraes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = 0;
        //int p = 0;
        int entre = 10;
        System.out.println("ÍMPA: ");
        while (Y <= 10) {
            if (Y % 2 == 1) {

                System.out.println(Y);
            }
            Y++;
        }
                System.out.println("PAR: ");

        for (int a = 0; a <=entre; a++) {

            if (a % 2 == 0) {

                System.out.println(a);

            }

        }
    }
}