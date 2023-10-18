import java.util.Scanner;

public class ContaTerminal {

    
    
    public static void main(String[] args) {
        int conta;
        String agencia, nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor insira seu nome: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta: ");
        conta = scanner.nextInt();
        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
                            agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");
        
                            
    }
}