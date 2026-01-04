import java.util.Scanner;

public class VerificarIdade {
    void main() {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Por favor, digite sua idade: ");

        int idade = leitor.nextInt();
        String mensagem;
        if (idade >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem);
        leitor.close();
    }
}
