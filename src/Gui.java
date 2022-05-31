//      Number 62   Jbutton

/*
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
*/

//      number 64   JCheckBox
//      65 - The Final Check Box Program
/*

import java.awt.*;
import java.awt.event.*;
import java.util.logging.Handler;
import javax.swing.*;

public class Gui extends JFrame{
    private JTextField tf;
    private JCheckBox boldBox;
    private JCheckBox italicBox;

    public Gui(){
        super("the title");
        setLayout(new FlowLayout());

        tf = new JTextField("This is a sentence", 20);
        tf.setFont(new Font("Serif", Font.PLAIN, 14));
        add(tf);

        boldBox = new JCheckBox("bold");
        italicBox = new JCheckBox("italic");
        add(boldBox);
        add(italicBox);

        HandlerClass handler = new HandlerClass();
        boldBox.addItemListener(handler);
        italicBox.addItemListener(handler);
    }

    private class HandlerClass implements ItemListener{
        public void itemStateChanged(ItemEvent event){
            Font font = null;

            if(boldBox.isSelected() && italicBox.isSelected()){
                font = new Font("Serif", Font.BOLD+Font.ITALIC, 14);
            }
            else if (boldBox.isSelected())
                font = new Font("Serif", Font.BOLD, 14);
            else if (italicBox.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            else
                font = new Font("Serif", Font.PLAIN, 14);

            tf.setFont(font);
        }
    }

}
*/

//      number 66       JRadioButton
//      number 67       JRadioButton Final Program
/*

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame{
    private JTextField tf;
    private Font pf;
    private Font bf;
    private Font itf;
    private Font bitf;
    private JRadioButton pb;
    private JRadioButton bb;
    private JRadioButton itb;
    private JRadioButton bitb;
    private ButtonGroup group;

    public Gui(){
        super("The title");
        setLayout(new FlowLayout());

        tf = new JTextField("Bucky is cool", 25);
        add(tf);

        pb = new JRadioButton("plain", true);
        bb = new JRadioButton("bold", false);
        itb = new JRadioButton("italic", false);
        bitb = new JRadioButton("bold italic", false);
        add(pb);
        add(bb);
        add(itb);
        add(bitb);

        group = new ButtonGroup();
        group.add(pb);
        group.add(bb);
        group.add(itb);
        group.add(bitb);

        pf = new Font("Serif", Font.PLAIN, 14);
        bf = new Font("Serif", Font.BOLD, 14);
        itf = new Font("Serif", Font.ITALIC, 14);
        bitf = new Font("Serif", Font.BOLD+Font.ITALIC, 14);
        tf.setFont(pf);
//      wait for event to happen, pass in font object to constructor
        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        itb.addItemListener(new HandlerClass(itf));
        bitb.addItemListener(new HandlerClass(bitf));

    }

    private class HandlerClass implements ItemListener{

        private Font font;

//        the font object gets variable font
        public HandlerClass(Font f){
            font = f;
        }

//        sets the font to the font object that was passed in
        public void itemStateChanged(ItemEvent event){
            tf.setFont(font);
        }

    }

}
*/

//      number 68       JComboBox
//      number 69       Drop Down List Program
/*


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {

    private JComboBox box;
    private JLabel picture;

    private static String[] filename = {"b.png", "x.png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};

    public Gui() {

        super("Title");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);

        box.addItemListener(
                new ItemListener() {
                    public void itemStateChanged(ItemEvent event){
                        if (event.getStateChange()==ItemEvent.SELECTED)
                            picture.setIcon(pics[box.getSelectedIndex()]);
                    }
                }
        );

        add(box);
        picture=new JLabel(pics[0]);
        add(picture);

    }
}
*/

//      number 70       JList
//      number 71       JList Program
/*

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Gui extends JFrame{

    private JList list;
    private static final String[] colornames = {"black", "blue", "red", "white"};
    private static final Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};

    public Gui(){

        super("Title");
        setLayout(new FlowLayout());

        list = new JList(colornames);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));

        list.addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent event){
                        getContentPane().setBackground(colors[list.getSelectedIndex()]);
                    }
                }
        );
    }
}*/

//      number 73       Moving List Items Program
/*

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Gui extends JFrame{

    private JList leftList;
    private JList rightList;
    private JButton moveButton;
    private static String[] foods = {"bacon", "wings", "ham", "beef", "morebacon"};

    public Gui(){
        super("title");
        setLayout(new FlowLayout());
        leftList = new JList(foods);
        leftList.setVisibleRowCount(4);
        leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftList));

        moveButton = new JButton("Move -->");
        moveButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event){
                       rightList.setListData(leftList.getSelectedValues());
                    }
                }
        );
        add(moveButton);

        rightList = new JList();
        rightList.setVisibleRowCount(5);
        rightList.setFixedCellHeight(20);
        rightList.setFixedCellWidth(100);
        rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(rightList));

    }


}
*/

//      number 74       Mouse Events
//      number 75       MouseListener interface

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Gui extends JFrame {

    private JPanel mousePanel;
    private JLabel statusBar;

    public Gui(){
        super("Title");
        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel,BorderLayout.CENTER);

        statusBar = new JLabel("default");
        add(statusBar, BorderLayout.SOUTH);

        HandlerClass handler = new HandlerClass();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);

    }

}