import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class PanelControl1 extends JPanel implements ActionListener{

	private PanelDibujo p;
	
	private JRadioButton rbElipse,
						 rbRectangulo,
						 rbLinea,
						 rbTxt;
	private Elipse elipse;
	private Rectangulo rectangulo;
	private JCheckBox cbRelleno;
	private JTextField tfTexto;
	private JPanel pColor;
	private JSlider slider;
	private JComboBox cbFuentes,
					  cbSize;
	private String[] fuentes;
	private int[] Size;
	private static  Font[] font;
		/*{new Font("TimesRoman", Font.PLAIN, 12),		//obj 1
								 new Font("serif", Font.PLAIN, 12),				//obj 2
								 new Font("Arial", Font.PLAIN, 12),		//obj 3
								 new Font("Helvetica", Font.PLAIN, 12),		//obj 4
								 new Font("New Times Roman", Font.PLAIN, 12),		//obj 5	
								 new Font("TimesRoman", Font.PLAIN, 12),		//obj 6
								 new Font("TimesRoman", Font.PLAIN, 12),		//obj 7
								 new Font("TimesRoman", Font.PLAIN, 12),		//obj 8
								 new Font("TimesRoman", Font.PLAIN, 12),		//obj 9
								 new Font("TimesRoman", Font.PLAIN, 12)};;		//obj 10*/
	
	public PanelControl1(PanelDibujo p) {
		super();
		this.setLayout(null);
		this.p=p;
		this.setPreferredSize(new Dimension(150,500));
		this.setBackground(Color.gray);
		
		//Radio Buttons
		this.rbElipse=new JRadioButton("Elipse", true);
		this.rbElipse.setBounds(10, 10, 100, 15);
		this.rbRectangulo=new JRadioButton("Rectangulo");
		this.rbRectangulo.setBounds(10, 30, 100, 15);
		this.rbLinea=new JRadioButton("Linea");
		this.rbLinea.setBounds(10, 50, 100, 15);
		this.rbTxt=new JRadioButton("Texto");
		this.rbTxt.setBounds(10, 70, 100, 15);
		ButtonGroup bg=new ButtonGroup();
		bg.add(this.rbElipse);
		bg.add(this.rbRectangulo);
		bg.add(this.rbLinea);
		bg.add(this.rbTxt);
		this.add(this.rbElipse);
		this.add(this.rbRectangulo);
		this.add(this.rbLinea);
		this.add(this.rbTxt);
		
		//CheckBox
		this.cbRelleno=new JCheckBox("Relleno");
		this.cbRelleno.setBounds(10, 90, 100, 15);
		this.cbRelleno.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(cbRelleno.isSelected()) {
					elipse.relleno=true;
					rectangulo.relleno=true;
				}
			}
		});
		this.add(this.cbRelleno);
		
		//Cuadro de Texto
		this.tfTexto=new JTextField(10);
		this.tfTexto.setToolTipText("Escriba un texto");
		this.tfTexto.setBounds(10, 110, 125, 20);
		this.add(this.tfTexto);
		
		//Panel de Color 
		this.pColor=new JPanel();
		this.pColor.setBounds(25, 140, 100, 50);
		this.pColor.setPreferredSize(new Dimension(100,50));
		this.pColor.setBackground(Color.RED);
		this.pColor.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			public void mousePressed(MouseEvent e) {
			}
			public void mouseExited(MouseEvent e) {
			}
			public void mouseEntered(MouseEvent e) {
			}
			public void mouseClicked(MouseEvent e) {
				Color slc=JColorChooser.showDialog(PanelControl1.this.p, "Elige un Color", pColor.getBackground());
				pColor.setBackground(slc);
				//p.setColor(slc);
			}
		});
		this.add(this.pColor);
		
		//Slider
		/*this.slider=new JSlider(JSlider.VERTICAL,8, 24,12);	
		this.slider.setMinorTickSpacing(0);
		this.slider.setMajorTickSpacing(2);
		this.slider.setPaintLabels(true);
		this.slider.setPaintTicks(true);
		this.slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
				}
			});
		this.add(this.slider);*/
		
		//Combo Box Size
		this.cbSize=new JComboBox();
		this.cbSize.setBounds(10, 200, 100, 20);
		this.cbSize.setToolTipText("Tamaño de fuente");
		for(int i=8;i<25;i++) {
			this.cbSize.addItem(i);
		}
		this.add(this.cbSize);
		
	
		//Combo Box Fuentes
		this.fuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();	
		this.cbFuentes=new JComboBox(this.fuentes);
		this.cbFuentes.setBounds(10, 230, 125, 20);
		this.cbFuentes.setToolTipText("Seleccione una fuente");
		this.cbFuentes.setPreferredSize(new Dimension(125,25));
		this.add(this.cbFuentes);
	}
	
	//Getters
	public boolean slcElipse() {
		return this.rbElipse.isSelected();
	}
	
	public boolean slcRectangulo() {
		return this.rbRectangulo.isSelected();
	}
	
	public boolean slcLinea() {
		return this.rbLinea.isSelected();
	}
	
	public boolean slcTexto() {
		return this.rbTxt.isSelected();
	}
	
	public boolean slcRelleno() {
		return this.cbRelleno.isSelected();
	}
	
	public String getTxt() {
		return this.tfTexto.getText();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
	
	}


}