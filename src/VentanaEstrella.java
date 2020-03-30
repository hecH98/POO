import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaEstrella extends JFrame{
	public VentanaEstrella() {
		super("Estrellita donde estas?");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelDibujoEstrella pd=new PanelDibujoEstrella();
		this.add(pd);
		this.add(new PanelControlesEstrella(pd), BorderLayout.WEST);
		this.pack();
		this.setVisible(true);
		this.repaint();
	}
	
	public static void main(String[] args) {
		VentanaEstrella ve=new VentanaEstrella();
	}
}
