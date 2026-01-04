import java.util.Scanner;

public class ConversorMoedas {
    void main() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("-*-*-*-*- Conversor de moedas -*-*-*-*-");

        System.out.print("Por favor, digite o valor em Reais: R$ ");
        double valorReais = leitor.nextDouble();

        System.out.print("Por favor, digite a taxa de conversão: ");
        double taxaDeConversao = leitor.nextDouble();

        System.out.println("--------------------------------");

        double valorEmDolar = valorReais / taxaDeConversao;

        System.out.printf("O valor em dólares é: US$ %.2f", valorEmDolar);
        leitor.close();
    }

}
