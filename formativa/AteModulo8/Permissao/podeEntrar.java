package Permissao;

public class podeEntrar {
    public static void main(String[] args) {
        System.out.println("=== PERMISSÃO === ");
        boolean temIngresso = true;
        boolean temDocumento = true;
        System.out.println("Tem ingresso ? : "+temIngresso);
        System.out.println("Está com documento ? : "+temDocumento);
        boolean podeEntrar = temDocumento && temIngresso;
        System.out.println("Pode entrar ? : "+podeEntrar);

    }
}
