package CalculadoraDesconto;

import java.util.Scanner;

public class CalculadoraDescontoScanner {

    public static void main(String[] args) {
        System.out.println("=== Venha ver se o seu produto tem desconto! ===");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o valor do seu produto?");
        double precoProduto = entrada.nextDouble();
        final double percentualDesconto = 10;
        // quero que o desconto seja uma constante, ele não muda 
        System.out.println(
                "Parabéns, hoje a nossa loja está com " + percentualDesconto + "% de desconto na maioria dos produtos");

        double desconto = precoProduto * percentualDesconto / 100;
        System.out.println("Seu deconto final é de " + desconto + " reais");
        double precoFinal = precoProduto - desconto;
        System.out.println("Sendo assim, seu produto sai por apenas " + precoFinal + " reais!");

    }
}
