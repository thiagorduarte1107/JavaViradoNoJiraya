package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        byte dia = 7;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                System.out.println("Final de Semana");
                break;
            case 2:
                System.out.println("Segunda");
                System.out.println("Dia util");
                break;
            case 3:
                System.out.println("Terça");
                System.out.println("Dia util");
                break;
            case 4:
                System.out.println("Quarta");
                System.out.println("Dia util");
                break;
            case 5:
                System.out.println("Quinta");
                System.out.println("Dia util");
                break;
            case 6:
                System.out.println("Sexta");
                System.out.println("Dia util");
                break;
            case 7:
                System.out.println("Sabado");
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
