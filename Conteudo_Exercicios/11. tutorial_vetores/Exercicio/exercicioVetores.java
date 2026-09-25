public class exercicioVetores {
    public static void main(String[] args) {
        // vetor com 5 unidades 
        int[] numeros = new int[]{18, 20, 25, 30, 22};

        // imprimir o que está no indice 0
        System.out.println("Esse é o valor que está no vetor índice 0: "+numeros[0]);

        // imprimir o numero que está no indice 3 
        System.out.println("Esse é o valor que está no vetor índice 3: "+numeros[3]);

        // alterar o numero do ídice 2 para 26 
        numeros[2] = 26;
        System.out.println("Agora índice 2 não vale mais 25. Agora vale: "+numeros[2]);

    }
}
