package programaframe1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ProgramaFrame1 {

    public static void main(String[] args) {
       
JFrame f = new JFrame("Hacer click!");

        JTextArea t1 = new JTextArea("Clickear el boton");
        t1.setBounds(50, 100, 200, 200);
        f.add(t1);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
     final JTextArea textarea = new JTextArea(); final JButton button = new JButton("A Button"); button.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent e) { textarea.setText("123"); } });
   
        new BottonClicked().setVisible(true);
    }

}
