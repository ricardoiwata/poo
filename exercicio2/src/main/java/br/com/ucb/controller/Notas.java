/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ucb.controller;

/**
 *
 * @author ricardo.iwata
 */
public class Notas {
    private double nota1;
    private double nota2; 


    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double CalcularMedia(){
        double media;
    media = (this.nota1+this.nota2)/2;
    
    return media;
    }


}
