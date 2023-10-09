import java.util.Scanner;

public class exercicio25 {
    public static void main(String args[]) {
        int n = 10;
        int primeiro = 0, segundo = 1;
        System.out.println("Sequência de Fibonacci: " + primeiro + ", " + segundo);
        
        for (int i = 2; i < n; i++) {
            int proximo = primeiro + segundo;
            System.out.print(", "+ proximo) ;
            primeiro = segundo;
            segundo = proximo;
        }
    }
    Scanner leia = new Scanner(System.in);
}
