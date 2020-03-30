import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelControlesEstrella extends JPanel implements ActionListener{
	private PanelDibujoEstrella pde;
	private TextField tfXi,
					  tfY,
					  tfXf,
					  tfRutaAbrir,
					  tfRutaGuardar;
	
	public PanelControlesEstrella(PanelDibujoEstrella pde) {
		super();
		this.pde=pde;
		this.setPreferredSize(new Dimension(200, 600));
		this.setBackground(Color.magenta);
		this.add(new JLabel("Xi"));
		this.tfXi=new TextField(20);
		this.add(this.tfXi);
		this.add(new JLabel("Y"));
		this.tfY=new TextField(20);
		this.add(this.tfY);
		this.add(new JLabel("Xf"));
		this.tfXf=new TextField(20);
		this.add(this.tfXf);
		this.add(new JLabel("Abrir"));
		this.tfRutaAbrir=new TextField(20);
		this.add(this.tfRutaAbrir);
		this.add(new JLabel("Guardar"));
		this.tfRutaGuardar=new TextField(20);
		this.add(this.tfRutaGuardar);
		this.tfXf.addActionListener(this);
		this.tfRutaAbrir.addActionListener(this);
		this.tfRutaGuardar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==this.tfXf) {
			this.pde.setEstrellita(Integer.parseInt(this.tfXi.getText()),Integer.parseInt(this.tfY.getText()));
			this.pde.getEstrellita().setXf(Integer.parseInt(this.tfXf.getText()));;
			
			this.repaint();
		}
		else if(e.getSource()==this.tfRutaAbrir) {
			try {
				String linea;
				BufferedReader br=new BufferedReader(new FileReader(this.tfRutaAbrir.getText()));
				linea=br.readLine();
				this.tfXi.setText(linea);
				linea=br.readLine();
				this.tfY.setText(linea);
				linea=br.readLine();
				this.tfXf.setText(linea);
				
			}
			catch(IOException ex) {
				System.out.println("No se encuentra el archivo");
			}
		}
		else if(e.getSource()==this.tfRutaGuardar) {
			try {
				PrintWriter pw= new PrintWriter(new FileWriter(this.tfRutaGuardar.getText()));
				pw.println(this.tfXi.getText());
				pw.println(this.tfY.getText());
				pw.println(this.tfXf.getText());
				pw.close();
			}
			catch(IOException ex) {
				System.out.println("No se puede escribir el archivo");
			}
		}
		
	}
}
