package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 70000;
        double taxa;
        double imposto;
        if (salario <= 34712.00) {
            taxa = 9.70;
            imposto = ((salario / 100) * taxa);
        } else if (salario > 34712.00 && salario <= 68587.00) {
            taxa = 37.35;
            imposto = ((salario / 100) * taxa);
        } else {
            taxa = 49.50;
            imposto = ((salario / 100) * taxa);
        }
        System.out.println("Valor pago anual: R$" + imposto);
    }
}