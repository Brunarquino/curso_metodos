package dio.aula02.sobrecarga;

public class Quadrilatero {

    //mudança de assinatura

    //Sobrecarga: Pq se mantem o nome do método, mas muda a lista de parâmetros.
    // O nome do método é sempre o mesmo, porém em todos os casos os parâmetros são diferentes.

    public static void area(double lado) {
        System.out.println("Área do quadrado:" + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

    //tipos de dados diferentes
    //so o nome dos paremetros não adianta a mudança

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }

}

