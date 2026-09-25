package Desconto;

public class desconto {
    public static void main(String[] args) {
        System.out.println("=== CACLCULAR DESCONTO ===");
        //valor do produto que está sendo comprado
        double valorCompra = 350.0;
        //retornando para o cliente o valor total do produto sem desconto
        System.out.println("O preço desse produto é "+valorCompra+ " R$.");
        //criando uma constante já que meu desconto vai ser fixo
        final double percentualDesconto = 10;
        //informando para o cliente o quanto de desconto ele ganhou
        System.out.println("Ganhou desconto de " +percentualDesconto+" %" );
        //indicando qual a conta que o sistema precisa fazer para saber o valor do desconto.
        double desconto = valorCompra * percentualDesconto / 100;
        //retornando para o cliente o quanto ele ganhou de desconto em R$
        System.out.println("Você acabou de economizar "+desconto+" R$");
        //mostrando a conta que o sistema precisa fazer para mostrar o valor final que precisa pagar 
        double valorFinal = valorCompra - desconto;
        //retornando para o cliente o valor 
        System.out.println("Sendo assim, o valor final fica "+valorFinal+" R$");
        


    }
}
