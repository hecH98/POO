import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Bolita implements Comparable<Bolita>{
	int x,
		y;
	
	int diametro;
	
	Color color;
	
	public Bolita(int x, int y, Color color) {
		this.x=x;
		this.y=y;
		this.color=color;
		Random ran=new Random();
		this.diametro=ran.nextInt(100)+1;
	}
	
	public void pintar(Graphics g) {
		g.setColor(this.color);
		g.drawOval(this.x, this.y, this.diametro, this.diametro);
	}
	
	public String toString() {
		return "Bolita,"+this.x+","+this.y+","+this.color;
	}

	@Override
	public int compareTo(Bolita o) {
		return this.diametro-o.diametro;
	}
}
