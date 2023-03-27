package MillenniumFalconSomativaPt1;

import java.util.Scanner;

public class MillenniumFalcon {

    Scanner sc = new Scanner(System.in);

    public void exemplo1() {

        System.out.println("Informe qual operação você deseja ( Adição=1 ; subtração=2 ; multiplicação =3 ; divisão =4 ;)");
        int operacoes = sc.nextInt();

        System.out.println(" informe o primeiro numero");
        double primeironumero = sc.nextDouble();

        System.out.println("informe o segundo numero");
        double segundonumero = sc.nextDouble();

        double total;

        if ( operacoes==1) {
        total = primeironumero+segundonumero;
        System.out.println(" o valor total da adição" + total);

        } else if ( operacoes==2) {
            total = primeironumero-segundonumero;
            System.out.println(" o valor total da subtração é" +total);

        } else if ( operacoes==3) {
            total = primeironumero*segundonumero;
            System.out.println(" o valor total da multiplicação é" +total);

        } else if ( operacoes==4) {
            total = primeironumero/segundonumero ;
            System.out.println(" o valor total da divisão é" +total);
        } else {
        System.out.println("!!!! OPERAÇÃO INVÁLIDA !!!!");

        }

       

    
}
 }
