package br.com.dio;



public class Cliente {



    protected int nmrCliente;
    protected String nomeCliente;


    public Cliente() {
    }

    public Cliente(String nomeCliente, int nmrCliente ) {
        this.nmrCliente = nmrCliente;
        this.nomeCliente = nomeCliente;
    }

    public int getnmrCliente() {
        return nmrCliente;
    }

    public void setnmrCliente(int nmrCliente) {
        this.nmrCliente = nmrCliente;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

}
