package ExemplosJava;

import javax.swing.JMenuBar;
import javax.swing.JFrame;

public class TestaBarraMenu {

    public static void main(String[] args) {
        JMenuBar barraMenu = new JMenuBar();
        JFrame janela = new JFrame();
        
        janela.setJMenuBar(barraMenu);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
