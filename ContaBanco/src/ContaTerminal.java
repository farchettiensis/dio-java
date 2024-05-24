import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"));
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        try {
            System.out.println("Por favor, digite o número da Conta: ");
            numeroConta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Por favor, digite o número da Agência: ");
            agencia = scanner.nextLine();

            System.out.println("Por favor, digite o nome do Cliente: ");
            nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo: ");
            saldo = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
