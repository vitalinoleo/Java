import java.util.Scanner;

public class vendaMaca {
    public static void main(String[] args) {
        // valor da massa sem o desconto 
        Double valorMacaSemDesconto = 0.30;
        // valor da maca com o desconto 
        Double valorMacaComDesconto = 0.25;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantas maçãs deseja comprar?");
        // recebendo a informação do usuario 
        int quantasMacas = entrada.nextInt();
        // operações metemáticas 
        Double valorComDesconto = quantasMacas * valorMacaComDesconto;
        Double valorSemDesconto = quantasMacas * valorMacaSemDesconto;
        Double diferencaValor = valorSemDesconto - valorComDesconto;

        if (quantasMacas >= 12) {
            // se o numero de maçãs for maior que 12 ele aplica o desconto e também informa quanto o cliente está economizando
            System.out.println("Parabéns, você teve um desconto de R$0.05 centavos na unidade da maçã!"
                    + "\nInvés de pagar R$" + valorSemDesconto + " reais"
                    + "\nO valor final fica de: R$" + valorComDesconto + " reais."
                    + "\nVocê economizou um total de: R$" + diferencaValor + " reais.");
        } else {
            // se caso a quantidade for menor que 12, ele aplica o valor normal da unidade das maçãs mesmo
            System.out.println("O valor final fica: R$" + valorSemDesconto + " reais.");

        }
    }

}
