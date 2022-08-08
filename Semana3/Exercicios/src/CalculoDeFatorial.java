import java.util.Scanner;

public class CalculoDeFatorial {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite o nemero a ser trabalhado: ");
        numero=entrada.nextInt();
        long fact=1;
        //int fact=1;

        for(int i =1; i<=numero; i++){

            fact=fact*i;
        }
        float resul = fact;
        System.out.println(" O fatorial de "+numero+" é "+resul+"!");
    }
}
