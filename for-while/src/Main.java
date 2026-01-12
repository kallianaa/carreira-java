import java.util.Scanner;

public class Main  {
  void main (){
    Scanner entrada = new Scanner(System.in);

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();;

    int soma = 0;
    while (x !=0) {
      soma = soma + x;
      x = sc.nextInt();
    }

    System.out.println((soma));

    sc.close();
  }
}
