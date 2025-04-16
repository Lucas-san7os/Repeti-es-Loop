package calculadora_de_rendimento;
import java.util.Scanner;


public class Calculadora_de_rendimento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String continuar = null;

        do {
            System.out.print("Digite o valor do investimento inicial (P): ");
            double P = teclado.nextDouble();

            System.out.print("Digite a taxa de juros anual (em %): ");
            double r = teclado.nextDouble();

            System.out.print("Digite o período do investimento (em anos): ");
            int t = teclado.nextInt();

            teclado.nextLine(); // limpa o buffer
            System.out.print("Tipo de capitalização (simples ou composta): ");
            String tipo = teclado.nextLine().toLowerCase();

            double M;

            if (tipo.equals("simples")) {
                M = P * (1 + (r / 100) * t);
            } else if (tipo.equals("composta")) {
                M = P * Math.pow(1 + (r / 100), t);
            } else {
                System.out.println("Tipo de capitalização inválido.");
                continue;
            }

            System.out.printf("Montante final após %d anos: R$ %.2f\n", t, M);

            System.out.print("Deseja fazer outro cálculo? (s/n): ");
            continuar = teclado.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        teclado.close();
        System.out.println("Programa encerrado.");
    }
}
