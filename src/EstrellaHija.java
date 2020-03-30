import java.awt.Color;
import java.awt.Graphics;

public class EstrellaHija extends Estrella{

	public EstrellaHija(int xi, int y) {
		super(xi, y);
	}
	
	public void pintarEstrella(Graphics g) {
		super.pintaEstrella(g);
		g.setColor(Color.green);
		g.fillRect(this.puntos[7].getX(), this.puntos[7].getY(), this.puntos[5].getX()-this.puntos[7].getX(), this.puntos[5].getX()-this.puntos[7].getX());
	}

}
