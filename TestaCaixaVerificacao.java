package ExemplosJava;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestaCaixaVerificacao {

    public static void main(String[] args) {
        JLabel rotulo = new JLabel("Escolha os assuntos:");
        
        JTextField text = new JTextField();
        text.setVisible(false);
        
        JCheckBox assuntoEconomia = new JCheckBox("Economia");
        JCheckBox assuntoEsporte = new JCheckBox("Esporte");
        JCheckBox assuntoLazer = new JCheckBox("Lazer");
        JCheckBox assuntoPolitica = new JCheckBox("Política");
        JCheckBox assuntoReligiao = new JCheckBox("Religião");
        JCheckBox assuntoTecnologia = new JCheckBox("Tecnologia");
        
        assuntoTecnologia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setVisible(assuntoTecnologia.isSelected());
                text.setText("");
            }
        });
        
        GridLayout leiaute = new GridLayout(10, 5);
        JPanel painel = new JPanel();
        
        painel.setLayout(leiaute);
        painel.add(assuntoEconomia);
        painel.add(assuntoEsporte);
        painel.add(assuntoLazer);
        painel.add(assuntoPolitica);
        painel.add(assuntoReligiao);
        painel.add(assuntoTecnologia);
        painel.add(text);
        
        JFrame janela = new JFrame();
        janela.add(rotulo, BorderLayout.NORTH);
        janela.add(painel, BorderLayout.CENTER);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
