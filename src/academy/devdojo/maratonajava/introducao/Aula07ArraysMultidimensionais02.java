package academy.devdojo.maratonajava.introducao;

public class Aula07ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[4][];
        arrayInt[0] = new int[]{10,20};
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[] {1, 2, 3, 4, 5, 6};
        arrayInt[3] = new int[] {10, 20, 30, 40, 50, 60};

        int [][]arrayInt2={{0,0},{0,0,0},{0,0,0,0,0,0}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n ------------");
            for (int num : arrayBase) {
                System.out.println(num + " ");
            }
        }
    }
}
