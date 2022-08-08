import java.util.Scanner;
public class SomatorioEmLoop {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        int soma = 0;
        int contador = 0;

        do{
            System.out.println("Informe o numero: ");
            numero = entrada.nextInt();

            if(numero >= 0){
                soma = numero + soma;
                contador++;
            }
            if (numero ==0){
                break;
            }
        } while(numero >= 0);

        System.out.println("Somatorio dos numeros informados: " + soma);


    }
}
