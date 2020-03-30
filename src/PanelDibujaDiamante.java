import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class PanelDibujaDiamante extends JPanel implements MouseListener, MouseMotionListener{
	private Diamante diamantito;
	
	public PanelDibujaDiamante() {
		super();
		this.setPreferredSize(new Dimension(800,600));
		this.setBackground(Color.pink);
		
		//this.diamantito=new Diamante(0,200);
		//this.diamantito.setXf(100);
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
	}
	
	public void setDiamantito(int x, int y) {
		this.diamantito=new Diamante(x,y);
		this.repaint();
	}
	
	public Diamante getDiamantito() {
		return this.diamantito;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.diamantito.pintaDiamante(g);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		System.out.println(x+","+y);
		this.setDiamantito(x, y);
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		int x=e.getX();
		System.out.println(x);
		this.diamantito.setXf(x);
		repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
