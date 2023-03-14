import javax.swing.*;

public class InteraceGraficaComSelecao {
    public static void main(String[]args){
        String[]opcaoPessoas = {"Física", "Jurídica"};
        int tipoPessoa = JOptionPane.showOptionDialog(null, "Escolha uma opção: ",
        "Tipo de pessoa", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcaoPessoas, opcaoPessoas[0]);

        Object[] selectionValueSeguradora = {"Libert", "Sulamerica", "Itau"};

        String inicialSelectionSeguradora = (String) selectionValueSeguradora[0];
        Object selectionSeguradora = JOptionPane.showInputDialog(null, "Selecione a seguradora: ",
                "SeguradoraApp", JOptionPane.QUESTION_MESSAGE, null, selectionValueSeguradora, inicialSelectionSeguradora);
    }
}
