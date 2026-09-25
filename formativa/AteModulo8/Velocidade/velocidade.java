package Velocidade;

public class velocidade {
    public static void main(String[] args) {
        System.out.println("=== VELOCIDADE PERMITIDA ===");
        int velocidade = 60;

        boolean velocidadeAtual = velocidade>60;
        System.out.println("Velocidade está a cima do permitido ?"
            + "(Velocidade a cima de 60): "+velocidadeAtual
        );
    }
}
