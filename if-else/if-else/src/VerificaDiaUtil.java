import java.util.Scanner;

public class VerificaDiaUtil {
    void main() {
        Scanner scanner = new Scanner(System.in);

        String diaDaSemana = "Domingo"; // Você pode mudar o valor para testar outros dias

        if (diaDaSemana.equals("Sábado") || diaDaSemana.equals("Domingo")) {
            System.out.println(diaDaSemana + " não é um dia útil.");
        } else {
            System.out.println(diaDaSemana + " é um dia útil.");
        }

        scanner.close();
    }

}
