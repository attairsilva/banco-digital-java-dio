package br.com.dio;


import java.util.ArrayList;
import java.util.List;

public class ListaCliente {

    protected String nomeCliente;
    protected int nmrCliente;



    List <Cliente> listaClientes = new ArrayList<>();


    public ListaCliente() {
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

    public void setNomeCliente(String nomeCliente, int nmrCliente) {
        this.nomeCliente = nomeCliente;
        this.nmrCliente =nmrCliente;
        Cliente objCliente = new Cliente(nomeCliente,nmrCliente);
        listaClientes.add(objCliente);
    }

    public void ListarClientes(){

        System.out.println();
        System.out.println("================================");
        System.out.println("===== Relação de Clientes ======");
        System.out.println("================================");

        for (Cliente listaCliente : listaClientes) {
            System.out.println("Nome: " + listaCliente.getNomeCliente() +
                    " - Numero " + listaCliente.getnmrCliente());
        }

        System.out.println("================================");
        System.out.println();
    }


    public void encontrarCliente(int valorCPF){
        Cliente pCliente = new Cliente();
        pCliente.setnmrCliente(valorCPF);

        if(listaClientes.contains(pCliente)) {
            Cliente objCliente =  listaClientes.get(listaClientes.indexOf(pCliente));
        }

    }

}
