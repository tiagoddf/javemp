/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pedidos;

/**
 *
 * @author luiz
 */
public class beansPedido {
    private double valorAtual;
    private int desconto;
    private double saldo;
    private double saldoNovo;

    /**
     * @return the valorAtual
     */
    public double getValorAtual() {
        return valorAtual;
    }

    /**
     * @param valorAtual the valorAtual to set
     */
    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
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
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the saldoNovo
     */
    public double getSaldoNovo() {
        return saldoNovo;
    }

    /**
     * @param saldoNovo the saldoNovo to set
     */
    public void setSaldoNovo(double saldoNovo) {
        this.saldoNovo = saldoNovo;
    }
    
    
}
