import java.util.Scanner;
public class Cor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Cor = {"Azul", "roxo", "Black"};
        String selecioneCor;
        boolean NaoPossuiRoxo = false;

        System.out.println("Escolha essa cor : ");
        selecioneCor = scanner.next();

        for (int i = 0; i < Cor.length; i++) {
            if (Cor[i].equals(selecioneCor)) {
                NaoPossuiRoxo = true;
                System.out.println("Amo essa cor!!");

            }

        }
        if( selecioneCor != "roxo"){
            System.out.println("Palhaçada");
        }
    }

}

