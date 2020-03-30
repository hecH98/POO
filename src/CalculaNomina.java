import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CalculaNomina {
	
	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("horasTrabajadas.txt"));
			PrintWriter pw=new PrintWriter(new FileWriter("PagoNomina.csv"));
			String linea;
			String nombre,
				   paterno;
			int hrs;
			double tabulador;
			StringTokenizer st;
			br.readLine();
			pw.println("Nombre completo,Pago");
			
			while((linea= br.readLine())!=null) {
				st=new StringTokenizer(linea);
				nombre=st.nextToken();
				paterno=st.nextToken();
				hrs=Integer.parseInt(st.nextToken());
				tabulador=Double.parseDouble(st.nextToken());
				pw.println(nombre+" "+paterno+","+tabulador*hrs);
			}
			br.close();
			pw.close();
			System.out.println("Fin");
		}
		catch(FileNotFoundException e) {
			System.out.println("No existe el archivo");
		}
		catch(IOException e) {
			System.out.println("");
		}
	}
}
