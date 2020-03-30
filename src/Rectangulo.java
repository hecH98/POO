import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo extends Figura{
	
	public boolean relleno;

	public Rectangulo(int x1, int y1, Color color) {
		super(x1, y1,0,0, color);
		this.relleno=false;
	}
	
	//Setter
	public void setColor(Color color) {
		this.color=color;
	}

	public void pinta(Graphics g) {
		g.setColor(this.color);
		if(this.relleno) {
			g.fillRect(this.x1, this.y1, this.x2-this.x1, this.y2-this.y1);
		}
		else {
			g.fillRect(this.x1, this.y1, this.x2-this.x1, this.y2-this.y1);
		}
	}
	
	public String toString() {
		return "Rectangulo,"+this.x1+","+this.y1+","+this.x2+","+this.y2+","+this.color.getRed()+","+this.color.getGreen()+","+this.color.getBlue();
	}

}
