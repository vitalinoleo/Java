import java.util.Scanner;

public class qualSenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int senha = 1234;
        System.out.println("Qual a senha?");
        int senhaDigitada = entrada.nextInt();
        if (senhaDigitada == senha) {
            System.out.println("Acesso permitido!!");
        }else{
            System.out.println("Acesso negado!!");
        }
    }
}
