package ex10loops;
import java.util.Scanner;


public class Ex10Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite um numero inteiro positivo:");
        int numero = scanner.nextInt();
        
        long fatorial = 1;
        
        for (int i= 1; i <= numero; i++){
            fatorial *=i;
        }
        System.out.println("O fatorial de" + numero + "e:"+ fatorial);
        }
    }

