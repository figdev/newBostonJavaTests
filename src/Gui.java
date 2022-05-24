//      Number 62   Jbutton

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Objects;

public class Gui extends JFrame {

    private JButton reg;
    private JButton custom;

    public Gui(){
        super("The title");
        setLayout(new FlowLayout());

        reg = new JButton("reg Button");
        add(reg);

        Icon b = new ImageIcon(Objects.requireNonNull(getClass().getResource("b.png")));
        Icon x = new ImageIcon(Objects.requireNonNull(getClass().getResource("x.png")));
        custom = new JButton("Custom", b);
        custom.setRolloverIcon(x);
        add(custom);

        HandlerClass handler = new HandlerClass();
        reg.addActionListener(handler);
        custom.addActionListener(handler);

    }

    private static class HandlerClass implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }
    }
}
