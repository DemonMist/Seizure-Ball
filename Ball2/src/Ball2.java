import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.Random;

public  class Ball2 extends JPanel implements ActionListener, KeyListener {
	  Random rand=new Random();
      int x = 0, y = 0;
      int anglex =100, angley = 100;
      
      static JFrame frame;
      static Ball2 app;

    		 
          private void move() {
              if (x + anglex < 0) {
                  anglex = rand.nextInt(10);
             } else if (x + anglex > getWidth() - 50) {
                  anglex = -rand.nextInt(600);
             } else if (y + angley < 0) {
                  angley = rand.nextInt(600);
             } else if (y + angley > getHeight() - 50) {
                  angley = -rand.nextInt(600);
             }
          
      x = x + anglex;
      y = y + angley;
      
      }
      
     @Override
     public void paint(Graphics g) {
    	 g.setColor(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
         g.fillOval( x, y, 50, 50); 
     }
     
     public static void main(String[] args) throws InterruptedException { 
    	 frame = new JFrame("Moving Ball");
    	 app = new Ball2();
    	 app.init();
}
     
     public void init() throws InterruptedException {
         
         
         frame.add(app);
         frame.setSize(500, 500);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         app.addKeyListener(this);
         
         //frame.addKeyListener(this);
        
         while(true) {
             app.move();
             app.repaint();
             Thread.sleep(10);
             }
     }

	@Override
	public void keyTyped(KeyEvent e) {
				int key = e.getKeyCode();
				
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
		
			x += 200;
		}
		else if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			x -= 200;
		}
		else if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			y += 200;
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			y -= 200;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	}

