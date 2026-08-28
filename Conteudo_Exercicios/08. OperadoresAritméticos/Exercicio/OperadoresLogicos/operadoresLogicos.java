package OperadoresLogicos;

public class operadoresLogicos {
    public static void main(String[] args) {
        System.out.println("=== Sistema Supermercado ===");

        // criando minhas tres variáveis 
        boolean usuarioVIP = true;
        boolean compraComValorAlto = false;
        boolean menorIdade = true;
        boolean temProdutoAlcoolicoNoCarrinho = true;
        
        // o que o sistema vai me retornar 
        System.out.println("o usuário é vip? " +usuarioVIP );
        System.out.println("A compra tem um valor alto? " +compraComValorAlto);
        System.out.println("Usuário é menor de idade? "+menorIdade);
        System.out.println("Tem produto alcoólico no carrinho? "+temProdutoAlcoolicoNoCarrinho);

        //colocando os operadores logicos

        boolean aplicarDesconto = usuarioVIP && compraComValorAlto;
        System.out.println("O desconto deve ser aplicado? "
            + "(usuarioVIP && compraComValorAlto) "
            +aplicarDesconto
        );
        // se a compra for feita por um usuario vip e for uma compra de alto valor pode aplicar o desconto. 

        aplicarDesconto = usuarioVIP || compraComValorAlto;
        System.out.println("o desconto deve ser aplicado?"
            + "(usuarioVIP || compraComValorAlto): "
            +aplicarDesconto
        );
        // se a compra for feita por um usuario vip OU compra com valor alto, pode aplicar o desconto 

        boolean permiteConcluirCompra = !menorIdade || !temProdutoAlcoolicoNoCarrinho;
        System.out.println("Pode concluir compra? "
            +"(!menorIdade || !compraComValorAlto) "
            +permiteConcluirCompra
        );

        // se o usuario não for menor de idade ou se não tiver bebida alcoolica no carrinho, pode concluir a compra 

    }
    
}
