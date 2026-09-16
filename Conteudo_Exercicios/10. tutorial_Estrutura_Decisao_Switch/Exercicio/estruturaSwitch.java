import java.util.Scanner;

/**
 * estruturaSwitch
 */
public class estruturaSwitch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // criando constantes para cada opção 
        final int domingo = 1;
        final int segunda = 2;
        final int terça = 3;
        final int quarta = 4;
        final int quinta = 5;
        final int sexta = 6;
        final int sabado = 7;
        // perguntas 
        System.out.println("OBS: Responda de acordo com o exemplo a baixo:"
                + "\nDomingo = 1"
                + "\nSegunda-Feira = 2"
                + "\nTerça-Feira = 3"
                + "\nQuarta-Feira = 4"
                + "\nQuinta-Feira = 5"
                + "\nSexta-Feira = 6"
                + "\nSabado = 7"
                + "\nQual é o dia da semana?");
                // criando uma variavel no main para eu poder usar dentro do if e também dentro do switch case 
                int diaSemana;
                // criando um if para que se o usuário dar uma String ou double de resposta 
        if (entrada.hasNextInt()) {
            diaSemana = entrada.nextInt();
            // caso a resposta seja int ele guarda a informação 
        } else {
            // caso ao contrário ele retorna essa mensagem 
            System.out.println("Essa opção não existe. "
                    + "\nDigite um numero, por favor!!");
                    return ;
        }

        // switch case 
        switch (diaSemana) {
            case 1:
                System.out.println("Estamos no domingo.");

                break;
            case 2:
                System.out.println("Estamos na segunda feira.");

                break;

            case 3:
                System.out.println("Estamos na terça feira.");

                break;

            case 4:
                System.out.println("Estamos na quarta feira.");

                break;

            case 5:
                System.out.println("Estamos na quinta-feira.");

                break;

            case 6:
                System.out.println("Estamos na sexta feira.");

                break;

            case 7:
                System.out.println("Estamos no sabado.");

                break;
            default:
                System.out.println("Essa opção não está válida."
                    + "\nEscolha uma opção de 1 ao 7."
                );
                break;
        }

    }
}