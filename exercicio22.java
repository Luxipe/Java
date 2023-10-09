import java.util.Scanner;

public class exercicio22 { //classe do exercicio
    public static void main(String args[]) {
        int numero = 25; 
        int fatorial = 1; 
        for (int i = 1; i<= numero; i++) { //for é um loop
            fatorial =fatorial* i; //vai dar o fatorial mais o resultado final
        }
        System.out.println("O fatorial do número é " + fatorial);
    }    
    Scanner leia = new Scanner(System.in);
}
