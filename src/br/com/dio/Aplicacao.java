package br.com.dio;

import java.util.Scanner;

public class Aplicacao {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ListaCliente oCliente = new ListaCliente();

        System.out.println("================================");
        System.out.println("=== Bem vindo ao Banco Teste ===");
        System.out.println("================================");
        System.out.println();

        System.out.print("Quantos clientes quer cadastrar? ");
        int quantidadeClientes = scan.nextInt();
        System.out.println();
        int count = 1;
        do {
            System.out.print("Cliente Numero "+count+": ");
            String nCliente = scan.next();
            oCliente.setNomeCliente(nCliente,count);
            count++;
        } while (count <= quantidadeClientes);


        oCliente.ListarClientes();

        System.out.println("==== Selecionar um Cliente para Abrir uma Conta Corrente e Poupança =====");
        System.out.print("Informe o Numero: ");
        int cCliente = scan.nextInt();
        oCliente.encontrarCliente(cCliente);
        System.out.println("================================");
        System.out.println();

        System.out.println("=========== Operações  =========");

        Conta cCorrente = new ContaCorrente(oCliente);
        cCorrente.depositar(100);

        cCorrente.imprimirExtrato();
        Conta cPoupanca = new ContaPoupanca(oCliente);
        cCorrente.transferir(50,cPoupanca);

        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();







    }
}
