import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class tentativa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senha = 1234;

        System.out.println("Digite a senha:");
        int digiteSenha = entrada.nextInt();
        if (digiteSenha != senha) {
            System.out.println("Senha incorreta!"
                + "\nTente novamente!"
            );
            return;
        }else{
            System.out.println("Acesso liberado!");
        }
        // so que dessa forma, se o usuario errar o código termina 
    }
}
