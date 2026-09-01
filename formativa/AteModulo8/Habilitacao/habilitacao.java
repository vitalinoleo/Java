package Habilitacao;


public class habilitacao {

    public static void main(String[] args) {
        int idade = 20;
        boolean carteiraMotorista = true;
        //----------------------------------------------------------------------------- retorno
        System.out.println("O usuário tem carteira de motorista ? "+carteiraMotorista);
        //----------------------------------------------------------------------------- operadores lógicos
        boolean usuario = idade>=18 && carteiraMotorista; 
        System.out.println("Pode dirigir? "
            + "(idade maior ou igual a 18 anos e com carteira de motorista): "+usuario
        );
        usuario = idade>=18 && !carteiraMotorista;
        System.out.println("Pode dirigir?"
            + "(é maior de idade mas não tem habilitação): "+usuario
        );

        


    }
}