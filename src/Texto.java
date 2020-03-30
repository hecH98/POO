import java.awt.Color;
import java.awt.Graphics;

public class Texto extends Figura{

	public Texto(int x1, int y1, int x2, int y2, Color color) {
		super(x1, y1, 0, 0, color);
		
	}
	
	public void pintaTexto(Graphics g) {
		g.setColor(this.color);
		
	}

	@Override
	public void pinta(Graphics g) {
		g.setColor(this.color);
		
		
	}

}
