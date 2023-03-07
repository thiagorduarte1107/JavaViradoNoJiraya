package academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroduçãoclasses.dominio.Professor;
//ATRIBULTO
public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre kami";
        professor.sexo = 'M';
        professor.idade = 180;

        System.out.println(professor.nome+" Idade "+ professor.idade +" Sexo "+ professor.sexo);
    }
}
