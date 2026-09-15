import java.util.Scanner;

public class coloqueEmOrdem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=== Vamos colocar em ordem os numeros ===");
        System.out.println("Qual o primeiro numero?");
        int primeiroNumero = entrada.nextInt();
        System.out.println("Qual o segundo numero?");
        int segundoNumero = entrada.nextInt();
        System.out.println("Qual o terceiro numero?");
        int terceiroNumero = entrada.nextInt();

        if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero) {
            if (segundoNumero < terceiroNumero && segundoNumero > primeiroNumero) {
                System.out.println(primeiroNumero);
                System.out.println(segundoNumero);
                System.out.println(terceiroNumero);
            }else{
                System.out.println(primeiroNumero);
                System.out.println(terceiroNumero);
                System.out.println(segundoNumero);
            }
            
        }else if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
            if (primeiroNumero > segundoNumero && primeiroNumero < terceiroNumero) {
                System.out.println(segundoNumero);
                System.out.println(primeiroNumero);
                System.out.println(terceiroNumero);
                
            }else{
                System.out.println(segundoNumero);
                System.out.println(terceiroNumero);
                System.out.println(primeiroNumero);
            }
            
        }else if (terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero) {
            if (segundoNumero > terceiroNumero && segundoNumero < primeiroNumero) {
                System.out.println(terceiroNumero);
                System.out.println(segundoNumero);
                System.out.println(primeiroNumero);
                
            }else{
                System.out.println(terceiroNumero);
                System.out.println(primeiroNumero);
                System.out.println(segundoNumero);
            }
            
        }

    }
    
}
