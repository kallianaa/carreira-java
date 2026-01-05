import java.util.Scanner;

public class NivelDeAcesso {

    void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código de acesso: ");
        int codigo = scanner.nextInt();

        System.out.println("Digite o nível de permissão (1, 2 ou 3): ");
        int nivel = scanner.nextInt();


        if (codigo == 2023 && (nivel >= 1 && nivel <= 3)) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");

        } else {
            System.out.println("Acesso negado.");

            if (codigo != 2023 && (nivel < 1 || nivel > 3)) {
                System.out.println("Motivo: Código incorreto e nível de permissão inválido.");

            } else if (codigo != 2023) {
                System.out.println("Motivo: Código incorreto.");

            } else {
                System.out.println("Motivo: Nível de permissão inválido.");
            }
        }

        scanner.close();
    }


}
