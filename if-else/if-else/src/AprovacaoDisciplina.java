import java.util.Scanner;

public class AprovacaoDisciplina {
    void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota do aluno: ");
        double nota3 = scanner.nextDouble();



        double media = (nota1 + nota2 + nota3) / 3;


        if (media >= 7.0) {
            System.out.printf("O aluno teve média %.2f e foi aprovado.%n", media);
        } else if (media >= 5.0) {
            System.out.println("O aluno teve média %.2f e " + media + " está de recuperação.");
        } else {
            System.out.println("O aluno teve média %.2f e " + media + " foi reprovado.");
        }
        scanner.close();
    }

}
