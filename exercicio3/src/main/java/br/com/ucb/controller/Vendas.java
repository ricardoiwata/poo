/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ucb.controller;

/**
 *
 * @author ricardo.iwata
 */
public class Vendas {
        private double valor;
    private int parcelas;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
    
    public double valorFinal(){
    
    double calculo = 0;
    
    if(parcelas == 1){
    calculo = (valor - (valor * 0.1));
    }
    else if(parcelas <= 3){
    calculo = (valor + (valor * 0.05));
    }
     else if(parcelas >= 4){
    calculo = (valor + (valor * 0.1));
    }
        
    
    return calculo;
    }
}

    

