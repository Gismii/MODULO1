public class OperacoesLogicas {
    public static void main(String[] args) {
        boolean fazendoSol, possuirDinheiro, chuva, frio;


        fazendoSol = false;
        possuirDinheiro = false;
        if (fazendoSol && possuirDinheiro) {
            System.out.println("1");
        } else if (fazendoSol) {
            System.out.println("2");

        }
        chuva = true;
        frio = false;
        if (chuva || possuirDinheiro) {
            System.out.println("3");

        }
        if (chuva || frio) {

            System.out.println("3");
        }
    }
}

// praticamos os operadores logico "!" && relacionado atabela verdade!