package ExemplosJava;

import javax.swing.JFrame;

public class TestaMouseMotionListener {

    public static void main(String[] args) {
        OuvinteMotion ouvinte = new OuvinteMotion();
        JFrame janela = new JFrame();
        janela.addMouseMotionListener(ouvinte);
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );
        janela.setVisible(true);
    }
}
