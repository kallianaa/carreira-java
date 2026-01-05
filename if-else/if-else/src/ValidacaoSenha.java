import java.util.Scanner;

public class ValidacaoSenha {
    void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();
        String senhaCorreta = "1234";

        if (senhaDigitada.equals(senhaCorreta)){
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

        scanner.close();
    }

}
