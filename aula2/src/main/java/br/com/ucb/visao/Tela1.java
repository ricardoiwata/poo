/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ucb.visao;

import br.com.ucb.controle.Calculos;
import javax.swing.JOptionPane;

public class Tela1 {
    public static void main(String[] args) {
        Calculos c = new Calculos();
        c.setNumero1(Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:")));
        c.setNumero2(Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor:")));
JOptionPane.showMessageDialog(null, "Soma: "+c.somar()); // + = concatenar em java
        
    }
    
}
