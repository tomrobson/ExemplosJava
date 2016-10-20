package Exemplos;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestaAreaTexto {

    public static void main(String[] args) {
        JLabel rotuloObs = new JLabel("Observação:");
        JTextArea campoObs = new JTextArea(5, 30);
        campoObs.setLineWrap(true);
        campoObs.setWrapStyleWord(true);
        JPanel painel = new JPanel();
        
        campoObs.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(campoObs.getText().length() >= 1999){
                    
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
        JScrollPane rolagem = new JScrollPane();
        rolagem.setViewportView(campoObs);
        
        painel.setLayout(new FlowLayout(FlowLayout.LEFT));
        painel.add(rotuloObs);
        //painel.add(campoObs);
        painel.add(rolagem);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
