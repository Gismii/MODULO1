import java.util.Scanner;

public class Patinhos {
    public static void main(String[] args) {
        Scanner sacnner=new Scanner(System.in);

        int qtdDePato=0;
        System.out.println("Digite a qtd: " );
        qtdDePato=sacnner.nextInt();
       int auxQ =qtdDePato;
        while (qtdDePato<=10){

              qtdDePato++;
                System.out.println(auxQ+" patinho foram caminhar, e apenas "+(auxQ-1)+"voltaram de la." );

                System.out.println("A mamae gritou QUAQUAQAQUA e os "+auxQ+" patinhos voltaram de la." );
            }

        qtdDePato++;
        }


    }


