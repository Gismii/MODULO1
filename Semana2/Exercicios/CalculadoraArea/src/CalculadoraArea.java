import java.util.Scanner;
public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcular a área, escolha uma das opções: ");
        System.out.print("1 - Quadrado\n" +
                "2 - Retângulo\n" +
                "3 - Círculo\n" +
                "4 - Trapézio\n");
        int opcao=scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Qual tamnaho do quadrado em metro?  ");
                int tamanhoQ= scanner.nextInt();
                System.out.print("Seu quadrado tem "+(tamanhoQ*4)+" m² de area!");
                break;

            case 2:
                System.out.println("Qual altura do retangulo em metros?  ");
                int alturaR= scanner.nextInt();
                System.out.println("Qual comprimento?  ");
                int comprimentoR= scanner.nextInt();
                System.out.print("Seu retangulo tem "+(comprimentoR*alturaR)+" m² quandrados de area!");
                break;
            case 3:
                System.out.println("Qual diamentro do circulo em cm²?");
                int diametroC= scanner.nextInt();
                int raio=diametroC/2;
                double pi=3.14;
                double caclculo= raio*raio*pi;

                System.out.print("Seu circulo tem "+(caclculo)+" cm² metros quandrados de area!");
                break;
            case 4:
                System.out.println("Qual altura do seu t rapézio em metros?  ");
                int alturaT= scanner.nextInt();
                System.out.println("Qual comprimento do lado maior ?  ");
                int comprimentoDoladoMaiorT= scanner.nextInt();
                System.out.println("Qual comprimento do lado oposto do lado maior ?  ");
                int comprimentoDoladoOpostoT= scanner.nextInt();
                System.out.print("Seu trapezio tem "+((comprimentoDoladoMaiorT+comprimentoDoladoOpostoT)*80/2)+" m² quandrados de area!");
                break;



        }

    }
}