import java.util.Scanner;

public class CompararNumeros {

    void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite numero inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro numero inteiro: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println("O maior número é " + numero1);
        } else if (numero2 > numero1){
            System.out.println("O maior número é " + numero2);
        }else {
            System.out.println("Os números são iguais!");
        }

        scanner.close();
    }
}
