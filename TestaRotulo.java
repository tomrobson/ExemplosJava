package Exemplos;

import javax.swing.JLabel;
import javax.swing.JFrame;

public class TestaRotulo {

    public static void main(String[] args) {
        String texto = "Este texto foi adicionado na janela.";
        JLabel rotulo = new JLabel(texto);
        
        rotulo.setEnabled(false);
        rotulo.setToolTipText("Rotulo desativado");
        rotulo.setDisplayedMnemonic('E');
        
        //JLabel rotulo = new JLabel("Este texto foi "
        //        + "adicionado na janela.");
        JFrame janela = new JFrame();
        janela.add(rotulo);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
