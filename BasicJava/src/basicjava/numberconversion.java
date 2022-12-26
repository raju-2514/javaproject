
package basicjava;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class numberconversion extends JFrame implements ActionListener {
 JLabel title,label1, label2, label3, label4;
    JTextField textfield1, textfield2, textfield3, textfield4;
    JButton result, clear, back;
    JComboBox combo;
    String[] select = { "Binary", "Decimal", "Octal", "Hexa"};
    numberconversion(){
        
        combo = new JComboBox(select);
        combo.setBounds(10, 55, 100, 23);
        combo.setBackground(Color.white);
        combo.setForeground(Color.black);
        add(combo);

        title = new JLabel("Number Conversion Calculator");
        title.setBounds(45, 10, 250, 30);
        title.setForeground(Color.BLUE);
         title.setFont(new Font("Tahoma",Font.BOLD,16));
        add(title);
        label1 = new JLabel("Decimal:");
        label1.setBounds(10, 110, 80, 20);
        label1.setBackground(Color.black);
        add(label1);
        textfield1 = new JTextField();
        textfield1.setBounds(100, 110, 120, 20);
        textfield1.setBackground(Color.white);
        textfield1.setForeground(new Color(0, 0, 0));
        add(textfield1);

        textfield1.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent ke) {

                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '.' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    textfield1.setEditable(true);

                } else {
                    textfield1.setEditable(false);
                    JOptionPane.showMessageDialog(null, "Enter only numeric digits");

                }
            }
        });

        label2 = new JLabel("Binary:");
        label2.setBounds(10, 145, 800, 20);
        label2.setBackground(Color.black);
        add(label2);
        textfield2 = new JTextField();
        textfield2.setBounds(100, 145, 120, 20);
        textfield2.setBackground(Color.white);
        add(textfield2);

        textfield2.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent ke) {

                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '.' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    textfield2.setEditable(true);

                } else {
                    textfield2.setEditable(false);
                    JOptionPane.showMessageDialog(null, "Enter only numeric digits");

                }
            }
        });

        label3 = new JLabel("Octal:");
        label3.setBounds(10, 180, 80, 20);
        label3.setBackground(Color.black);
        add(label3);
        textfield3 = new JTextField();
        textfield3.setBounds(100, 180, 120, 20);
        textfield3.setBackground(Color.white);
        add(textfield3);

        textfield3.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent ke) {

                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '.' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    textfield3.setEditable(true);

                } else {
                    textfield3.setEditable(false);
                    JOptionPane.showMessageDialog(null, "Enter only numeric digits");

                }
            }
        });
        label4 = new JLabel("Hexa:");
        label4.setBounds(10, 215, 80, 20);
        label4.setBackground(Color.black);
        add(label4);
        textfield4 = new JTextField();
        textfield4.setBounds(100, 215, 120, 20);
        textfield4.setBackground(Color.white);
        add(textfield4);
        result = new JButton("result");
        result.setBounds(50, 250, 70, 20);
        result.setBackground(Color.black);
        result.setForeground(Color.white);
        result.addActionListener(this);
        add(result);
        clear = new JButton("clear");
        clear.setBackground(Color.BLUE);
        clear.setBounds(180, 250, 70, 20);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        back = new JButton("Back");
        back.setBackground(Color.GRAY);
        back.setForeground(Color.white);
        back.setBounds(100, 280, 90, 20);
        back.addActionListener(this);
        add(back);

        
        
        getContentPane().setBackground(Color.white);
        
        setBounds(100, 200, 370, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource() == clear) {
                textfield1.setText("");
                textfield2.setText("");
                textfield3.setText("");
                textfield4.setText("");

            } else if (e.getSource() == result) {

                String box = (String) combo.getSelectedItem();

                if (box.equals("Decimal")) {
                    //textfield2.setEditable(false);
                    String str = textfield1.getText();

                    int i = Integer.parseInt(str);
                    String str1 = Integer.toBinaryString(i);
                    textfield2.setText("" + str1);
                   // textfield2.setEditable(false);

                    // str2 = textfield.getText();
                    int k = Integer.parseInt(str);
                    String str2 = Integer.toHexString(k);
                    textfield4.setText("" + str2);
                    //textfield4.setEditable(false);

                    //String str3 = textField.getText();
                    int j = Integer.parseInt(str);
                    String str3 = Integer.toOctalString(j);
                    textfield3.setText("" + str3);
                    //textfield3.setEditable(false);

                }

                if (box.equals("Binary")) {

                    String str1 = textfield2.getText();

                    int i = Integer.parseInt(str1, 2);
                    textfield1.setText("" + i);
                    //textfield1.setEditable(false);

                    // str2 = textfield.getText();
                    // int j = Integer.parseInt(str1);
                    String str2 = Integer.toHexString(i);
                    textfield4.setText("" + str2);
                  //  textfield4.setEditable(false);

                    //String str3 = textField.getText();
                    //  int   k= Integer.parseInt(str1);
                    String str3 = Integer.toOctalString(i);
                    textfield3.setText("" + str3);
                   // textfield3.setEditable(false);

                }

                if (box.equals("Octal")) {

                    String str3 = textfield3.getText();

                    int i = Integer.parseInt(str3, 8);
                    textfield1.setText("" + i);
                   // textfield1.setEditable(false);

                    String str1 = Integer.toBinaryString(i);
                    textfield2.setText("" + str1);
                    //textfield2.setEditable(false);

                    // str2 = textfield.getText();
                    // int j = Integer.parseInt(str1);
                    String str2 = Integer.toHexString(i);
                    textfield4.setText("" + str2);
                   // textfield4.setEditable(false);

                    //String str3 = textField.getText();
                    //  int   k= Integer.parseInt(str1);
                }

                if (box.equals("Hexa")) {

                    String str2 = textfield4.getText();

                    int i = Integer.parseInt(str2, 16);
                    textfield1.setText("" + i);
                   // textfield1.setEditable(false);

                    String str1 = Integer.toBinaryString(i);
                    textfield2.setText("" + str1);
                   // textfield2.setEditable(false);

                    String str3 = Integer.toOctalString(i);
                    textfield3.setText("" + str3);
                   // textfield3.setEditable(false);

                }

            } else if (e.getSource() == back) {
                new anothercal().setVisible(true);
                this.setVisible(false);
               
            }

    }
    public static void main(String[] args) {
        new numberconversion();
    }
}

