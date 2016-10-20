package Exemplos;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TestaItemMenu {

    public static void main(String[] args) {
        JMenuItem menuArquivoNovo = new JMenuItem("Novo");
        
        menuArquivoNovo.setMnemonic('N');
        menuArquivoNovo.setActionCommand("Criar arquivo");
        
        JMenuItem menuArquivoSalvar = new JMenuItem("Salvar");
        
        menuArquivoSalvar.setMnemonic('S');
        menuArquivoSalvar.setActionCommand("Salvar arquivo");
        
        JMenuItem menuArquivoSair = new JMenuItem("Sair");
        
        menuArquivoSair.setMnemonic('r');
        menuArquivoSair.setActionCommand("Fechar aplicação");
        
        JMenu menuArquivo = new JMenu("Arquivo");
        
        menuArquivo.setMnemonic('A');
        menuArquivo.add(menuArquivoNovo);
        menuArquivo.add(menuArquivoSalvar);
        menuArquivo.addSeparator();
        menuArquivo.add(menuArquivoSair);
        
        JMenuBar barraMenu = new JMenuBar();
        
        barraMenu.add(menuArquivo);

        JFrame janela = new JFrame();
        
        janela.setJMenuBar(barraMenu);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
