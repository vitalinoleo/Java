package TiposDados;

import java.util.Scanner;

public class tiposDados {

    public static void main(String[] args) {
        System.out.println("==============================");
        Scanner scanner = new Scanner(System.in);
        // --------------------------------------------------------------- STRING
        System.out.println("Digite seu nome.");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome + ", Tudo bem?");
        // --------------------------------------------------------------- DOUBLE
        System.out.println("Qual é o seu peso?");
        double peso = scanner.nextDouble();
        System.out.println("Você pesa " + peso + " kilos.");
        // --------------------------------------------------------------- INT
        System.err.println("Qual sua idade?");
        int idade = scanner.nextInt();
        System.out.println("Sua idade é "+idade);
        // --------------------------------------------------------------- BOOLEAN
        System.out.println("True or false ?");
        boolean booleano = scanner.nextBoolean();
        System.out.println("O boleano dgitado foi " + booleano);

    }
}