package Exemplos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class OuvinteMotion implements
        MouseMotionListener {

    public void mouseDragged(MouseEvent e) {
        System.out.println("Arrastando o mouse" + e.getPoint());
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Movimentando o mouse" + e.getPoint());
    }
}
