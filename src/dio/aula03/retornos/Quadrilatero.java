package dio.aula03.retornos;

public class Quadrilatero {

    //retorna o valor desejado

    public static double area(double lado) {

        return lado * lado;
    }

    public static double area(double lado1, double lado2) {

        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        return ((baseMaior+baseMenor)*altura) / 2;
    }

    public static void xpto() {

        System.out.println("Antes");
        return;
    }

    /*public static long abc() {
     *   return 1.6;
    }*
    Erro de compatibilidade*/

    public static double abc() {
        return 1.6;
    }

    //ou

    /*public static long abc() {
    *    return 1;
    }*/



    //estaria compativel

}

