package projet;
import javax.swing.*;
import java.awt.*;

public class MyForm extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton btn ;
    

    public MyForm() {
        // Create the main window
        super("Formulaire du Client ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the labels and text fields
        label1 = new JLabel("NO Client :");
        label2 = new JLabel("Adresse 2 Client :");
        label3 = new JLabel("Nom Client:");
        label4 = new JLabel("Prénom Client:");
        label5 = new JLabel("Adresse  Client :");
        label6 = new JLabel("Age Client :");
        label7 = new JLabel("No tel Client:");
        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        textField3 = new JTextField(20);
        textField4 = new JTextField(20);
        textField5 = new JTextField(20);
        textField6 = new JTextField(20);
        textField7 = new JTextField(20);
        btn = new JButton("Envoyer");


        // Create a panel for the labels and text fields
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Add the first label and text field to the panel
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(10, 10, 0, 0);
        panel.add(label1, c);
        c.insets = new Insets(80, 10, 0, 0);
        panel.add(label3, c);
        c.insets = new Insets(140, 10, 0, 0);
        panel.add(label4, c);
        c.insets = new Insets(200, 10, 0, 0);
        panel.add(label5, c);
        c.insets = new Insets(250, 60, 0, 0);
        panel.add(btn, c);

        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_END;
        c.insets = new Insets(10, 10, 0, 10);
        panel.add(textField1, c);
        c.insets = new Insets(80, 10, 0, 10);
        panel.add(textField3, c);
        c.insets = new Insets(140, 10, 0, 10);
        panel.add(textField4, c);
        c.insets = new Insets(200, 10, 0, 10);
        panel.add(textField5, c);

        // Add the second label and text field to the panel
        c.gridx = 2;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(10, 10, 0, 0);
        panel.add(label2, c);
        c.insets = new Insets(80, 10, 0, 0);
        panel.add(label6, c);
        c.insets = new Insets(140, 10, 0, 0);
        panel.add(label7, c);
        
       
       

        c.gridx = 3;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_END;
        c.insets = new Insets(10, 10, 0, 10);
        panel.add(textField2, c);
        c.insets = new Insets(80, 10, 0, 10);
        panel.add(textField6, c);
        c.insets = new Insets(140, 10, 0, 10);
        panel.add(textField7, c);
        

        // Add the panel to the main window
        getContentPane().add(panel, BorderLayout.WEST);

        // Display the window
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        MyForm form = new MyForm();
    }
}
