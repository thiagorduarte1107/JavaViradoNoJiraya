package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 12;
        String categoria;

        if (idade < 15){
            categoria = "CATEGORIA INFANTIL";
        }else if(idade >= 15 && idade < 18){
            categoria = "CATEGORIA JUVENIL";
        }else{
            categoria = "CATEGORIA ADULTO";
        }
        System.out.println(categoria);
    }
}
