package ExemplosJava;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class OuvinteWheel implements
        MouseWheelListener {

    public void mouseWheelMoved(MouseWheelEvent e) {
        System.out.println("Você girou o wheel "
                + e.getWheelRotation() + " vez(es)");
    }
}
