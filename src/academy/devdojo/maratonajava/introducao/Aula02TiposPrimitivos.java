package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade =  10;
        long numeroGrande= 100000L;
        double salarioDouble = 2000.D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku ";

        System.out.println("A idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é " +nome);
    }
}
