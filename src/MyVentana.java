import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class MyVentana extends JFrame {
	public MyVentana() {
		super("Mi ventana en Java");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		MyPanel pd=new MyPanel();
		this.add(pd);
//		this.add(new MyPanelControl(pd),BorderLayout.WEST);
		this.pack();
		this.setVisible(true);
		this.repaint();
	}
	
	public static void main(String[] args) {		
		MyVentana ventana=new MyVentana();
	}

}
