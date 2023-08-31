/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ucb.controller;

/**
 *
 * @author ricardo.iwata
 */
public class Numeros {
    private double numero;
    private int contador;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
        this.contador++;
    }
    
    
    public int adicionar(){
       return this.contador;
          
    }
    
 
    
}
