import java.util.Scanner;

public class WhileIndeterminado {
    void main (){
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")) {
            System.out.println("Você diz: ");
            valor = entrada.nextLine();
        }
        entrada.close();
    }
}
