/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ucb.view;

import br.com.ucb.controller.Posto;
import javax.swing.JOptionPane;

/**
 *
 * @author ricardo.iwata
 */
public class View {
    public static void main(String[] args) {
        Posto p = new Posto();
        p.setKmI(Integer.parseInt(JOptionPane.showInputDialog("Km Inicial")));
        p.setKmF(Integer.parseInt(JOptionPane.showInputDialog("Km Final")));
        p.setLitrosAbastecidos(Double.parseDouble(JOptionPane.showInputDialog("Litros Abastecidos:")));
        
         JOptionPane.showMessageDialog(null, p.CalcularConsumo());
        
    }
}

    
