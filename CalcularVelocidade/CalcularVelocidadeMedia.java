package CalcularVelocidade;

public class CalcularVelocidadeMedia {
    public static void main(String[] args) {
        System.out.println("====CALCULO DA VELOCIDADE MÉDIA====");
        double distanciaPercorrida = 133;
        System.out.println("A distancia percorrida foi de " + distanciaPercorrida + " km");
        double tempoGasto = 1.4;
        System.out.println("O tempo gasto foi de " + tempoGasto + " Horas");
        double velocidadeMedia = distanciaPercorrida / tempoGasto;
        System.out.println("Para encontrarmos a velocidade média dividmos a distância (" + distanciaPercorrida + ") pelo tempo gasto no percurso (" + tempoGasto + ").");
        System.out.println("A velocidade média é de " + velocidadeMedia + " km/h");
    }
}
