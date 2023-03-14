import javax.swing.*;

public class ExInterfaceGrafica {
    public static void main(String []args ){
        Double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a"));
        Double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b"));
        Double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c"));

        Double baskara = Math.pow(b,2)-4*a*c;

        if ((a==0) || baskara<0){
            JOptionPane.showInputDialog("Essa raiz não existe! ");
        }

        else{
        double x1 = (-b + Math.sqrt(baskara))/(2*a);
        double x2 = (-b - Math.sqrt(baskara))/(2*a);

      JOptionPane.showInputDialog("X' : "+ x1 + "\n\nX'' : " + x2);
    }
}}
