import java.util.Scanner;

public class Desafio {
  static void main(String[] args) {
    String nome = "Gabriel Bueno";
    String tipoDeConta = "Corrente";
    double saldo = 1599.99;
    int opcao = 0;

    Scanner leitura = new Scanner(System.in);

    System.out.println("**************************************");
    System.out.println("Dados iniciais do cliente:");
    System.out.println("\nNome do cliente: " + nome);
    System.out.println("Tipo conta: " + tipoDeConta);
    System.out.println("Saldo inicial: " + saldo);
    System.out.println("\n**************************************");

    String menu = """
      ** Digite sua opção **
      1- Consultar saldos
      2- Transferir valor
      3- Receber valor
      4- Sair
      """;
    System.out.println("Operações\n");

    while (opcao != 4) {
      System.out.println(menu);
      opcao = leitura.nextInt();

      if (opcao == 1) {
        System.out.println("O saldo atualizado é R$" + saldo);
      } else if (opcao == 2) {
        System.out.println("Qual o valor que deseja transferir");
        double valor = leitura.nextDouble();
        if (valor > saldo) {
          System.out.println("Não há saldo para realizar a transferência");
        } else {
          saldo -= valor;
          System.out.println("Novo saldo: R$" + saldo);
        }
        } else if (opcao == 3) {
          System.out.println("Valor recebido: ");
          double valor = leitura.nextDouble();
          saldo += valor;
          System.out.println("Novo saldo: R$" + saldo);
        } else if (opcao != 4) {
        System.out.println("Opção inválida");
      }
    }
  }
}
