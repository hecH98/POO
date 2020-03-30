import javax.swing.JFrame;

public class VentanaDiamante extends JFrame{
	public VentanaDiamante() {
		super("Diamantito");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelDibujaDiamante pd=new PanelDibujaDiamante();
		this.add(pd);
		this.pack();
		this.setVisible(true);
		this.repaint();
	}
	
	public static void main(String[] args) {
		VentanaDiamante vd=new VentanaDiamante();
	}
}
