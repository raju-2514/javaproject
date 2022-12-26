
package basicjava;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;


public class Temperature extends JFrame implements ActionListener {
    
JLabel title;
    JTextField tf1, tf2;
    JComboBox combobox1, combobox2;

    String[] Temp1 = {"Celsius", "Fahrenheit", "Kelvin"};
    String[] Temp2 = {"Celsius", "Fahrenheit", "Kelvin"};

    JButton btn1, btn2,back;
    
    Temperature(){
        
         title = new JLabel("Temperature converter Calculator");
        title.setBounds(20, 10, 400, 20);
        title.setForeground(Color.BLUE);
         title.setFont(new Font("Tahoma",Font.BOLD,15));
        add(title);

        tf1 = new JTextField();
        tf1.setBounds(20, 50, 120, 25);
        tf1.setBackground(Color.white);
        add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(20, 80, 120, 25);
        tf2.setBackground(Color.white);
        add(tf2);
        combobox1 = new JComboBox(Temp1);
        combobox1.setBounds(160, 50, 80, 25);
        combobox1.setFont(new Font("Arial", Font.BOLD, 11));
        add(combobox1);
        combobox2 = new JComboBox(Temp2);
        combobox2.setBounds(160, 80, 80, 25);
        combobox2.setFont(new Font("Arial", Font.BOLD, 11));
        add(combobox2);
        btn1 = new JButton("convert");
        btn1.setBounds(120, 130, 80, 25);
        btn1.setBackground(Color.blue);
        btn1.setForeground(Color.white);
        add(btn1);
        btn2 = new JButton("clear");
        btn2.setBounds(20, 130, 80, 25);
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.white);
        add(btn2);
        back= new JButton("back");
        back.setBounds(70, 170, 80, 25);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        
        tf1.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent ke) {

                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '.' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    tf1.setEditable(true);

                } else {
                    tf1.setEditable(false);
                    JOptionPane.showMessageDialog(null, "Enter only numeric digits");

                }
            }
        });
        
        
         getContentPane().setBackground(Color.white);
        
        setBounds(100, 200, 330, 270);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        
         if (e.getSource() == btn2) {

                tf1.setText("");
                tf2.setText("");

            } else if ((e.getSource() == btn1)) {
                String box1 = (String) combobox1.getSelectedItem();
                String box2 = (String) combobox2.getSelectedItem();

                if ((box1.equals("Celsius")) && (box2.equals("Fahrenheit"))) {

                    String str1 = tf1.getText();

                    double c = Double.parseDouble(str1);
                    double f = (double) (((9 * c) / 5) + 32);
                    tf2.setText("" + f);
                    tf2.setEditable(false);
                }
                if ((box1.equals("Celsius")) && (box2.equals("Kelvin"))) {

                    String str1 = tf1.getText();

                    double c = Double.parseDouble(str1);
                    double k = (double) (c + 273.15);
                    tf2.setText("" + k);
                    tf2.setEditable(false);
                }

                if ((box1.equals("Fahrenheit")) && (box2.equals("Celsius"))) {

                    String str1 = tf1.getText();

                    double f = Double.parseDouble(str1);
                    double c = (double) (((f - 32) * 5 )/ 9);
                    tf2.setText("" + c);
                    tf2.setEditable(false);
                }
                if ((box1.equals("Fahrenheit")) && (box2.equals("Kelvin"))) {
                    String str1 = tf1.getText();
                    double f = Double.parseDouble(str1);
                    double k = (double) (273.5 + ((f - 32.0) * (5.0 / 9.0)));

                    tf2.setText("" + k);
                    tf2.setEditable(false);
                }

                if ((box1.equals("Kelvin")) && (box2.equals("Celsius"))) {
                    String str1 = tf1.getText();
                    double k = Double.parseDouble(str1);
                    double c = (double) (k - 273.15);
                    tf2.setText("" + c);
                    tf2.setEditable(false);
                }

                if ((box1.equals("Kelvin")) && (box2.equals("Fahrenheit"))) {
                    String str1 = tf1.getText();
                    double k = Double.parseDouble(str1);
                    double f = (double) (((k - 273.15) * 9 )/(5 + 32)) ;
                    tf2.setText("" + f);
                    tf2.setEditable(false);
                }
            }
            else if(e.getSource()==back){
                new anothercal().setVisible(true);
                this.setVisible(false);
                
            }
        
    }
    public static void main(String[] args) {
        new Temperature();
    }
}
