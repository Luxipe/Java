import java.util.Scanner;

public class exercicio16 {
    public static void main(String args[]) {  
        int numero = 13;       //declara um numero
        int menordivisor = 1;  //declara menor divisor

        for (int i = 2; i<=numero; i++){ //loop for
            if (numero % i == 0) { //comando if
                menordivisor = i;
            }
        }
        System.out.println("O menor divisor é:" + menordivisor);
    }
    Scanner leia = new Scanner(System.in);
}        
