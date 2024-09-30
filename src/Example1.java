import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example1 implements ActionListener {


    //declare variables
    private JFrame mainFrame;
    private JPanel panel;
    private JLabel label;
    private JTextArea textArea;
    private JButton button;
    private JButton button2;
    private int count = 0;


    public static void main(String[] args) {
        Example1 ex = new Example1();
    }
    public Example1(){
        // construct things
        mainFrame = new JFrame();
        panel = new JPanel();
        panel.setLayout(new GridLayout(4,1));
        label = new JLabel( " This is the label");
        button = new JButton("Click here");
        button2= new JButton("This is another button");
        button.addActionListener(this);// make button clickable and do the stuff in actionPerformed
        button2.addActionListener(this);// make button clickable and do the stuff in actionPerformed

        panel.add(button);
        panel.add(button2);
        panel.add(label);

        mainFrame.add(panel);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("Don't Click the Button");
        mainFrame.setSize(400, 400);
        mainFrame.pack();
        mainFrame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Click here")) {
            System.out.println("Why did you click the button??");
            count++;

            label.setText("Number of Clicks: " + count);

        }
        else if (command.equals("This is another button")) {
            System.out.println("Button 2 Clicked");
            count--;
           String text = textArea.getText();
           label.setText(text);
            label.setText("Number of Clicks: " + count);




        }



    }
}
