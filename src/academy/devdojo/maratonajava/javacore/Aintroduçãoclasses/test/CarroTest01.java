package academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Chevette";
        carro.modelo = "Chevrolet";
        carro.ano = 1989;
        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println("---------------");

        Carro carro01 = new Carro();
        carro01.nome = "Sandero";
        carro01.modelo = "Renault";
        carro01.ano = 2018;
        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);
    }
}
