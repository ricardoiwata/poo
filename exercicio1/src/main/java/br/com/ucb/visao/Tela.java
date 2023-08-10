/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ucb.visao;

import br.com.ucb.controller.Desconto;
import javax.swing.JOptionPane;

/**
 *
 * @author ricardo.iwata
 */
public class Tela {
    public static void main(String[] args){
        Desconto d = new Desconto();
        d.setValor(Integer.parseInt(JOptionPane.showInputDialog( "Digite o valor para ser calculado o desconto:")));
       
        JOptionPane.showMessageDialog(null, d.calcularDesconto());
    }
}
