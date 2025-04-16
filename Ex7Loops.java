package ex7loops;
import java.util.Random;
import java.util.Scanner;

public class Ex7Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random aleatorio = new Random();
        
        int numeroSorteado = aleatorio.nextInt(20)+ 1;
        int palpite;
        int tentativas = 0;
        
        do{
            System.out.println("Digite seu palpite entre 1 a 20:");
            palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite>numeroSorteado){
                System.out.println("Muito alto. Escolha outro numero");
            }else if (palpite<numeroSorteado){
                System.out.println("Muito baixo. Escolha outro numero");
            }
        }while (palpite != numeroSorteado);
            System.out.println("Voce acertou em:"+ tentativas );
                    
            
    }
}
