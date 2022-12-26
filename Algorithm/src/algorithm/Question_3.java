
package algorithm;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Question_3 extends JPanel{
     int[] coordinates={100,20};
    int mar=50;
    protected void paintComponent(Graphics Question_3){
        super.paintComponent(Question_3);
        Graphics2D g1=(Graphics2D)Question_3;
        g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        int width=getWidth();
        int height=getHeight();
        g1.draw(new Line2D.Double(mar,mar,mar,height-mar));
        g1.draw(new Line2D.Double(mar,height-mar,width-mar,height-mar));
        double x=(double)(width-2*mar)/(coordinates.length-1);
        double scale=(double)(height-2*mar)/getMax();
        g1.setPaint(Color.BLUE);
        for(int i=0;i<coordinates.length;i++){
            double x1=mar+i*x;
            double y1=height-mar-scale*coordinates[i];
            g1.fill(new Ellipse2D.Double(x1-2,y1-2,4,4));
        }
        
        
        
    }
    private int getMax(){
        int max=-Integer.MAX_VALUE;
        for(int i=0;i<coordinates.length;i++){
            if(coordinates[i]>max)
                max=coordinates[i];
           
        }return max;
    }       
        
    public static void main(String args[]){
        JFrame frame =new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new Question_3());
    frame.setSize(400,400);
    frame.setLocation(200,200);
    frame.setVisible(true);
    }
}
    

