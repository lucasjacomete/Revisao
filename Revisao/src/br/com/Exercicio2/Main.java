package br.com.Exercicio2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        double publico;
        double valor;
        publico = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade de público do primeiro jogo de abertura da copa do mundo"));
        valor = Integer.parseInt (JOptionPane.showInputDialog(null,"Valor do ingresso"));
        JOptionPane.showMessageDialog(null,"O valor de arrecadação do primeiro jogo de abertura da copa do mundo foi: " + publico*valor );
    }
}
