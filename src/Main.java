import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double saldo = 5000;
        String dadosCliente = """
                ***********************
                Dados iniciais do cliente:

                Nome: Deborah Ferreira
                Tipo conta: Corrente
                Saldo inicial: R$%.2f
                ***********************
                """.formatted(saldo);
        String operacoes = """
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """;
        System.out.println(dadosCliente);
        System.out.println(operacoes);
        int opcao = leitura.nextInt();

        while (opcao < 4) {

            if (opcao == 1) {
                System.out.println("Seu saldo é de R$" + saldo);
                System.out.println(operacoes);
                opcao = leitura.nextInt();
            } else if (opcao == 2) {
                System.out.println("Insira o valor que vai receber:");
                double valorAReceber = leitura.nextDouble();
                saldo = saldo + valorAReceber;
                System.out.println("Seu novo saldo é de R$" + saldo);
                System.out.println(operacoes);
                opcao = leitura.nextInt();
            } else if (opcao == 3) {
                System.out.println("Insira o valor que vai transferir:");
                double valorATransferir = leitura.nextDouble();
                if (valorATransferir <= saldo) {
                    saldo = saldo - valorATransferir;
                    System.out.println("Seu novo saldo é de R$" + saldo);
                    System.out.println(operacoes);
                    opcao = leitura.nextInt();
                } else {
                    System.out.println("O valor a transferir deve ser menor ou igual ao seu saldo");
                    System.out.println(operacoes);
                    opcao = leitura.nextInt();
                }
            } else {
                System.out.println("Digite uma opção válida");
                System.out.println(operacoes);
                opcao = leitura.nextInt();
            }
        }
    }
}
