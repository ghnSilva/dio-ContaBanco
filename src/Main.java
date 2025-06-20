import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Entrada de informaçoes
        Scanner scanner = new Scanner (System.in);

        // Digite a agência
        System.out.println(" Por favor insira a sua agência :" );

        String agencia = scanner.next();

        // Numero da conta
        System.out.println (" Insira a conta :");

        int numero = scanner.nextInt();

        // Nome do cliente
        System.out.println (" Digite seu nome ");
        String nomeClient = scanner.next();

        // Saldo em conta
        System.out.println(" Digite seu saldo : ");

        double saldo = scanner.nextDouble();

       // Conta criada e informções
        System.out.println("Olá " +nomeClient+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +numero + "e seu saldo " + saldo+ " já está disponivel para saque" );

    }
}