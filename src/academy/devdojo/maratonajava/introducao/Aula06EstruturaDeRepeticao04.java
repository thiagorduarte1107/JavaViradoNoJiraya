package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    // dado o valor de um carro descubra em quantas vezes pode ser parcelado
    // condição valorParcela <= 1000
    public static void main(String[] args) {

        double valorTotal = 83000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + "R$ " + valorParcela);
        }
        }
    }

