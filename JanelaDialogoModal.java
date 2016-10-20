package ExemplosJava;

import javax.swing.JDialog;

public class JanelaDialogoModal {
    public JanelaDialogoModal(){
        JDialog jDialog = new JDialog();
        
        jDialog.setSize(480, 320);
        jDialog.setTitle("Janela de Dialogo Modal");
        jDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        jDialog.setModal(true);
        jDialog.setVisible(true);
    }
}
