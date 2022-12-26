
package swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;


public class jslider extends JFrame{
    public jslider() 
    {  
JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
slider.setMinorTickSpacing(2);  
slider.setMajorTickSpacing(10);  
slider.setPaintTicks(true);  
slider.setPaintLabels(true);  
  
JPanel panel=new JPanel();  
panel.add(slider);  
add(panel);  
}  
public static void main(String s[]) {  
jslider frame=new jslider();  
frame.pack();  
frame.setVisible(true);  
}  
    
}
