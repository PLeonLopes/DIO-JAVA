import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o número da Conta: ");
        int numero = teclado.nextInt();

        teclado.nextLine();         // Limpa Buffer

        System.out.println("Digite a agência: ");
        String agencia = teclado.nextLine();

        System.out.println("Digite o nome do Cliente: ");
        String NomeCliente = teclado.nextLine();

        System.out.println("Digite o saldo do Cliente: ");
        double saldo = teclado.nextDouble();

        // Exibir a mensagem conta criada
        System.out.println("Conta criada com Sucesso!");
        System.out.println("Informações da conta:\nNumero: " + numero + " \nAgência " + agencia + " \nNome do Cliente: " + NomeCliente + "\nSaldo: " + saldo);

        teclado.close();
    }

}