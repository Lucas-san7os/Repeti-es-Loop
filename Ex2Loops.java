package ex2loops;
import java.util.Scanner;

public class Ex2Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int numero;
        int soma = 0;
        
        System.out.println("Digite um numero positivo para somar:");
        numero = scanner.nextInt();
        
        while(numero >=0){
            soma += numero;
            numero = scanner.nextInt();
        }
        
        System.out.println("Soma dos numeros:"+soma);
                    
        }

    }
