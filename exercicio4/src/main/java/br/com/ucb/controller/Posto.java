/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ucb.controller;

/**
 *
 * @author ricardo.iwata
 */
public class Posto {
    private int kmI;
    private int kmF;
    private double litrosAbastecidos;

    public int getKmI() {
        return kmI;
    }

    public void setKmI(int kmI) {
        this.kmI = kmI;
    }

    public int getKmF() {
        return kmF;
    }

    public void setKmF(int kmF) {
        this.kmF = kmF;
    }

    public double getLitrosAbastecidos() {
        return litrosAbastecidos;
    }

    public void setLitrosAbastecidos(double litrosAbastecidos) {
        this.litrosAbastecidos = litrosAbastecidos;
    }
    
    public double CalcularConsumo(){
    double consumoFinal;
    
    consumoFinal=((kmF - kmI)/litrosAbastecidos);
    
    return consumoFinal;
    
    }
}
