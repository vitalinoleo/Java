public class vetores {
    public static void main(String[] args) {
        // se a loja tiver vário produtos eu posso fazer da seguinte forma 
        double precoProduto1 = 150.0;
        double precoProduto2 = 20.0;
        double precoProduto3 = 10.0;
        double precoProduto4 = 100.0;

        System.out.println(precoProduto1);
        System.out.println(precoProduto2);
        System.out.println(precoProduto3);
        System.out.println(precoProduto4);

        // ou eu posso criar um vetor, assim eu simplifico o código 

        double[] precoProdutos = new double[]{150.0, 20.0, 10.0, 100.0};
        // Aqui eu criei um unico vetor que tem cada 4 valores
        // indices: (150.0 = 0)(20.0 = 1)(10.0 = 2)(100.0 = 3)

        //Eu sei que ese vetor tem 4 posições, mas se não desse para eu posso pedir para o proprio sistema me retonar quantas posições o vetor possui.
        System.out.println("Esse vetor possui: "+precoProdutos.length+" posições.");

        // para printar o resultado eu posso fazer de duas formas 
        double precoProduto0 = precoProdutos[0];
        System.out.println("O valor do vetor 0 é: "+precoProduto0);
        // Aqui eu estou printando o valor de 150.0 4

        // ou eu também posso simplificar mais ainda, dessa seguinte forma:
        System.out.println("O valor do vetor 1 é: "+precoProdutos[1]);

        //também posso alterar o valor sem mexer no vetor lá em cima, da seguinte forma

        precoProdutos[1] = 21.0;
        System.out.println("Mudei o valor do vetor 1. Não é mais 20, agora é: "+precoProdutos[1]);

    }
}
