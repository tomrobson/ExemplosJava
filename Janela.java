package ExemplosJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Janela extends JFrame{
    private JMenuBar menuBarra = new JMenuBar();
    
    Janela(){
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenu menuAjuda = new JMenu("Ajuda");
        JMenuItem menuAjudaSobre = new JMenuItem("Sobre");
        
        menuAjudaSobre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Versão 1.0");
            }
        });
        
        JMenuItem menuNovo = new JMenuItem("Novo");
        
        menuNovo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Novo, aberto com sucesso!");
            }
        });
        
        JMenuItem menuSalvar = new JMenuItem("Salvar");
        
        menuSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Salvar, aberto com sucesso!");
            }
        });
        
        JMenuItem menuSalvarComo = new JMenuItem("Salvar como");
        
        menuSalvarComo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Salvar como, aberto com sucesso!");
            }
        });
        
        JMenuItem menuSair = new JMenuItem("Sair");
        
        menuSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        menuArquivo.setMnemonic('A');
        menuAjuda.setMnemonic('j');
        menuNovo.setMnemonic('N');
        menuSalvar.setMnemonic('S');
        menuSalvarComo.setMnemonic('c');
        menuSair.setMnemonic('r');
        
        menuArquivo.add(menuNovo);
        menuArquivo.add(menuSalvar);
        menuArquivo.add(menuSalvarComo);
        menuArquivo.addSeparator();
        menuArquivo.add(menuSair);
        menuAjuda.add(menuAjudaSobre);
        menuBarra.add(menuArquivo);
        menuBarra.add(menuAjuda);
        
        this.setJMenuBar(menuBarra);
        this.setSize(480, 320);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
