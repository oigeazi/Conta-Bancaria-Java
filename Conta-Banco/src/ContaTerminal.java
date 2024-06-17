import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome!");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta:");
        Integer conta = scanner.nextInt();

        System.out.println("Qual o seu saldo?");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
