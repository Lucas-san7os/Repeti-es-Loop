package ex8loops;
import java.util.Scanner;

public class Ex8Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double nota;
        double soma= 0;
        int quantidade= 0;
        String resposta;
        
        do{
            System.out.println("Digite uma nota entre (0 e 10)");
            nota= scanner.nextDouble();
            
            if (nota >= 0 && nota <= 10){
                soma += nota;
                quantidade++;
            }else{
                System.out.println("Nota invalida. Digite uma nota entre (0 e 10)");
            }
            
            System.out.println("Deseja inserir outra nota?(s/n)");
            resposta = scanner.next(); //Respoder apenas com s ou n se não da errado
            
        } while (resposta.equalsIgnoreCase("s"));
        
        if (quantidade >0){
            double media = soma / quantidade;
            System.out.println("A media das notas e:"+ media);
        } else {
            System.out.println("Nenhuma nota valida foi inserida");
        }
            
  
    }
}

