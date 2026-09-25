import java.util.Scanner;

public class repeticao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int senha = 150306;
        // informando qual é a senha 
        int tentativa = 0;
        // isso vai me ajudar porque eu vou guardar dentro desse tentiva todas as tentativas dos usuários e fazer uma comparacao no while 

        while (tentativa != senha) {
            // enquanto o 0 for diferente de 150306 ele vai executar o seguinte: 
            System.out.println("Qual a senha?");
            // pergunta 
            tentativa = entrada.nextInt();
            // guardando a resposta dentro da varíavel tentativa 
            // obs: agora o tentiva nao vale mais 0, agora vale o valor que o usuario colocou 
             if (tentativa != senha) {
                // se a resposta for diferente de 150306, ele vai executar o seguinte: 
                System.out.println("Senha incorreta!"
                    + "\nTente novamente!"
                );
                // mensagem 
             }
        }
        System.out.println("Acesso liberado com sucesso!");
        // caso a senhora seja a correta, ele vai me informar essa mensagem 
    }
}
