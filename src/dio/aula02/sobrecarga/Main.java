package dio.aula02.sobrecarga;

public class Main {
    public static void main(String[] args) {

        //chamando métodos
        //qual are estou querendo calcular depende da quantidade parametros passado

        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d); //tipos de dados diferentes
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f); //tipos de dados diferentes


    }
}

