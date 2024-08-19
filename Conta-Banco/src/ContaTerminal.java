import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Digite o Numero da conta: ");
        numero = scanner.nextInt();

        System.out.print("Informe seu Nome: ");
        nomeCliente = scanner.next();
        scanner.nextLine();

        System.out.print("Digite o Saldo do primeiro deposito: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em "
                + "nosso banco, sua agência é %s, "
                + "conta %d e seu saldo %.2f já está disponível"
                + " para saque.", nomeCliente, agencia, numero, saldo);
        scanner.close();
    }
}
