import java.util.Scanner;

public class exercicio15 {
    public static void main(String args[]) {  
        int numero = 24;       //declara um numero
        int maiorDivisor = 1;  //declara maior divisor

        for (int i = 2; i<=numero; i++){ //loop for
            if (numero % i == 0) { //comando if
                maiorDivisor = i;
            }
        }
        System.out.println("O maior divisor é:" + maiorDivisor);
    }
    Scanner leia = new Scanner(System.in);
}        