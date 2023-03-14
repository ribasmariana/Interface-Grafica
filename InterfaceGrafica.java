import javax.swing.*;

public class InterfaceGrafica {
    public static void main(String []args ){
    String nome = JOptionPane.showInputDialog("Digite seu nome: ");

    Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));

    String mensagem = nome + ", de " + altura+ " de altura está estudando POO em ADS";

    JOptionPane.showMessageDialog(null, mensagem, "Teste", JOptionPane.INFORMATION_MESSAGE);
}}
