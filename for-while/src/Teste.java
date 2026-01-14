import java.util.Scanner;

public class Teste {
    void main (){

            Scanner entrada = new Scanner(System.in);

            int quantidadeNotas = 0;
            double nota = 0;
            double total = 0;

            while (nota != -1){
                System.out.println("Digite uma nota ou -1 para sair: ");
                nota = entrada.nextDouble();

                if(nota <= 10 && nota >= 0){
                    total += nota;
                    quantidadeNotas++;
                }
            }

            double media = total / quantidadeNotas;
            System.out.println("A média das notas é: " + media);

            entrada.close();
    }
}
