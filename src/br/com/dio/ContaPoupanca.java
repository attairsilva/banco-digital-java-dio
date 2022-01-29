package br.com.dio;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(ListaCliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("== Extrato Conta Poupança");
        super.informacoesComuns();
    }
}
