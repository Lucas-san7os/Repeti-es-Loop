package ex11loops;
public class Ex11Loops {

    public static void main(String[] args) {
       int[] numeros = {5, 8, 2, 10, 3, 7, 1, 4, 6, 9}; // vetor com 10 valores inteiros
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}
