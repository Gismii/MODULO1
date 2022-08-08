import java.util.Scanner;

public class Arrayss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto"
                , "Setembro", "Outrubro", "Novembro", "Dezembro"};

        //int numeroMes;

        System.out.println("Informe um número inteiro para retornar o mês: ");
        int numeroMes = input.nextInt();
        for (int i = 0; i <12; i++) {
            if ((numeroMes - 1) == i) {
                System.out.println(nomes[i]);
            }
        }
    }
}