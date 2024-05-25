import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("---------------CONTA BANCÁRIA---------------\n");

        // Solicitação do Número da conta
        System.out.println("Por favor, digite o número da Conta: (1234)");
        numero = sc.nextInt();

        // Solicitação do Número da Agência
        System.out.println("Agora digite o número da Agência: (123-5)");
        agencia = sc.next();

        // Solicitação do Nome do Cliente
        System.out.println("Me informe seu nome: ");
        nomeCliente = sc.next();
        sc.nextLine();

        // Solicitação do saldo atual
        System.out.println("Agora me informa seu saldo atual: ");
        saldo = sc.nextDouble();

        // Exibição das informações do cliente
        System.out.printf("Olá %s, obrigado por criar uma conta em "
                + "nosso banco, sua agência é %s, "
                + "conta %d e seu saldo %.2f já está disponível"
                + " para saque.", nomeCliente, agencia, numero, saldo);

        // Fechamento do scanner
        sc.close();
    }
}
