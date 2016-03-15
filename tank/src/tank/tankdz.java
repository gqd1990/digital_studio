package tank;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class tankdz  extends JFrame
{
    MyPanel mp=null;
	public static void main(String[] args) 
	{
		tankdz t1=new tankdz();
	}
	public tankdz()
	{
		mp=new MyPanel();
		this.add(mp);
		this.addKeyListener(mp);
		
		this.setSize(400,300);
		this.setLocation(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
class MyPanel extends JPanel implements KeyListener
{
	MyTank mt =null;
	Vector<DiTank> dtk=new Vector<DiTank>();
	final int tksl=3;
	
	public MyPanel()
	{
		mt=new MyTank(100,100);
		for(int i=0;i<tksl;i++)
		{
			DiTank dt=new DiTank(i*177+5,0);
			dtk.add(dt);
		}
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.fillRect(0, 0, 400, 300);
		this.drawTank(mt.getX(), mt.getY(), g, 3, 1);
		for(int i=0;i<tksl;i++)
		{
			this.drawTank(dtk.get(i).getX(), dtk.get(i).getY(), g, 1, 0);
		}
		
	}
	public void drawTank(int x, int y,Graphics g, int fangxiang, int leixing)
	{
		switch(leixing)
		{
		    case(0):
		    {
			    g.setColor(Color.green);
			    break;
		    }
		    case(1):
		    {
		    	g.setColor(Color.yellow);
		    	break;
		    }
		}
		switch (fangxiang)
		{
		    case(0)://shang
		    {
		    	g.fill3DRect(x,y, 5, 30, false);
				g.fill3DRect(x+15, y, 5, 30, false);
				g.fill3DRect(x+5, y+5, 10, 20, false);
				g.fillOval(x+5, y+10, 10, 10);
				g.drawLine(x+10, y+15, x+10, y-2);
				break;
		    }
		    case(1)://xia
		    {
		    	g.fill3DRect(x,y,5,30,false);
		    	g.fill3DRect(x+15, y, 5, 30, false);
				g.fill3DRect(x+5, y+5, 10, 20, false);
				g.fillOval(x+5, y+10, 10, 10);
				g.drawLine(x+10, y+15, x+10, y+32);
				break;
		    }
		    case(2)://zuo
		    {
		    	g.fill3DRect(x,y,30,5,false);
		    	g.fill3DRect(x, y+15, 30, 5, false);
				g.fill3DRect(x+5, y+5, 20, 10, false);
				g.fillOval(x+10, y+5, 10, 10);
				g.drawLine(x+15, y+10, x-2, y+10);
				break;
		    }
		    case(3)://you
		    {
		    	g.fill3DRect(x,y,30,5,false);
		    	g.fill3DRect(x, y+15, 30, 5, false);
				g.fill3DRect(x+5, y+5, 20, 10, false);
				g.fillOval(x+10, y+5, 10, 10);
				g.drawLine(x+15, y+10, x+32, y+10);
				break;
		    }
		}		
	}
	public void keyTyped(KeyEvent e)
	{
		
	}
	public void keyReleased(KeyEvent e)
	{
		
	}
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode()==KeyEvent.VK_W)
		{
			this.mt.setFangxiang(0);
			this.mt.shang();
		}
		else if(e.getKeyCode()==KeyEvent.VK_A)
		{
			this.mt.setFangxiang(1);
			this.mt.zuo();
		}
		else if(e.getKeyCode()==KeyEvent.VK_S)
		{
			this.mt.setFangxiang(2);
			this.mt.xia();
		}
		else if(e.getKeyCode()==KeyEvent.VK_D)
		{
			this.mt.setFangxiang(3);
			this.mt.you();
		}
		this.repaint();//用于擦去以前的内容
	}
}

