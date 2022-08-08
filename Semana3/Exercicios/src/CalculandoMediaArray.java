import java.util.Scanner;

public class CalculandoMediaArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double notas[] = new double[4];
        double somatorioNotas = 0;
        double media;
       // media = somatorioNotas / notas.length;


        System.out.println("1 - Adicionar nota\n" +
                "2 - calcular média\n" +
                "3 - encerrar\n");
        System.out.println("Escolha: ");


        int escolha = scanner.nextInt();

        while (escolha != 3) {

            switch (escolha) {
                case 1:
                    for (int i = 0; i < notas.length; i++) {
                        System.out.println("Informe a " + (i + 1) + " ° nota:");
                        notas[i] = scanner.nextDouble();

                    }

                    System.out.println("1 - Adicionar nota\n" +
                            "2 - calcular média\n" +
                            "3 - encerrar\n");
                    System.out.println("Escolha: ");

                    escolha = scanner.nextInt();

                case 2:
                    for (int i = 0; i < notas.length; i++) {
                        somatorioNotas += notas[i];
                    }
                     media = somatorioNotas / notas.length;
                    System.out.println("Escolha:  (1 - NOTA PARCIAL, e 2 - NOTA COMPLETA) : ");
                    int two = scanner.nextInt();
                    switch (two) {

                        case 1:

                            if (somatorioNotas > 0) {

                                System.out.println("Sua nota parcial é: " + media);

                            } else {

                                System.out.println(" ❌ Para se obter a media parcial é preciso informar alguma nota!!");
                                System.out.println("----------------------");

                            }

                            System.out.println("1 - Adicionar nota\n" +
                                    "2 - calcular média\n" +
                                    "3 - encerrar\n");
                            System.out.println("Escolha: ");

                            escolha = scanner.nextInt();

                    }
                    switch (escolha) {
                        case 2:

                            if (notas[0] > 1 && notas[1] > 1 && notas[2] > 1 && notas[3] > 1) {

                                System.out.println("Sua nota total é: " + media);


                            } else {

                                System.out.println(" ❌ Para se obter a media total é preciso informar todas as notas!!");
                                System.out.println("----------------------");

                            }

                            System.out.println("1 - Adicionar nota\n" +
                                    "2 - calcular média\n" +
                                    "3 - encerrar\n");
                            System.out.println("Escolha: ");

                            escolha = scanner.nextInt();
                    }

            }
        }

    }
}

