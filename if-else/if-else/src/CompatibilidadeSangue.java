import java.util.Scanner;

public class CompatibilidadeSangue {

    void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do doador: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o peso do doador (em kg): ");
        double peso = scanner.nextDouble();

        // 1. Verificação da Idade (Menor que 18 OU Maior que 65)
        if (idade < 18 || idade > 65) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos.");

            // 2. Verificação do Peso (Peso menor ou igual a 50)
        } else if (peso > 50) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve pesar mais de 50 kg.");

            // 3. Se não caiu em nenhum erro acima, está aprovado
        } else {
            System.out.println("O doador é compatível!");
        }

        scanner.close();
    }

}
