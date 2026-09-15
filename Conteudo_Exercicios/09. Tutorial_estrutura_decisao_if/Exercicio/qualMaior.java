import java.util.Scanner;

public class qualMaior {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o primeiro numero?");
        int primeiroNumero = entrada.nextInt();
        System.out.println("Qual o segundo numero?");
        int segundoNumero = entrada.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O numero maior é o "+primeiroNumero+", primeiro numero digitado.");
            
        }else{
            System.out.println("O numero maior é "+segundoNumero+", segundo numero digitado.");
        }
    }
}