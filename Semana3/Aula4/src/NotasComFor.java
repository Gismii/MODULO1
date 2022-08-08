import java.util.Scanner;
public class NotasComFor  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notas[] = new double[4];
        double somatorioNotas = 0;
        double media;
        for(int i = 0; i < notas.length; i++) {
            System.out.println("Informe a " + (i+1) + " ° nota:");
            notas[i] = scanner.nextDouble();
        }
        for(int i = 0; i < notas.length;i++){
            somatorioNotas += notas[i];
        }
        media = somatorioNotas/notas.length;
        if(media > 7) {
            System.out.println("Aprovado por média.");
        } else {
            System.out.println("Infome a nota da recuperação:");
            double notaRecuperacao = scanner.nextDouble();
            if(notaRecuperacao >= 7) {
                System.out.println("Aprovado na recuperação.");
            } else {
                System.out.println("Uhu aprovado!!.");
            }
        }
    }
}
