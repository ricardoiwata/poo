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
        private int Valor;

    public double getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
         
        public int calcularDesconto(){
            if(Valor <= 500){
                return (int) (this.Valor - Valor * 0.05);
            }
            else{
                return (int) (this.Valor - Valor * 0.10);
            }
        }
}
