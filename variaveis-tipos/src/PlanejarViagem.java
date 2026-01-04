import java.util.Scanner;

public class PlanejarViagem {
    void main (){
    Scanner leitor = new Scanner(System.in);

    System.out.println("-*-*-*-*- Planejamento de Viagem -*-*-*-*-");

    // Pergunta 1: Consumo
    System.out.print("Digite o consumo médio (km/l): ");
    double consumoMedio = leitor.nextDouble();

    // Pergunta 2: Tamanho do tanque
    System.out.print("Digite a capacidade total do tanque (litros): ");
    double capacidadeTanque = leitor.nextDouble();

    // Pergunta 3: Quanto tem de gasolina agora
    System.out.print("Digite a quantidade atual de combustível (litros): ");
    double combustivelAtual = leitor.nextDouble();

    // Pergunta 4: Distância da viagem
    System.out.print("Digite a distância da viagem (km): ");
    double distanciaViagem = leitor.nextDouble();

    // 3. O resto da lógica continua igual (Fórmulas)
    double autonomiaMaxima = consumoMedio * capacidadeTanque;
    double autonomiaAtual = consumoMedio * combustivelAtual;

    System.out.println("--------------------------------");
    System.out.println("Autonomia máxima: " + autonomiaMaxima + " km");
    System.out.println("Autonomia atual: " + autonomiaAtual + " km");
    System.out.println("--------------------------------");


        leitor.close();
    }
}
