import java.util.Scanner;

public class idadeParaVotar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int ANO = 2026;
        System.out.println("Em qual ano você nasceu?");
        int anoNascimento = entrada.nextInt();
        int idade = ANO - anoNascimento;
        if (idade >= 16) {
            System.out.println("pode votar!!!");

        }else{
            System.out.println("Não pode votar");
        }
                System.out.println("sua idade é "+idade+" anos.");

    }
}
