package br.edu.ifsp.arq.dw2s6.atividade2;

public class Compra {
    private long nroCompra;

    private String nomeCliente;
    private String nomeProduto;
    private double valorProduto;


    public long getNroCompra() {
        return nroCompra;
    }

    public void setNroCompra(long nroCompra) {
        this.nroCompra = nroCompra;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
}
