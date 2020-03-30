import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploLectura {
	

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("entrada.txt"));
			String linea;
			while((linea=br.readLine())!=null){
				System.out.println(linea);
			}
			
			/*
			 * linea=br.readLine();
			 * System.out.println(linea);
			 * linea=br.readLine();
			 * System.out.println(linea);
			 * linea=br.readLine();
			 * System.out.println(linea);
			 */
			
			br.close();
		}
		catch(FileNotFoundException ex) {
		System.out.println("No se encontro el archivo");
		}
		catch(IOException e) {
			System.out.println("No se pudo leer el archivo");
		}
		
		
		
	}

}
