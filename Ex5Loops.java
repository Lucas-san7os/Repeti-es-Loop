package ex5loops;
import java.util.Scanner;

public class Ex5Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int numero;
        
        do {
            System.out.println("Digite um numero entre 1 e 100");
            numero = scanner.nextInt();
        } while (numero<1 || numero>100);
        
        System.out.println("Numero valido"+ numero);
        
    }
}
