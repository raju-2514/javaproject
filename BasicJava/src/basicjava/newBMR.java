
package basicjava;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;


public class newBMR extends JFrame implements ActionListener {
    JComboBox combox;
    JLabel title,label1, label2, label3, label4, label5;
    String[] BMR = {"select", "Woman", "Man"};
    JTextField textfield1, textfield2, textfield3, textfield4;
    JButton btn1, btn2, back;
    String s4;
    newBMR() {
        
        combox = new JComboBox(BMR);
        combox.setBounds(10, 45, 80, 25);
        
        combox.setFont(new Font("Arial", Font.BOLD, 11));
        add(combox);
        
        title = new JLabel("BMR Calculator");
        title.setBounds(70, 10, 130, 30);
        title.setForeground(Color.BLUE);
        title.setFont(new Font("Tahoma",Font.BOLD,17));
        add(title);
        label1 = new JLabel("Age:");
        label1.setBounds(10, 90, 80, 20);
        label1.setBackground(Color.black);
        add(label1);
        textfield1 = new JTextField("year(15-80)");
        textfield1.setBounds(100, 90, 80, 20);
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
        
        label2 = new JLabel("Weight:");
        label2.setBounds(10, 125, 80, 20);
        label2.setBackground(Color.black);
        add(label2);
        textfield2 = new JTextField("kg");
        textfield2.setBounds(100, 125, 80, 20);
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
        
        label3 = new JLabel("Height:");
        label3.setBounds(10, 160, 80, 20);
        label3.setBackground(Color.black);
        add(label3);
        textfield3 = new JTextField("feet");
        textfield3.setBounds(100, 160, 80, 20);
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
        label4 = new JLabel("BMR:");
        label4.setBounds(10, 195, 80, 20);
        label4.setBackground(Color.black);
        add(label4);
        textfield4 = new JTextField("watt");
        textfield4.setBounds(100, 195, 130, 20);
        textfield4.setBackground(Color.white);
        
        add(textfield4);
        btn1 = new JButton("submit");
        btn1.setBounds(20, 240, 80, 30);
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        add(btn1);
        btn2 = new JButton("clear");
        btn2.setBounds(120, 240, 80, 30);
        btn2.setBackground(Color.BLUE);
        btn2.setForeground(Color.white);
        btn2.addActionListener(this);
        add(btn2);
        
        back = new JButton("Back");
        back.setBounds(70, 280, 80, 30);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        textfield1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (textfield1.getText().equals("year(15-80)")) {
                    textfield1.setText("");
                    textfield1.setForeground(Color.black);
                }
            }
            
            @Override
            public void focusLost(FocusEvent fe) {
                if (textfield1.getText().equals("")) {
                    textfield1.setText("year(15-80)");
                    textfield1.setForeground(Color.black);
                }
            }
            
        });
        textfield2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (textfield2.getText().equals("kg")) {
                    textfield2.setText("");
                    textfield2.setForeground(Color.black);
                }
            }
            
            @Override
            public void focusLost(FocusEvent fe) {
                if (textfield2.getText().equals("")) {
                    textfield2.setText("kg");
                    textfield2.setForeground(Color.black);
                }
            }
            
        });
        textfield3.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (textfield3.getText().equals("feet")) {
                    textfield3.setText("");
                    textfield3.setForeground(Color.black);
                }
            }
            
            @Override
            public void focusLost(FocusEvent fe) {
                if (textfield3.getText().equals("")) {
                    textfield3.setText("feet");
                    textfield3.setForeground(Color.black);
                }
            }
            
        });
        textfield4.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (textfield4.getText().equals("watt")) {
                    textfield4.setText("");
                    textfield4.setForeground(Color.black);
                }
            }
            
            @Override
            public void focusLost(FocusEvent fe) {
                if (textfield4.getText().equals("")) {
                    textfield4.setText("watt");
                    textfield4.setForeground(Color.black);
                }
            }
            
        });
        
        getContentPane().setBackground(Color.white);
        
        setBounds(100, 200, 300, 370);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        
        
        if (e.getSource() == btn2) {
            
            textfield1.setText("");
            textfield2.setText("");
            textfield3.setText("");
            textfield4.setText("");
            
        } else if (e.getSource() == btn1) {
            String s4 = combox.getSelectedItem().toString();
            // String s1=tf1.getText();
            //double x1=Double.parseDouble(s1);
            //double age=Double.parseDouble(tf1.getText());
            float age = Float.parseFloat(textfield1.getText());
            
            System.out.println(age);
            // String s2=tf2.getText();
            //  double weight=Double.parseDouble(tf2.getText());
            float weight = Float.parseFloat(textfield2.getText());
            System.out.println(weight);
            //  double height=Double.parseDouble(tf3.getText());
            float height = Float.parseFloat(textfield3.getText());
            System.out.println(height);
            // double x2=Double.parseDouble(s2);
            //  String s3=tf3.getText();
            // double x3=Double.parseDouble(s3);

            if (s4.equals("Man")) {
                //double d=3+x1+x2+x3;
                // System.out.println("m");
                double m = 65 + (weight * 13.7) + (height * 5) - (age * 6.8);

                // System.out.println("%.3lf"+m);
                textfield4.setText("" + m);
                textfield4.setEditable(false);
                // tf4.setText(String.valueOf(d));
            } //if(s4.equals("women"))
            else if (s4.equals("Woman")) {
                //double m=5-x1+x2+x3;

                double m = 655 + (weight * 9.6) + (height * 1.8) - (age * 4.7);
                // float m=(float)f;
                textfield4.setText("" + m);
                textfield4.setEditable(false);
                //tf4.setText(String.valueOf(m));
            } 
            
                
            
        }
         else if (e.getSource() == back) {
                new anothercal().setVisible(true);
                this.setVisible(false);
                         }
            
        
            
        
        
    }
    
    public static void main(String[] args) {
        new newBMR();
    }
}


    

