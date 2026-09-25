import java.util.Scanner;

public class vogalConsoante {
    public static void main(String[] args) {
        // scanner 
        Scanner entrada = new Scanner(System.in);
        System.out.println("=== VOGAL OU CONSOANTE ===");
        // pergunta 
        System.out.println("Me informa uma letra minuscula, por favor.");
        String letra = entrada.nextLine();
        // se a resposta for diferente de letras minusculas, numeros ou mais de uma letra, o programa vai barrar. 
        if (!letra.matches("[a-z]")) {
            System.out.println("Inválido. Digite apenas uma letra minuscula, por favor!");
            return ;
        }
        // Switch case 
        switch (letra) {
            case "a":
                System.out.println("A = VOGAL");
                break;
            case "e":
                System.out.println("E = VOGAL");
                break;
            case "i":
                System.out.println("I = VOGAL");
                break;
            case "o":
                System.out.println("O = VOGAL");
                break;
            case "u":
                System.out.println("U = VOGAL");
                break;

            default:
                System.out.println(letra+ " = CONSOANTE");
                break;
        }
    }
}
