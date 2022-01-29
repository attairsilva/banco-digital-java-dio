package br.com.dio;

public abstract class Conta implements iConta {

    protected static int agenciaPadrao = 1123;
    protected static int numeroSequencial = 1;
    protected int  agencia;
    protected int numero;
    protected double saldo;
    private final ListaCliente cliente;

    public Conta(ListaCliente cliente) {
        this.agencia = agenciaPadrao;
        this.numero = numeroSequencial++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, iConta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void informacoesComuns() {
        System.out.println(String.format("Cliente: %s", this.cliente.getNomeCliente()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }



}
