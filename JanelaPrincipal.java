package ExemplosJava;

import javax.swing.JFrame;

public class JanelaPrincipal {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        
        janela.setSize(640, 480);
        janela.setTitle("Janela Principal");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        JanelaDialogo janelaDialg = new JanelaDialogo();
        JanelaDialogoModal janelaDialgModal = new JanelaDialogoModal();
    }
}
