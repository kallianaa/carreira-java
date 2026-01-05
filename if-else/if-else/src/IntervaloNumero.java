import java.util.Scanner;

public class IntervaloNumero {
    void main (){
        Scanner scanner = new Scanner(System.in);



        System.out.println("Digite o valor do empréstimo: R$ ");
        double numero = scanner.nextDouble();

        if(numero >= 1000 && numero <= 5000){
            System.out.println("O valor "+ numero + ", está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor "+ numero + ", não está dentro do intervalo permitido para empréstimo.");
        }

        scanner.close();
    }
}
