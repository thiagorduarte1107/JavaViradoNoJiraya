package academy.devdojo.maratonajava.javacore.Bintroduçãoclasses.metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroduçãoclasses.metodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroduçãoclasses.metodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Thiago";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Breno";
        estudante02.idade = 8;
        estudante02.sexo = 'M';


        impressora.imprime(estudante01);
        impressora.imprime(estudante02);


    }
}
