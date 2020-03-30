import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Ventana extends JFrame{
  public Ventana() {
	  super("Java Paint");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelDibujo p = new PanelDibujo();
		PanelControl1 pd=new PanelControl1(p);
		this.add(pd,BorderLayout.WEST);
		this.add(new PanelControl2(p),BorderLayout.SOUTH);
		p.setPd(pd);
		this.add(p);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ventana a=new Ventana();
	}

}
