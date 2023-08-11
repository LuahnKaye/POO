public class App {
    public static void main(String[] args) throws Exception {
        notas(7.5, 8.0, 6.5);
        exibirNumeros(150, 200);
        ePrimo(17);
        DiaDaSemana(3);
        eBissexto(1995);
    }

    public static void notas(double ap1, double ap2, double ac) {
        double media = (ap1 + ap2) * 0.4 + ac * 0.2;
        System.out.println("Média: " + media);
    }

    public static void exibirNumeros(int inicio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void ePrimo(int num) {
        boolean ehPrimo = true;

        if (num <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }
    }

    public static void DiaDaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }

    public static void eBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }
    }
}