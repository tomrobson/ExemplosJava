package Exemplos;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestaCampoTexto {

    public static void main(String[] args) {
        JLabel rotuloNome = new JLabel("Nome");
        JLabel rotuloDataNascimento = new JLabel("Data de Nascimento");
        
        JTextField campoNome = new JTextField(30);
        
        campoNome.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(campoNome.getText());
                if(campoNome.getText().length() > 30){
                    e.setKeyChar('\0');
                }
                System.out.println(campoNome.getText());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
        JTextField campoDataNascimento = new JTextField(10);
        //campoDataNascimento.setEditable(false);
        
        campoDataNascimento.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar() != KeyEvent.VK_SLASH 
                        && e.getKeyChar() < KeyEvent.VK_0 
                        || e.getKeyChar() > KeyEvent.VK_9){
                    e.setKeyChar('\0');
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout(FlowLayout.LEFT));
        painel.add(rotuloNome);
        painel.add(campoNome);
        painel.add(rotuloDataNascimento);
        painel.add(campoDataNascimento);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
