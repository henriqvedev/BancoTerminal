import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        float saldo = 237.48f;

        Scanner receptordosdados = new Scanner(System.in);

        System.out.println("Olá, bem vindo! Qual é o seu nome?");
        String nomeDoCliente = receptordosdados.nextLine();

        System.out.println("Por favor, digite o numero da Agência!");
        String agenciaDoUser = receptordosdados.nextLine();


        System.out.println("Por favor, digite o numero da sua conta!");
        int numeroConta = receptordosdados.nextInt();
        System.out.println("Olá, " + nomeDoCliente +" obrigado por criar uma conta em nosso banco, sua agência é: " + agenciaDoUser + " , conta:" + numeroConta +" e seu saldo: " + saldo +" já está disponivel para saque!");
    }
}
//Conhecer e importar a classe Scanner
//Obter pela scanner os valores digitados no terminal
//Exibir a mensagem conta criada