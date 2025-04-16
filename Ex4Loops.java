package ex4loops;
public class Ex4Loops {

    public static void main(String[] args) {
        
        int contador = 1;
        int primeiro = 0;
        int segundo = 1;
        
        while (contador<=10){
            System.out.println(primeiro);
            
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            
            contador++;
                    
        }
                
    }
}
