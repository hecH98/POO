//Hector Humberto Herrera Macias
//a01632115


import javax.swing.JOptionPane;

public class Division {
	public static int divEntera(int numerador, int denominador) {
		return numerador/denominador;
	}
	
	//Manejar las excepciones NumberFormatException y ArithmeticException
	//Si ocurre una excepcion volver a pedir todos los datos
	
	public static void main(String[] args) {
		while(true) {
			try {
				int num=Integer.parseInt(JOptionPane.showInputDialog("Escribe el numerador"));
				int den=Integer.parseInt(JOptionPane.showInputDialog("Escribe el denominador"));
				int res=divEntera(num, den);
				
				System.out.println("El resultado de "+num+"/"+den+" es: "+res);
				
				break;
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "No ingrese letras, solo numeros");
				continue;
			}	
			catch(ArithmeticException r) {
				JOptionPane.showMessageDialog(null, "No ingrese 0 en el denominador");
				continue;
			}
		}
	}
}
