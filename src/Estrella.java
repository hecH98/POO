import java.awt.Color;
import java.awt.Graphics;

public class Estrella {
	protected Punto[] puntos;
	private int xi,
				y,
				xf;
	
	public Estrella(int xi, int y) {
		this.xi=xi;
		this.y=y;
		this.puntos=new Punto[8];
		for(int i=0;i<puntos.length;i++) {
			this.puntos[i]=new Punto(0,0);
		}
		
	}
	
	public void setXf(int xf) throws IllegalArgumentException{
		if(xf>this.xi) {
			this.xf=xf;
		}
		else {
			throw new IllegalArgumentException("El valor de xf es menor que xi");
		}
		
		calculaPuntos();
		
	}
	
	public int getXi() {
		return xi;
	}
	
	public int getY() {
		return y;
	}
	
	public int getXf() {
		return xf;
	}
	
	public void calculaPuntos() {
		int largo=this.xf-this.xi;
		
		this.puntos[0].setX(this.xi);
		this.puntos[0].setY(this.y);
		
		this.puntos[1].setX(this.xi+largo*4/10);
		this.puntos[1].setY(this.y+largo*1/10);
		
		this.puntos[2].setX(this.xi+largo/2);
		this.puntos[2].setY(this.y+largo/2);
		
		this.puntos[3].setX(this.xi+largo*6/10);
		this.puntos[3].setY(this.y+largo*1/10);
		
		this.puntos[4].setX(this.xf);
		this.puntos[4].setY(this.y);
		
		this.puntos[5].setX(this.xi+largo*6/10);
		this.puntos[5].setY(this.y-largo*1/10);
		
		this.puntos[6].setX(this.xi+largo/2);
		this.puntos[6].setY(this.y-largo/2);
		
		this.puntos[7].setX(this.xi+largo*4/10);
		this.puntos[7].setY(this.y-largo*1/10);
	}
	
	public void pintaEstrella(Graphics g) {
		g.setColor(Color.BLACK);
		for (int i=0; i<this.puntos.length-1;i++) {
			g.drawLine(this.puntos[i].getX(), this.puntos[i].getY(), this.puntos[i+1].getX(), this.puntos[i+1].getY());
		}
		g.drawLine(this.puntos[7].getX(), this.puntos[7].getY(), this.puntos[0].getX(), this.puntos[0].getY());
	}
	
}
