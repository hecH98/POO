import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploEscritura {
	
	public static void main(String[] args) {
		try {
		PrintWriter pw= new PrintWriter(new FileWriter("salida.txt"));
		for(int i=0;i<100;i++) {
			pw.println(i+1);
		}
		
		pw.println("Este es mi primer archivo de texto escrito desde java");
		pw.println("Esta muy facil de hacer");
		pw.println("no tengo dudas!!");
		
		pw.flush();  //guarda los datos escritos hasta el momento pero sin cerrar el archivo
		
		pw.println("otra cosita mas");
		pw.close();  //cierra el archivo y guarda los datos escritos hasta el momento
		}
		catch(IOException e) {
			System.out.println("No se puede escribir en el archivo");
		}
	}

}
