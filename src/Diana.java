import java.awt.Color;
import java.awt.Graphics;

//Hector Humberto Herrera Macias
//A01632115

public class Diana {
	protected int xPos,
				  yPos;
	
	protected int ancho;
	
	protected Color colorCentro;
	
	public Diana(int xPos, int yPos) {
		this.xPos=xPos;
		this.yPos=yPos;
		this.ancho=200;
		this.colorCentro=Color.red;
	}
	
	public void setAncho(int ancho) {
		this.ancho=ancho;
	}
	
	public void setColor(Color colorCentro) {
		this.colorCentro=colorCentro;
	}
	
	public int getAncho() {
		return ancho;
	}
	
	public Color getColor() {
		return colorCentro;
	}
	
	public void pintaFigura(Graphics g) {
		int distancia=(this.ancho/6)/2;
		g.setColor(Color.black);
		g.fillOval(this.xPos,this.yPos,this.ancho,this.ancho);
		g.setColor(Color.white);
		g.fillOval(this.xPos+(distancia), this.yPos+(distancia), this.ancho*5/6, this.ancho*5/6);
		g.setColor(Color.black);
		g.fillOval(this.xPos+(distancia*2), this.yPos+(distancia*2), this.ancho*4/6, this.ancho*4/6);
		g.setColor(Color.white);
		g.fillOval(this.xPos+(distancia*3), this.yPos+(distancia*3), this.ancho*3/6, this.ancho*3/6);
		g.setColor(Color.black);
		g.fillOval(this.xPos+(distancia*4), this.yPos+(distancia*4), this.ancho*2/6, this.ancho*2/6);
		g.setColor(colorCentro);
		g.fillOval(this.xPos+(distancia*5), this.yPos+(distancia*5), this.ancho/6, this.ancho/6);
		
	}


}
