import java.util.Scanner;
public class FrutasArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Frutas = {"Maçã", "Pêra", "Uva", "Goiaba", "Mamão", "Limão", "Laranja", " Melão"};
        String selecioneFruta;
        boolean NaoPossuiFruta = true;

        System.out.println("Escolha Sua fruta: ");
        selecioneFruta = scanner.next();

        for (int i = 0; i < Frutas.length; i++) {
            if (Frutas[i].equals(selecioneFruta)) {
                NaoPossuiFruta = false;
                System.out.println("Vendemos esta fruta aqui!!");

            }

        }
         if(NaoPossuiFruta){
             System.out.println("Não tem desta fruta aqui");
         }
    }

}
