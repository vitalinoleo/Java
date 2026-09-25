import java.util.Scanner;

public  class estruturaIf {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("Maior idade");
        }else{
            System.out.println("Menor idade");
        }
    }
}