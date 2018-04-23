package programaframe1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BottonClicked extends JFrame {

    public BottonClicked() {
        JButton b = new JButton("Haceme click");
        b.setBounds(130, 100, 100, 40);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                b.setText("Se hizo click!");
                
            }
        });

        this.setTitle("Botton Cliked");
        this.add(b);
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
