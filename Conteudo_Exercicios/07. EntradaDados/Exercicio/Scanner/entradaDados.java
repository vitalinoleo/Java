package Scanner;

import java.util.Scanner;

public class entradaDados {

    public static void main(String[] args) {
        System.out.println("=======================");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual distância deseja percorrer?");
        double distanciaPercorrida = entrada.nextDouble();
        System.out.println("Sua distancia percorrida foi de "
                + distanciaPercorrida + " km");
        entrada.close();
        System.out.println("Fim!!");
        System.out.println("=======================");

    }
}