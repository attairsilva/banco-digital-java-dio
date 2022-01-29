package br.com.dio;

import java.util.List;

public class Banco {

   private String nomeBanco;
   private int numeroBanco;



    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    List<Cliente> listaClientes;

    public int getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }



}
