package CalcularCalorias;

public class CalcularCalorias {

    public static void main(String[] args) {
        System.out.println("=== CALCULO DE CALORIAS ===");
        double caloriasGastas = 450;
        System.out.println("Você perdeu o total de " + caloriasGastas + " calorias queimadas!!");
        double tempoExercicio = 1.5;
        System.out.println("O tempo do exercício foi de " + tempoExercicio + " horas");
        double caloriasPorHora = caloriasGastas / tempoExercicio;
        System.out.println("Por hora você gastou " + caloriasPorHora + " calorias");

    }
}