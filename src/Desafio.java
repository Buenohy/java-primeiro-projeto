import java.util.Scanner;

public class Desafio {
  static void main(String[] args) {
    String nome = "Gabriel Bueno";
    String tipoDeConta = "Corrente";
    double saldo = 1599.99;
    int escolha = 0;
    Scanner leitura = new Scanner(System.in);

    System.out.println("**************************************");
    System.out.println("Dados iniciais do cliente:");
    System.out.println("\nNome do cliente: " + nome);
    System.out.println("Tipo conta: " + tipoDeConta);
    System.out.println("Saldo inicial: " + saldo);
    System.out.println("\n**************************************");

    System.out.println("""
      
      """);
    System.out.println("Operações");
    System.out.println("");

    System.out.println("1- Consultar saldos");
    System.out.println("2- Receber valor");
    System.out.println("3- Transferir valor");
    System.out.println("4- Sair");

    System.out.println("");

    System.out.println("Digite a opção desejada:");
    escolha = leitura.nextInt();

  }
}
