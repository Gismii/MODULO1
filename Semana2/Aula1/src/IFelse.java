public class IFelse {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


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


