/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ucb.view;

import br.com.ucb.controller.Vendas;
import javax.swing.JOptionPane;

/**
 *
 * @author ricardo.iwata
 */
public class View {
    public static void main(String[] args) {
        Vendas v = new Vendas();
        v.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor")));
        v.setParcelas(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas")));
        
         JOptionPane.showMessageDialog(null, v.valorFinal());
        
    }
}
