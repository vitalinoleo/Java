import java.util.Scanner;

public class qualMes {
    public static void main(String[] args) {
        // scanner 
        Scanner entrada = new Scanner(System.in);
        // pergunta 
        System.out.println("Responda como o exemplo a baixo:"
                + "\nJaneiro"
                + "\nFevereiro"
                + "\nMarco"
                + "\nAbril"
                + "\nMaio"
                + "\nJunho"
                + "\nJulho"
                + "\nAgosto"
                + "\nSetembro"
                + "\nOutubro"
                + "\nNovembro"
                + "\nDezembro"
                + "\nQual é o mês do seu aniversário ?");
        String mesAniversario = entrada.nextLine();
        // Switch case 
        switch (mesAniversario) {
            case "Janeiro":
                System.out.println("Que legal, você faz aniversário em Janeiro.");
                break;

            case "Fevereiro":
                System.out.println("Que legal, você faz aniversário em fevereiro.");
                break;

            case "Marco":
                System.out.println("Que legal, você faz aniversário em Março.");
                break;

            case "Abril":
                System.out.println("Que legal, você faz aniversário em Abril.");
                break;

            case "Maio":
                System.out.println("Que legal, você faz aniversário em Maio.");
                break;

            case "Junho":
                System.out.println("Que legal, você faz aniversário em junho.");
                break;

            case "Julho":
                System.out.println("Que legal, você faz aniversário em Julho.");
                break;

            case "Agosto":
                System.out.println("Que legal, você faz aniversário em agosto.");
                break;

            case "Setembro":
                System.out.println("Que legal, você faz aniversário em setembro.");
                break;

            case "Outubro":
                System.out.println("Que legal, você faz aniversário em outubro.");
                break;

            case "Novembro":
                System.out.println("Que legal, você faz aniversário em novembro.");
                break;

            case "Dezembro":
                System.out.println("Que legal, você faz aniversário em dezembro.");
                break;

            default:
                System.out.println("Essa opção não está válida."
                        + "\nEscolha uma nova opção entre Janeiro a Dezembro.");
                break;
        }

    }

}
