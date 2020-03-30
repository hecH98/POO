import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

//Hector Humberto Herrera Macias
//A01632115

public class DianaNumerada extends Diana {
	public DianaNumerada(int xPos, int yPos) {
		super(xPos, yPos);
	}
	
	public void pintarFiguras(Graphics g) {
		super.pintaFigura(g);
		
		int distancia=(this.ancho/6)/2;
		g.setFont(new Font("comic Sans",Font.ITALIC, this.ancho/12));
		
		g.setColor(Color.black);
		g.drawString("6", this.xPos+distancia, this.yPos+(this.ancho/2));
		g.drawString("8", this.xPos+(distancia*3), this.yPos+(this.ancho/2));
		g.drawString("6", this.xPos+(distancia*10), this.yPos+(this.ancho/2));	
		g.drawString("8", this.xPos+(distancia*8), this.yPos+(this.ancho/2));
		g.drawString("6", this.xPos+(this.ancho/2), this.yPos+(distancia*2));
		g.drawString("8", this.xPos+(this.ancho/2), this.yPos+(distancia*4));
		g.drawString("6", this.xPos+(this.ancho/2), this.yPos+(distancia*11));
		g.drawString("8", this.xPos+(this.ancho/2), this.yPos+(distancia*9));
		g.drawString("10", this.xPos+(distancia*5), this.yPos+(distancia*6));
		
		
		g.setColor(Color.white);
		g.drawString("5", this.xPos, this.yPos+(this.ancho/2));
		g.drawString("7", this.xPos+(distancia*2), this.yPos+(this.ancho/2));
		g.drawString("9", this.xPos+(distancia*4), this.yPos+(this.ancho/2));
		g.drawString("5", this.xPos+(distancia*11), this.yPos+(this.ancho/2));
		g.drawString("7", this.xPos+(distancia*9), this.yPos+(this.ancho/2));
		g.drawString("9", this.xPos+(distancia*7), this.yPos+(this.ancho/2));
		g.drawString("5", this.xPos+(this.ancho/2), this.yPos+distancia);
		g.drawString("7", this.xPos+(this.ancho/2), this.yPos+(distancia*3));
		g.drawString("9", this.xPos+(this.ancho/2), this.yPos+(distancia*5));
		g.drawString("5", this.xPos+(this.ancho/2), this.yPos+(distancia*12));
		g.drawString("7", this.xPos+(this.ancho/2), this.yPos+(distancia*10));
		g.drawString("9", this.xPos+(this.ancho/2), this.yPos+(distancia*8));
		
	}
	
	
}
