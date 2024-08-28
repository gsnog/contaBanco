import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    private Scanner sc = new Scanner(System.in);

    // Construtor
    public ContaTerminal() {
        System.out.println("Digite o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a agência da conta: ");
        agencia = sc.next();
        sc.nextLine();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = sc.nextLine();    // Use nextLine() para ler uma linha completa

        System.out.println("Digite o saldo da conta: ");
        saldo = sc.nextDouble();
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;

    }
}
