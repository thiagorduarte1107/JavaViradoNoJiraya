package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar a bebida alcolica");
        }

        if (isAutorizadoComprarBebida){
            // uso da negação dentro da condicional
            System.out.println("Nao autorizado a comprar bedida alcolica");
        }else {
            System.out.println("Autorizado a comprar a bebida alcolica");
        }
        boolean c = false;
        if (c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if");
    }
}
