import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        double ladoA, ladoB, raio, areaCirculo, rQuadrado, subtracao;
        double potenciacao, divisao, multiplicacao, somatorio, a, b;

        String menuCalculadora = """
                1. Calcular a área do quadrado
                2. Cacular a área do círculo
                3. Soma
                4. Subtração
                5. Multiplicação
                6. Divisão
                7. Potência
                8. Raiz Quadrada
                9. Sair
                --------------
                """;

        while (escolha != 9) {
            System.out.println("-----Menu-----");
            System.out.println(menuCalculadora);
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o lado do Quadrado: ");
                    ladoA = sc.nextDouble();
                    System.out.println("Digite outro lado do quadrado");
                    ladoB = sc.nextDouble();
                    double areaQuadrado = ladoA * ladoB;
                    System.out.println("Área do quadrado: " + areaQuadrado);
                    break;
                case 2:
                    System.out.println("Digite o raio do círculo: ");
                    raio = sc.nextDouble();
                    areaCirculo = 3.14 * raio * raio;
                    System.out.println("Área do círculo: " + areaCirculo);
                    break;
                case 3:
                    System.out.println("Escolha um número para somar: ");
                    a = sc.nextDouble();
                    System.out.println("Escolha outro número: ");
                    b = sc.nextDouble();
                    somatorio = a + b;
                    System.out.println("A some é " + somatorio);
                    break;
                case 4:
                    System.out.println("Escolha um número para subtrair: ");
                    a = sc.nextDouble();
                    System.out.println("Escolha outro número: ");
                    b = sc.nextDouble();
                    subtracao = a - b;
                    System.out.println("A subtração é: " + subtracao);
                    break;
                case 5:
                    System.out.println("Escolha um número para multiplicar: ");
                    a = sc.nextDouble();
                    System.out.println("Escolha outro número: ");
                    b = sc.nextDouble();
                    multiplicacao = a * b;
                    System.out.println("A multiplicacão deu: " + multiplicacao);
                    break;
                case 6:
                    System.out.println("Escolha um número para divisão: ");
                    a = sc.nextDouble();
                    System.out.println("Escolha outro número: ");
                    b = sc.nextDouble();
                    divisao = a / b;
                    System.out.println("A divisão deu: " + divisao);
                    break;
                case 7:
                    System.out.println("Escolha um número de base para potência: ");
                    a = sc.nextDouble();
                    System.out.println("Agora escolha o número elevado: ");
                    b = sc.nextDouble();
                    potenciacao = Math.pow(a, b);
                    System.out.println("O resultado da potência é: " + potenciacao);
                    break;
                case 8:
                    System.out.println("Escolha o número para encontrar a raiz quadrada: ");
                    a = sc.nextDouble();
                    rQuadrado = Math.sqrt(a);
                    System.out.println("A raiz quadrada do número escolhido: " + rQuadrado);
                    break;
                default:
                    System.out.println("A calculadora não substitui o aprendizado, " +
                            "use somente para consulta, obrigado volte sempre!");
                    break;
            }
        }
    }
}