import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;

public  class Ball2 extends JPanel {
	  Random rand=new Random();
      int x = 0, y = 0;
      int anglex =100, angley = 100;
      
    
          private void move() {
              if (x + anglex < 0) {
                  anglex = rand.nextInt(100);
             } else if (x + anglex > getWidth() - 50) {
                  anglex = -rand.nextInt(30);
             } else if (y + angley < 0) {
                  angley = rand.nextInt(75);
             } else if (y + angley > getHeight() - 50) {
                  angley = -rand.nextInt(37);
             }
          
      x = x + anglex;
      y = y + angley;
      
      }
      
     @Override
     public void paint(Graphics g) {
    	 g.setColor(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
         g.fillOval(x, y, 50, 50);
     }
     
     public static void main(String[] args) throws InterruptedException { 
     JFrame frame = new JFrame("Moving Ball");
     Ball2 app = new Ball2();
     frame.add(app);
     frame.setSize(500, 500);
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
     while(true) {
         app.move();
         app.repaint();
         Thread.sleep(10);
         }
}

	}

