public class OperadoresMatematico {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x = 12;
        int y = 3;

        int adicao = (x + y);
        int subtração = (x - y);
        int divisão = (x / y);
        int multiplicao = (x * y);
        int restoDaDivisão = (x % y);
        int incremento = x++;
        int decremento = y--;


        //System.out.println("teste" + incremento);

        if (x > y) {
            System.out.println("MAIOR QUE");
            System.out.println("X é maior que Y!");
            System.out.println("***********************************************");
        }
        if (y < x) {
            System.out.println("MENOR QUE");
            System.out.println("y é menor que x!");
            System.out.println("***********************************************");
        }
        if (x >= y) {
            System.out.println("MAIOR OU IGUAL");
            System.out.println("X não é igual a Y mas é maior que Y!");
            System.out.println("***********************************************");

        }
        if (y <= x) {
            System.out.println("MENOR OU IGUAL");
            System.out.println("Y não é igual a X, mas é menor que X!");
            System.out.println("***********************************************");
        }
        if (x == 12) {
            System.out.println("IGUALDADE");
            System.out.println("X é iugual a 12!");
            System.out.println("***********************************************");
        }
        if (y != x) {
            System.out.println("DIFERENTE");
            System.out.println("Y é diferente de X!");
            System.out.println("***********************************************");
        }
        if (y > 1 || x == 12) {
            System.out.println("OU");
            System.out.println(" Tanto o X quanto o Y estão com os valores corretos no teste, então se um ou outro for verdadeiro esse print seria mostrado. !");
            System.out.println("***********************************************");
        }
        if (x == x++) {
            System.out.println("IGUALDADE");
            System.out.println("o X e X++  tem o valor de 12!");
            System.out.println("***********************************************");

        }
        if (restoDaDivisão == 0 && divisão == 4) {
            System.out.println(" E ");
            System.out.println("12/3 resta 0, e 12/3 é 4!");
            System.out.println("***********************************************");
        }
    }
}