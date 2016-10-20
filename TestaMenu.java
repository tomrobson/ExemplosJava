package ExemplosJava;

import javax.swing.JMenuBar;
import javax.swing.JFrame;
import javax.swing.JMenu;

public class TestaMenu {

    public static void main(String[] args) {
        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic('A');
        
        JMenu menuEditar = new JMenu("Editar");
        menuEditar.setMnemonic('E');
        
        JMenu menuAjuda = new JMenu("Ajuda");
        menuAjuda.setMnemonic('j');
        
        JMenuBar barraMenu = new JMenuBar();
        
        barraMenu.add(menuArquivo);
        barraMenu.add(menuEditar);
        barraMenu.add(menuAjuda);
        
        JFrame janela = new JFrame();
        
        janela.setJMenuBar(barraMenu);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
