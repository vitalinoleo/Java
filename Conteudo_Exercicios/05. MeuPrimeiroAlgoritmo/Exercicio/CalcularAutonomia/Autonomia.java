package CalcularAutonomia;
import java.lang.classfile.constantpool.DoubleEntry;
import java.util.Scanner;
// Aqui preciso colocar o scanner porque eu quero  que o usuário me de o valor 
public class Autonomia {
    public static void main(String[] args) {
        System.out.println("=== Qual a autonomia do seu carro? ===");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = entrada.next();
        System.out.println("Seja bem vindo ao Autonomia Vitalino, "+nome);
        System.out.println("Qual o modelo do seu carro?");
        String modeloCarro = entrada.next();
        System.out.println("Que legal, eu acho o "+modeloCarro+" um belo carro!"
            + "\nNormalmente abastece com alcool ou gasolina ?"
        );
        String gasOrAl = entrada.next();
        System.out.println("Quanto está o litro de "+gasOrAl+" ?");
        double valor = entrada.nextDouble();
        System.out.println("Quanto colocou de "+gasOrAl+" ?");
        double dinheiroAbastecido = entrada.nextDouble();
        System.out.println("Aqui está quantos litros seu carro tem de "+gasOrAl);
        double litros = dinheiroAbastecido/valor;
        System.out.println(litros + " litros");
        System.out.println("=== Agora vamos descobrir a autonomia ===");
        System.out.println("Quantos km percorreu com "+litros+" litros?");
        double km = entrada.nextDouble();
        double autonomia = km/litros;
        System.out.println("A autonomia do " +modeloCarro+" é de "+autonomia+" litros por km!");
        




    }

    }