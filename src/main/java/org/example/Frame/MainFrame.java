/*
 * Created by JFormDesigner on Mon Dec 05 15:33:16 CST 2022
 */

package org.example.Frame;

import java.awt.*;
import javax.swing.*;

/**
 * @author Brainrain
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        initComponents();
        initFunction();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new JPanel();
        textField1 = new JTextField();
        panel2 = new JPanel();
        New_Button = new JButton();
        Delete_Button = new JButton();
        Save_Button = new JButton();
        scrollPane2 = new JScrollPane();
        Title_List = new JList();
        scrollPane3 = new JScrollPane();
        Value_textArea1 = new JTextArea();

        //======== this ========
        setTitle("\u6d4b\u8bd5\u684c\u9762\u5c0f\u7a0b\u5e8f");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setLayout(new BorderLayout());
            panel1.add(textField1, BorderLayout.CENTER);

            //======== panel2 ========
            {
                panel2.setLayout(new GridLayout(1, 3));

                //---- New_Button ----
                New_Button.setText("\u65b0\u5efa");
                panel2.add(New_Button);

                //---- Delete_Button ----
                Delete_Button.setText("\u5220\u9664");
                panel2.add(Delete_Button);

                //---- Save_Button ----
                Save_Button.setText("\u4fdd\u5b58");
                panel2.add(Save_Button);
            }
            panel1.add(panel2, BorderLayout.EAST);
        }
        contentPane.add(panel1, BorderLayout.NORTH);

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(Title_List);
        }
        contentPane.add(scrollPane2, BorderLayout.WEST);

        //======== scrollPane3 ========
        {
            scrollPane3.setViewportView(Value_textArea1);
        }
        contentPane.add(scrollPane3, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    private void initFunction() {
        setVisible(true);
        int width = 500;
        int height = 300;
        setBounds((getWidth()-width)/2+getX(),(getHeight()-height)/2+getY(),width,height);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel panel1;
    private JTextField textField1;
    private JPanel panel2;
    private JButton New_Button;
    private JButton Delete_Button;
    private JButton Save_Button;
    private JScrollPane scrollPane2;
    private JList Title_List;
    private JScrollPane scrollPane3;
    private JTextArea Value_textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
