/* Kitthanya Teachanontkullawat (Mine) 64050027 */
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    /* Frame */
    private JFrame frame;

    /* Input Section */
    private JLabel sourceCodeHeader;
    private JTextArea sourceCode;
    private JScrollPane sourceCodeScrollPane;

    /* Output Section */
    private JLabel tokenHeader;
    private JTextArea token;
    private JScrollPane tokenScrollPane;

    /* Action Buttons */
    private JButton typeOne;
    private JButton typeTwo;

    /* Create GUI */
    public View() {
        /* Window Setup */
        frame = new JFrame("CSGO");
        frame.setSize(700, 700);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        /* Title for Source Code Input */
        sourceCodeHeader = new JLabel("Your Source");
        sourceCodeHeader.setBounds(10, 10, 200, 25);
        frame.add(sourceCodeHeader);

        /* Title for Data Type Output */
        tokenHeader = new JLabel("Token Output");
        tokenHeader.setBounds(10, 300, 100, 25);
        frame.add(tokenHeader);

        /* Source Code Input Text Area */
        sourceCode = new JTextArea();
        sourceCodeScrollPane = new JScrollPane(sourceCode);
        sourceCodeScrollPane.setBounds(5, 40, 690, 250);
        frame.add(sourceCodeScrollPane);

        /* Token Output Text Area */
        token = new JTextArea();
        tokenScrollPane = new JScrollPane(token);
        tokenScrollPane.setBounds(5, 330, 690, 250);
        token.setBackground(Color.ORANGE);
        frame.add(tokenScrollPane);

        /* Type One Button */
        typeOne = new JButton("Analyze One");
        typeOne.setBounds(200, 600, 100, 50);
        frame.add(typeOne);

        /* Type Two Button */
        typeTwo = new JButton("Analyze Two");
        typeTwo.setBounds(390, 600, 100, 50);
        frame.add(typeTwo);

        /* Display the Frame */
        frame.setVisible(true);
    }

    /* Get the source code (input) */
    public String getSourceCode() {
        return sourceCode.getText();
    }

    /* Set the Data Type (output) */
    public void setToken(String result) {
        token.setText(result);
    }

    /* Add Action on Analyze One Button */
    public void addTypeOneButtonListener(ActionListener evt) {
        typeOne.addActionListener(evt);
    }

    /* Add Action on Analyze Two Button */
    public void addTypeTwoButtonListener(ActionListener evt) {
        typeTwo.addActionListener(evt);
    }
}
