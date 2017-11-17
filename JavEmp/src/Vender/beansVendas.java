/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vender;

/**
 *
 * @author luiz
 */
public class beansVendas {
    private double valorVenda;
    private int desconto;
    private double valorDescontado;
    private String quemComprou;

    /**
     * @return the valorVenda
     */
    public double getValorVenda() {
        return valorVenda;
    }

    /**
     * @param valorVenda the valorVenda to set
     */
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    /**
     * @return the desconto
     */
    public int getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the valorDescontado
     */
    public double getValorDescontado() {
        return valorDescontado;
    }

    /**
     * @param valorDescontado the valorDescontado to set
     */
    public void setValorDescontado(double valorDescontado) {
        this.valorDescontado = valorDescontado;
    }

    /**
     * @return the quemComprou
     */
    public String getQuemComprou() {
        return quemComprou;
    }

    /**
     * @param quemComprou the quemComprou to set
     */
    public void setQuemComprou(String quemComprou) {
        this.quemComprou = quemComprou;
    }
}
