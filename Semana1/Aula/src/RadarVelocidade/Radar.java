package RadarVelocidade;

import java.util.Scanner;

public class Radar {
    public static void main(String[] args){
        Scanner sacnner = new Scanner(System.in);
        String distancia = "1";//1.0
        System.out.println("Informe o tempo:");
        double tempoDeslocamento = sacnner.nextDouble();
        double velocidadeMedia = tempoDeslocamento * Double.parseDouble(distancia)/tempoDeslocamento;
        System.out.println("A velocidade é " + velocidadeMedia + "m/s");
    }
}
