import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements Runnable, MouseListener{

	private Image fondo,
				  pocoyo;
	
	private int xV, 
			    yV;
	
	private Thread hilo;
	
		private Color colorGlobo;
	
	private String nombre;
	
	private Bolita[] bolitas;
	
	private boolean move;
	
	private boolean dibujarBolitas;
	
	
	
	public MyPanel() {
		super();
		this.setPreferredSize(new Dimension(800, 600));
		this.fondo=new ImageIcon("wallpaper.png").getImage();
		this.pocoyo=new ImageIcon("Pocoyo_feliz.jpg").getImage();
		
		
		this.bolitas=new Bolita[3];
		bolitas[0]=new Bolita(100,100,Color.blue);
		bolitas[1]=new Bolita(300,350,Color.red);
		bolitas[2]=new Bolita(608,400,Color.green);
		
		
		
		this.xV=this.yV=0;
		this.hilo=new Thread(this);
		this.hilo.start();
		this.nombre= "Pocoyo";
		this.colorGlobo=Color.red;
		this.move=false;
		this.addMouseListener(this);
		
		this.dibujarBolitas=true;
	}
	
	public void setNombre(String  nombre) {
		this.nombre=nombre;
		this.repaint();
	}
	
	public void setColorGlobo(Color color) {
		this.colorGlobo=color;
		this.repaint();
	}
	
	public void setVY(int yV) {
		this.yV=-yV;
		this.repaint();
	}
	
	public void setBolitas(boolean dibujar) {
		this.dibujarBolitas=dibujar;
		this.repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.fondo, 0, 0, this.getWidth(), this.getHeight(), this);
		g.setColor(Color.cyan);
		g.fillArc(50+this.xV, 500+this.yV, 200, 100, 0, 100);
		g.drawImage(this.pocoyo, 170+this.xV, 515+this.yV, 50,50,this);
		g.setColor(Color.orange);
		g.fillArc(50+this.xV,500+this.yV,200,100, 100, 260);
		g.setColor(Color.black);
		g.drawString("Vamos "+this.nombre+"!!", 85+this.xV, 570+this.yV);
		g.setColor(Color.black);
		g.drawLine(100+this.xV, 507+this.yV, 100+this.xV, 400+this.yV);
		g.setColor(this.colorGlobo);
		g.fillOval(50+this.xV,300+this.yV, 100, 100);
	
		
		if(this.dibujarBolitas) {
			for(int i=0;i<this.bolitas.length;i++) {
				this.bolitas[i].pintar(g);
			}
		}
		
	}
	
	@Override
	public void run() {
		while(this.xV<550){
			try {
				if(move) {
					this.xV+=2;
					this.yV--;
					this.repaint();
				}
				Thread.sleep(15);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		this.move=true;
		
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
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
