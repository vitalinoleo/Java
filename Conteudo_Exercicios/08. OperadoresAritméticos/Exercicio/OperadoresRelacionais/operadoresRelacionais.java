package OperadoresRelacionais;

public class operadoresRelacionais {
    public static void main(String[] args) {
        System.out.println("=== OPERADORES RELACIONAIS ===");
        int primeiraVariavel = 1;
        int segundaVariavel = 1;
        System.out.println("A primeira varíavel é = " +primeiraVariavel);
        System.out.println("A segunda variavel é = "+segundaVariavel);
        boolean primeiraVariavelMaiorQueSegundaVariavel = primeiraVariavel > segundaVariavel;
        System.out.println("Primeira variavel é maior que a segunda ? " +primeiraVariavelMaiorQueSegundaVariavel);
        boolean primeiraVariavelMenorQueSegunda = primeiraVariavel < segundaVariavel;
        System.out.println("Primeira variavel é menor que a segunda? "+primeiraVariavelMenorQueSegunda);
        boolean prmeiraVariavelMaiorIgualSegundaVariavel = primeiraVariavel >= segundaVariavel;
        System.out.println("Primeira variável é maior ou igual a segunda? "+prmeiraVariavelMaiorIgualSegundaVariavel);
        boolean primeiraVariavelMenorIgualSegundaVariavel = primeiraVariavel <= segundaVariavel;
        System.out.println("Primeira variavel é menor ou igual a segunda? "+primeiraVariavelMenorIgualSegundaVariavel);
        boolean primeiraVariavelIgualSegundaVariavel = primeiraVariavel == segundaVariavel;
        System.out.println("Primeira variavel é igual a segunda? "+primeiraVariavelIgualSegundaVariavel);
        boolean primeiraVariavelDiferenteSegundaVariavel = primeiraVariavel != segundaVariavel;
        System.out.println("Primeira variavel é diferente da segunda? "+primeiraVariavelDiferenteSegundaVariavel);
        System.out.println("Fim!!");
        System.out.println("===========================");
    }
}
