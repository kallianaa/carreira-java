import java.util.Scanner;

public class ClassificacaoCategoria {

    void main() {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Por favor, digite o preço do produto: ");

        double preco = leitor.nextDouble();
        String categoria;

        if (preco <= 50.00) {
            // Se for menor ou igual a 50
            categoria = "Econômico";
        } else if (preco <= 200.00) {
            // Se não for econômico, mas for menor ou igual a 200 (cobre 50.01 até 200)
            categoria = "Intermediário";
        } else {
            // Se for qualquer valor acima de 200
            categoria = "Premium";
        }

        System.out.println("Categoria do produto: " + categoria + ".");


        leitor.close();
    }

}