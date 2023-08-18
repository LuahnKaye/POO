import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;

        while (true) {
            System.out.println("Calculadora Simples");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Zerar");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            
            if (opcao == 6) {
                System.out.println("Encerrando a calculadora.");
                break;
            }
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para ser somado: ");
                    resultado += scanner.nextDouble();
                    break;
                case 2:
                    System.out.print("Digite o valor para ser subtraído: ");
                    resultado -= scanner.nextDouble();
                    break;
                case 3:
                    System.out.print("Digite o valor para ser multiplicado: ");
                    resultado *= scanner.nextDouble();
                    break;
                case 4:
                    System.out.print("Digite o valor pelo qual dividir: ");
                    double divisor = scanner.nextDouble();
                    if (divisor != 0) {
                        resultado /= divisor;
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;
                case 5:
                    resultado = 0;
                    System.out.println("Cálculos zerados.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            
            System.out.println("Resultado atual: " + resultado);
        }
        
        scanner.close();
    }
}
