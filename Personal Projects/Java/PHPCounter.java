import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PHPCounter extends JFrame implements ActionListener {
    private int count1, count5, count10, count20, total;
    private JLabel countLabel1, countLabel5, countLabel10, countLabel20, totalLabel;

    public PHPCounter() {
        count1 = 0;
        count5 = 0;
        count10 = 0;
        count20 = 0;
        total = 0;
        countLabel1 = new JLabel("0", SwingConstants.CENTER);
        countLabel5 = new JLabel("0", SwingConstants.CENTER);
        countLabel10 = new JLabel("0", SwingConstants.CENTER);
        countLabel20 = new JLabel("0", SwingConstants.CENTER);
        totalLabel = new JLabel("Total: 0 pesos", SwingConstants.CENTER);
        JButton button1 = new JButton("Add 1");
        button1.addActionListener(this);
        button1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke('z'), "button1");
        button1.getActionMap().put("button1", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.doClick();
            }
        });
        JButton button5 = new JButton("Add 5");
        button5.addActionListener(this);
        button5.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke('x'), "button5");
        button5.getActionMap().put("button5", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button5.doClick();
            }
        });
        JButton button10 = new JButton("Add 10");
        button10.addActionListener(this);
        button10.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke('c'), "button10");
        button10.getActionMap().put("button10", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button10.doClick();
            }
        });
        JButton button20 = new JButton("Add 20");
        button20.addActionListener(this);
        button20.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke('v'), "button20");
        button20.getActionMap().put("button20", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button20.doClick();
            }
        });
        JPanel buttonPanel = new JPanel(new GridLayout(4, 2));
        buttonPanel.add(new JLabel("1: "));
        buttonPanel.add(countLabel1);
        buttonPanel.add(button1);
        buttonPanel.add(new JLabel("5: "));
        buttonPanel.add(countLabel5);
        buttonPanel.add(button5);
        buttonPanel.add(new JLabel("10: "));
        buttonPanel.add(countLabel10);
        buttonPanel.add(button10);
        buttonPanel.add(new JLabel("20: "));
        buttonPanel.add(countLabel20);
        buttonPanel.add(button20);
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.add(buttonPanel, BorderLayout.CENTER);
        contentPane.add(totalLabel, BorderLayout.SOUTH);
        setContentPane(contentPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            if (button.getText().equals("Add 1")) {
                count1++;
                total += 1;
                countLabel1.setText(Integer.toString(count1));
            } else if (button.getText().equals("Add 5")) {
                count5++;
                total += 5;
                countLabel5.setText(Integer.toString(count5));
            } else if (button.getText().equals("Add 10")) {
                count10++;
                total += 10;
                countLabel10.setText(Integer.toString(count10));
            } else if (button.getText().equals("Add 20")) {
                count20++;
                total += 20;
                countLabel20.setText(Integer.toString(count20));
            }
            totalLabel.setText("Total: " + total + " pesos");
        }
    }

    public static void main(String[] args) {
        PHPCounter counter = new PHPCounter();
    }
}