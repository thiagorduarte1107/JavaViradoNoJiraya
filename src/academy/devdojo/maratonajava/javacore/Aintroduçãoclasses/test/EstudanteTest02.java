package academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Michelle";
        estudante2.idade = 32;
        estudante2.sexo = 'F';
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

        System.out.println("---------------");

        Estudante estudante = new Estudante();

        estudante.nome = "Thiago";
        estudante.idade = 32;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("---------------");

        Estudante estudante3 = new Estudante();

        estudante3.nome = "Breno";
        estudante3.idade = 6;
        estudante3.sexo = 'M';
        System.out.println(estudante3.nome);
        System.out.println(estudante3.idade);
        System.out.println(estudante3.sexo);
    }
}
