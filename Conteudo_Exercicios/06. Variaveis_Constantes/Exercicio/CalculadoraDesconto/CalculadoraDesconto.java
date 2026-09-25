package CalculadoraDesconto;

public class CalculadoraDesconto {

    public static void main(String[] args) {
        System.out.println("=== Calculadora de descontos ===");
        double precoProduto = 115;
        System.out.println("O preço do seu produto é de " +precoProduto+ " reais.");
        final double percentualDesconto = 10;
          // quero que o desconto seja uma constante, ele não muda 
        System.out.println("Parabéns!!!!"
            + "\nVocê acaba de ganhar um desconto de "+percentualDesconto+"% !!");
            double desconto = precoProduto * percentualDesconto / 100;
            System.out.println("Seu deconto final é de "+desconto+" reais");
            double precoFinal = precoProduto - desconto;
            System.out.println("Sendo assim, seu produto sai por apenas "+precoFinal+" reais!");
        
    }
}

