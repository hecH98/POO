import java.awt.Color;
import java.awt.Graphics;

public abstract class Figura {
	protected Color color;
	
	protected int x1,
				y1,
				x2,
				y2;
	
	private boolean relleno;
	
	public Figura(int x1, int y1, int x2, int y2, Color color) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
		this.color=color;
	}
	
	public abstract void pinta(Graphics g);
	
	public void setFinal(int x, int y) {
		this.x2=x;
		this.y2=y;
	}

}
