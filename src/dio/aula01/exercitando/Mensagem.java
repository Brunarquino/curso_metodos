package dio.aula01.exercitando;

public class Mensagem {
    //ultilização de um método dentro de outro método
    public static void obterMensagem(int hora) {
        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia(hora);
                break;
                // de 5 a meio dia é bom dia
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde(hora);
                break;
                //de uma á 5 horas é boa tarde
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite(hora);
                break;
                //de 18 a 4 horas é boa noite
            default: // caso o dado não seja o que está pedindo
                System.out.println("Hora inválida.");
                break;
        }
    }

    //Método mensagemBomDia
    public static void mensagemBomDia(int hora) {
        System.out.println("Bom dia, São " + hora + " horas");
    }

    public static void mensagemBoaTarde(int hora) {
        System.out.println("Bom tarde, São " + hora + " horas");
    }

    public static void mensagemBoaNoite(int hora) {
        System.out.println("Bom noite, São " + hora + " horas");
    }
}