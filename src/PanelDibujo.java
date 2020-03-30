import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class PanelDibujo extends JPanel implements MouseListener, MouseMotionListener{
	private Figura[] figuras;
	
	private int cantidad;
  
	private PanelControl1 pc;
	
	public void setPd(PanelControl1 pc) {
		this.pc=pc;
	}
  
  public PanelDibujo(){
		super();
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.pink);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.figuras=new Figura[10];
		this.cantidad=0;

	}
  
  public void borrarArreglo(int x) {
	  for (int i = x-1; i < figuras.length-1; i++) {
		  this.figuras[i]=this.figuras[i+1];
	}
	  this.figuras[figuras.length-1]=null;
	  cantidad--;
	  repaint();
  }
  
  public void setMover(int a, int b) {
	  Figura tmp=this.figuras[a-1];
	  this.figuras[a-1]=this.figuras[b-1];
	  this.figuras[b-1]=tmp;
	  repaint();
  }
  
  public void pintaFigura(Figura[] figura, int contador) {
	  expanderArreglo(contador);
	  for(int i=0; i<contador;i++) {
		  this.figuras[i]=figura[i];
		  this.cantidad++;
	  }
	  
	  this.repaint();
  }

  
  public Figura getFigura(int x) {
	  return this.figuras[x];
  }

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if(this.figuras[0]!=null) {
			for(int i=0;i<this.cantidad;i++) {
				if(this.figuras[i]!=null) {
				this.figuras[i].pinta(g);
				}
			}
		}

	}
	
	public int getCantidad() {
		return this.figuras.length;
	}
	
	public void expanderArreglo(int cantidad) {
		double prueba = (double)cantidad/this.figuras.length;
		if(prueba >= 0.9) {
			Figura[] tmp=new Figura[this.figuras.length*2];
			for (int i = 0; i < figuras.length; i++) {
				tmp[i]=this.figuras[i];
			}
			this.figuras=tmp;
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(pc.slcElipse()) {
			this.figuras[cantidad]=new Elipse(e.getX(),e.getY(),Color.BLACK);
		}
		else if(pc.slcRectangulo()){
			this.figuras[cantidad]=new Rectangulo(e.getX(),e.getY(),Color.BLACK);
		}
		else if(pc.slcLinea()) {
			this.figuras[cantidad]=new Linea(e.getX(),e.getY(),Color.BLACK);
		}
		else {
			//this.figuras[cantidad]=new Texto(pc.getTxt(),e.getX(),e.getY(),Color.BLACK);
		}
		cantidad++;
		expanderArreglo(this.cantidad);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.figuras[cantidad-1].setFinal(e.getX(), e.getY());
		this.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {

		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {

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
	public void mouseReleased(MouseEvent e) {

	}

}
