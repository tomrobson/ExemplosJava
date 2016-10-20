package Exemplos;

import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.DefaultListModel;

public class TestaListaSelecao {

    public static void main(String[] args) {
        JLabel rotulo = new JLabel("Contatos");
        String[] itens = {"Ana", "Joao", "Bruna","Paulo", "Maria"};
        
        DefaultListModel modelo = new DefaultListModel();
        JList lista = new JList(itens);
        JList selecao = new JList();
        selecao.setModel(modelo);
        modelo.addElement("Jose");
        
        JPanel painel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painel.add(rotulo);
        painel.add(lista);
        painel.add(selecao);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
