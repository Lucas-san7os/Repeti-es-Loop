package ex6loops;
import java.util.Scanner;

public class Ex6Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int opcao;
        
        do {
            System.out.println("1- Adicionar");
            System.out.println("2- Remover");
            System.out.println("3- Sair");
            System.out.println("Digite a opcao");
            opcao = scanner.nextInt();
            
            if (opcao == 1){
                System.out.println("Voce escolheu adicionar");
            } else if (opcao == 2){
                System.out.println("Voce escolheu remover");
            } else if (opcao != 3){
                System.out.println("Opção invalida");
            }
            
        } while (opcao != 3);
        
        System.out.println("Programa finalizado");
                       
            }
        }

