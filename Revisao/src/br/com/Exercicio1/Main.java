package br.com.Exercicio1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        String jogador;
        String selecao;
        jogador = JOptionPane.showInputDialog(null,"Nome de seu jogador de futebol preferido");
        selecao = JOptionPane.showInputDialog(null,"A seleção deste jogador");
        JOptionPane.showMessageDialog(null,"Jogador " + jogador + " Seleção " + selecao);
    }
}
