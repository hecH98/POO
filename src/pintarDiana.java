import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pintarDiana extends JFrame{
	public pintarDiana() {
		super("Pintando Diana");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		probarDiana dn=new probarDiana();
		this.add(dn);
		this.add(new ControlDiana(), BorderLayout.WEST);
		
		this.pack();
		this.setVisible(true);
		this.repaint();
	}
	
	public static void main(String[] args) {				
		pintarDiana pintar=new pintarDiana();
	}
	
}

class probarDiana extends JPanel{
	private Diana[] dn;

	
	private DianaNumerada dm;
	
	public probarDiana() {
		super();
		this.setPreferredSize(new Dimension(1500,950));
		this.dn=new Diana[3];
		this.dn[0]=new Diana(0,0);
		this.dn[0].setColor(Color.blue);
		this.dn[0].setAncho(600);
		
		this.dn[1]=new Diana(250,620);
		this.dn[1].setColor(Color.green);
		this.dn[1].setAncho(200);
		
		this.dn[2]=new Diana(800,200);
		this.dn[2].setColor(Color.magenta);
		this.dn[2].setAncho(350);
		
		this.dm=new DianaNumerada(1000, 600);
		this.dm.setColor(Color.magenta);
		this.dm.setAncho(350);
		
		
		
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		this.dn[0].pintaFigura(g);
		this.dn[1].pintaFigura(g);
		this.dn[2].pintaFigura(g);
		
		this.dm.pintarFiguras(g);
		
		
		
		
	}
}

class ControlDiana extends JPanel{
	private probarDiana pd;
	public ControlDiana() {
		super();
		//this.pd=pd;
		this.setPreferredSize(new Dimension(200,950));
		this.setBackground(Color.gray);
		
	}
}



