import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
