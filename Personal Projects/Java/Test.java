import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test {
    private int count;
    private JLabel countLabel;

    public Test() {
        count = 0;
        countLabel = new JLabel("0", SwingConstants.CENTER);
        JButton incrementButton = new JButton("Increment");
        incrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                countLabel.setText(Integer.toString(count));
            }
        });
        JButton decrementButton = new JButton("Decrement");
        decrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count--;
                countLabel.setText(Integer.toString(count));
            }
        });
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(incrementButton);
        buttonPanel.add(decrementButton);
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.add(countLabel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        JFrame frame = new JFrame("Counter");
        frame.setContentPane(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Test counter = new Test();
        System.out.print("Num: " + counter);
    }
}