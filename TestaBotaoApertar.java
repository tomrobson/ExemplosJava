package ExemplosJava;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class TestaBotaoApertar {

    public static void main(String[] args) {
        JButton botaoOk = new JButton("Ok");
        JButton botaoCancelar = new JButton("Cancelar");
        
        botaoCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        JPanel painel = new JPanel();
        
        painel.add(botaoOk);
        painel.add(botaoCancelar);
        
        JFrame janela = new JFrame();
        janela.add(painel, BorderLayout.SOUTH);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
