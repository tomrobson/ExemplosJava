package ExemplosJava;

import javax.swing.JDialog;

public class JanelaDialogo {
    public JanelaDialogo() {
        JDialog jDialog = new JDialog();
        
        jDialog.setSize(480, 320);
        jDialog.setTitle("Janela de Dialogo");
        jDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jDialog.setVisible(true);
    }
}
