import java.util.Scanner;

public class guardaSenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // scanner 
        System.out.println("=== Vamos cadastrar a sua senha!! ===");
        int senhaCadastrada;
        // decalarando fora para eu poder usar dentro e fora do while 
        while (true) {
            // enquanto for verdade, vai executar esse codigo:
            System.out.println("Digite sua senha:");
            // pergunta 
            if (entrada.hasNextInt()) {
                // se a resposta for int:
                senhaCadastrada = entrada.nextInt();
                // guarda a senha 
                break;
                // e para de executar o while 
            }else{
                // caso a senha não seja uma String:
                System.out.println("Digite uma senha somente com numero inteiros!");
                // retornando um erro 
                entrada.next();
                // limpando o Scanner para receber uma nova resposta 
            }
        }
        // caso a senha seja escrita de forma correta podemos dar continuidade 

        int senha = senhaCadastrada;
        // informando que a minha senha sera a senha que o usuario deu 
        int tentativaConfirmacao = 0;
        // utilizando para fazer uma comparacao no while 
        while (tentativaConfirmacao != senha) {
            // Equanto o 0 for diferente da senha que o usuario cadastrou, executa esse código: 
            System.out.println("Digite novamente sua senha:");
            // pergunta 
            tentativaConfirmacao = entrada.nextInt();
            // guardando a informacao 
            if (tentativaConfirmacao != senha) {
                // Se a resposta nao for igual a senha: 
                System.out.println("A senha está diferente!"
                        + "\nTente novamente!");
                        // mensagem 
            }
        }
        // caso a senha seja a corrta, daremos continuidade 
        System.out.println("Senha cadastrada com sucesso!!");
        // mensagem 
        System.out.println("Vamos verificar se gravou a senha.");
        int tentativaVerificacao = 0;
        // utilizando para fazer comparacao de novo 

        while (tentativaVerificacao != senha) {
            // enquanto o 0 for diferente da senha cadastrada, executara :
            System.out.println("Digite sua senha:");
            // pergunta 
            tentativaVerificacao = entrada.nextInt();
            // guarda a resposta 
            // agora a tentativa nao vale mais 0, vale o que o usuario colocou
            if (tentativaVerificacao != senha) {
                // se a resposta do usuario não for igual a senha cadastrada:
                System.out.println("Senha incorreta!"
                        + "\nTente novamente!!");
            }
        }
        // caso seja a senha correta:
        System.out.println("Senha correta, parabéns!!");
    }

}
