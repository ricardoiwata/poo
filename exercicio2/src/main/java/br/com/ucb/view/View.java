/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ucb.view;

import javax.swing.JOptionPane;
import br.com.ucb.controller.Notas;

/**
 *
 * @author ricardo.iwata
 */
public class View {
 public static void main(String[] args) {
        Notas n = new Notas();
        n.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1:")));
        n.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2:")));
       var media = n.CalcularMedia();
       
       if(media >= 6){
JOptionPane.showMessageDialog(null, "Aprovado nota: "+n.CalcularMedia());}
       else if(media >= 4){ JOptionPane.showMessageDialog(null, "Recuperação nota:"+n.CalcularMedia());
}
       else if(media < 4){
           JOptionPane.showMessageDialog(null, "Reprovado nota: "+n.CalcularMedia());
}
       else{
    throw new NumberFormatException("Erro");
        
    }}
    
}


