import java.util.Scanner;

public class pesoIdeal {
    public static void main(String[] args) {
        // ---------------------------------------------- scanner 
        Scanner entrada = new Scanner(System.in);
        // ---------------------------------------------- gêneros 
        final int masculino = 2;
        final int feminino = 1;
        final Double contaHomem = 72.7;
        final Double contaMulher = 62.1;
        // ---------------------------------------------- perguntas 
        System.out.println("Qual o seu gênero?");   
        int genero = entrada.nextInt();
        if (genero != masculino && genero != feminino) {
            System.out.println("Essa opção não está válida."
                + "\nEscolha uma opção entre 1 e 2!"
            );
            return;
        }
        System.out.println("Qual a sua altura ?");
        Double altura = entrada.nextDouble();
        // ---------------------------------------------- operações matemáticas 
        Double pesoIdealHomem = (contaHomem * altura) - 58;
        Double pesoIdealMulher = (contaMulher * altura) - 44.7;
        //  --------------------------------------------- if else 
        if (genero == masculino) {
            System.out.println("Moço, seu peso ideal é: "+pesoIdealHomem+" Kilos.");
        }else if (genero == feminino) {
            System.out.println("Moça, seu peso ideal é: "+pesoIdealMulher+" kilos.");
        }
    }
    
}
