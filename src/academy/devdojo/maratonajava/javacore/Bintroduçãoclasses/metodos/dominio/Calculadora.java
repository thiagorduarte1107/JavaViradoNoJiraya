package academy.devdojo.maratonajava.javacore.Bintroduçãoclasses.metodos.dominio;

public class Calculadora {
    public void somaDoisNumeros (){

        System.out.println(10+10);
    }
    public void subtraiDoisNumeros (){

        System.out.println(20-1);
    }
    public void multiplicaDoisNumeros (float num, float num2){
        System.out.println(num*num2);
    }
    public float divideDoisNumeros (float num, float num2){

        if (num2 == 0) {
            return num;
        }
        System.out.println(num/num2);
        return num;
    }
    public void alteraDoisNumeros (int num1, int num2){
        int num = num1;
        num2 = num;
        num1 = num2;
    }

    public void somaArray (int[] numeros ){
    int soma = 0;
    for (int num : numeros ) {
         soma += num ;
    }
        System.out.println(soma);
    }

    public void somaVarArgs (int... numeros){
        int soma = 0;
        for (int num : numeros ) {
            soma += num ;
        }
        System.out.println(soma);
    }



}
