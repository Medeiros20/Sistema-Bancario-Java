import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        String nome = "João";
        String tipoConta = "Corrente";
        double saldo = 3000.00;
        int operacao = 0;
        double valorRecebido = 0;
        double valorTranferido = 0;

        System.out.println("___________________________");
        System.out.println("Dados do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: "+ tipoConta);
        System.out.println("Saldo inicial: "+ saldo);
        System.out.println("__________________________");


        while (true) {
            System.out.println("MENU DO BANCO");

            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Tranferir valor");
            System.out.println("4 - Sair");

            System.out.println("Qual operação deseja realizar: ");
            operacao = reading.nextInt();

            if (operacao == 1){
                System.out.println("Seu saldo é: " + saldo);
            } else if (operacao == 2) {
                System.out.println("Qual o valor que será recebido");
                valorRecebido = reading.nextDouble();
                if(valorRecebido < 0){
                    System.out.println("Transação invalida, digite um valor positivo");
                }else{
                    saldo = valorRecebido + saldo;
                    System.out.println("Valor recebido com sucesso");
                }
            } else if (operacao == 3) {
                System.out.println("Qual valor será tranferido: ");
                valorTranferido = reading.nextDouble();
                if (valorTranferido > saldo){
                    System.out.println("Transação invalida, Saldo insuficiente");
                }else{
                    saldo = saldo - valorTranferido;
                    System.out.println("Valor tranferido com sucesso");
                }
            } else if (operacao == 4) {
                System.out.println("Saindo do sistema... Obrigado por usar nosso banco!");
                break;
            }else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

    }
}