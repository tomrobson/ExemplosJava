package ExemplosJava;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class OuvinteMouse implements MouseListener {

    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicando com o botão "
            + e.getButton());
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Pressionando o botão"
            + e.getButton());
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Liberando o botão "
            + e.getButton());
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Entrando...");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Saindo...");
    }
}
