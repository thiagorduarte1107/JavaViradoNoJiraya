package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int var = 0;
        while (var <= 10) {
            System.out.println(var++);
        }
        var = 0;
        do {
            System.out.println("dentro do do-while " + ++var);
        } while (var < 10);

        for (int i=0;i<10;i++){
            System.out.println("For "+i);
        }
    }
}
