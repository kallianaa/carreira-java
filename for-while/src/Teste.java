import java.util.Scanner;

public class Teste {
    void main (){


        System.out.println("============================");
        double[] carrinhoDeCompras
                = new double[] { 57.0, 175.0, 25.0, 10.0 };

        double valorTotalDoCarrinho = 0.0;

        for (int i = 0; i < carrinhoDeCompras.length; i++) {
            valorTotalDoCarrinho += carrinhoDeCompras[i];
            System.out.println(">>>> Iteração " + i);
            System.out.println(">> Valor do produto corrente R$"
                    + carrinhoDeCompras[i] + ".");
            System.out.println(">> O total parcial é de R$"
                    + valorTotalDoCarrinho + ".");
        }
        System.out.println("O valor total é:" + valorTotalDoCarrinho);
        System.out.println("Fim!");
        System.out.println("============================");
    }
}
