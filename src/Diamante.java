import java.awt.Color;
import java.awt.Graphics;

public class Diamante {
	protected Punto[] puntos;
	private int xi,
				y,
				xf;
	
	public Diamante(int xi, int y) {
		this.xi=xi;
		this.y=y;
		
		puntos=new Punto[4];
		for(int i=0;i<puntos.length;i++) {
			this.puntos[i]=new Punto(0,0);
		}
		
	}
	
	public void setXf(int xf) throws IllegalArgumentException{
		if(xf>xi) {
			this.xf=xf;
		}
		else {
			throw new IllegalArgumentException("El valor de xf es menor qye xi");
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
	
	private void calculaPuntos() {
		int largo=this.xf-this.xi;
		
		this.puntos[0].setX(this.xi);
		this.puntos[0].setY(this.y);
		
		this.puntos[1].setX(this.xi+largo/2);
		this.puntos[1].setY(this.y-largo*2);
		
		this.puntos[2].setX(this.xf);
		this.puntos[2].setY(this.y);
		
		this.puntos[3].setX(this.xi+largo/2);
		this.puntos[3].setY(this.y+largo*2);
	}
	
	public void pintaDiamante(Graphics g) {
		g.setColor(Color.black);
		for(int i=0;i<puntos.length-1;i++) {
			g.drawLine(puntos[i].getX(), puntos[i].getY(), puntos[i+1].getX(),puntos[i+1].getY());
		}
		g.drawLine(puntos[3].getX(), puntos[3].getY(), puntos[0].getX(), puntos[0].getY());
	}
	
}
