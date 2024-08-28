
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Banco de Dados");
        System.out.println("Por favor, digite os dados solicitados: ");

        ContaTerminal conta = new ContaTerminal(); // Crie um objeto da classe ContaTerminal

        System.out.println("Olá, " + conta.getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco." +
                " Sua agência é " + conta.getAgencia() +
                ", conta " + conta.getNumero() +
                " e seu saldo de " + conta.getSaldo() +
                " já está disponível para saque.");

    }
}
