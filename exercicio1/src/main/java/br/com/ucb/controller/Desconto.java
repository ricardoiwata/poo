/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ucb.controller;

/**
 *
 * @author ricardo.iwata
 */
public class Desconto {
        private double Valor;
        double res;
    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }
         
        public double calcularDesconto(){
            if(Valor <= 500){
                res=(double)(this.Valor - Valor * 0.05);
            }
            else{
                res=(double)(this.Valor - Valor * 0.10);
            }
            return res;
        }
}
