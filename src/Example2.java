import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example2 implements ActionListener {

    //declare variables
    private JFrame mainFrame;
    private JPanel borderPanel;
    private JPanel gridPanel;
    private JButton button, button2, button3, button4, button5, button6, button7;
    private JLabel label1, label2;


    private int count = 0;


    public static void main(String[] args) {
        Example2 ex = new Example2();


    }

    public Example2() {
        mainFrame = new JFrame(" Example with grid inside border layout");
        borderPanel = new JPanel(new BorderLayout());
        gridPanel = new JPanel(new GridLayout(2, 3));


        //construct buttons and labels
        button = new JButton("Click here");
        button.addActionListener(this);// make button clickable and do the stuff in actionPerformed
        button2 = new JButton("This is another button");
        button2.addActionListener(this);// make button clickable and do the stuff in actionPerformed
        button3 = new JButton("yo");
        button3.addActionListener(this);// make button clickable and do the stuff in actionPerformed
        button4 = new JButton("yo1");
        button4.addActionListener(this);// make button clickable and do the stuff in actionPerformed
        button5 = new JButton("yo");
        button5.addActionListener(this);// make button clickable and do the stuff in actionPerformed
        button6 = new JButton("interesting");

        //add stuff to borderPanel

        //add stuff to gridPanel

        gridPanel.add(button2);
        borderPanel.add(button, BorderLayout.NORTH);
        gridPanel.add(button3);
        gridPanel.add(button4);
        borderPanel.add(button5, BorderLayout.SOUTH);

        borderPanel.add(gridPanel, BorderLayout.CENTER);
        mainFrame.add(borderPanel);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(700, 400);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();


    }



    }


