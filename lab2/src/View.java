import java.awt.event.*;
import javax.swing.*;

public class View {
    private JFrame frame;
    private JLabel label;
    private JTextField text;
    private JButton button;

    public View() {
        frame = new JFrame("Cross-platform lab2");
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label = new JLabel("Your Name");
        label.setBounds(100, 100, 100, 25);
        frame.add(label);
        text = new JTextField();
        text.setBounds(100, 200, 100, 25);
        frame.add(text);
        button = new JButton("Set Name");
        button.setBounds(100, 300, 100, 25);
        frame.add(button);

        frame.revalidate();
        frame.repaint();
    }

    public String getText() {
        return text.getText();
    }
    public void setLabelText(String str) {
        label.setText(str);
    }

    public void addButtonActionListener(ActionListener listener) {
        button.addActionListener(listener);
    }
}
