import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class PanelDibujoEstrella extends JPanel implements MouseListener, MouseMotionListener{
	private Estrella estrellita;
	private EstrellaHija es;
	
	public PanelDibujoEstrella() {
		super();
		this.setPreferredSize(new Dimension(800,600));
		this.setBackground(Color.pink);
		
		
		this.es=new EstrellaHija(0, 300);
		this.es.setXf(600);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	public void setEstrellita(int x, int y) {
		this.estrellita=new Estrella(x, y);
		this.repaint();
	}
	
	public Estrella getEstrellita() {
		return estrellita;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(this.estrellita!=null) {
			this.estrellita.pintaEstrella(g);
		}
		//this.es.pintarEstrella(g);
	}

	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		System.out.println(x+","+y);
		this.setEstrellita(x, y);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int x=e.getX();
		System.out.println(x);
		this.estrellita.setXf(x);
		this.repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
