import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        String nomeCliente = "Gabriel Faustino";
        String tipoConta = "Corrente";
        double saldoInicial = 1400.00;
        String mensagemInicial = """
                *******************************************
                    Dados iniciais do cliente:
                    
                    Nome:            %s
                    Tipo de conta:   %s
                    Saldo inicial:   %.2f
                *******************************************
                """.formatted(nomeCliente, tipoConta, saldoInicial);
        System.out.println(mensagemInicial);



        Scanner entrada = new Scanner(System.in);
        int operacao = 0;

        String mensagemOperacao = """
                Operações
                
                1- Consultar dados
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a operação desejada:
                """;

        while (operacao != 4) {
            System.out.println(mensagemOperacao);
            operacao = entrada.nextInt();

            if (operacao == 1) {
                String saldo = String.format("O saldo atual é: R$ %.2f", saldoInicial);
                System.out.println(saldo);
            } else if (operacao == 2) {
                System.out.println("Digite o valor a ser recebido: ");
                double receberSaldo = entrada.nextDouble();
                saldoInicial += receberSaldo;
                String novoSaldoR = String.format("Agora, o novo saldo é de: R$ %.2f", saldoInicial);
                System.out.println(novoSaldoR);
            } else if (operacao == 3) {
                System.out.println("Digite o valor a ser transferido: ");
                double transferirSaldo = entrada.nextDouble();
                saldoInicial -= transferirSaldo;
                String novoSaldoT = String.format("Agora, o novo saldo é de: R$ %.2f", saldoInicial);
                System.out.println(novoSaldoT);
            } else if (operacao != 4) {
                System.out.println("Opção inválida!");
            }
        }







    }
}
