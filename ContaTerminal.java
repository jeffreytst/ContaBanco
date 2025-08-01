package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número da conta");
        int numero = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite a agência da conta");
        String agencia = entrada.nextLine();

        System.out.println("Digite o nome do cliente");
        String cliente = entrada.nextLine();

        System.out.println("Digite o saldo da conta");
        double saldo = entrada.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco,sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque "
        ,cliente, agencia, numero, saldo);

        entrada.close();
    }
}
