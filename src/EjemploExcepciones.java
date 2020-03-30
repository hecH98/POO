

public class EjemploExcepciones {
	public static void metodoA() throws Exception{
		metodoB();
	}
	
	public static void metodoB() throws Exception{
		metodoC();
	}

	public static void metodoC() throws Exception{
		metodoD();
	}

	public static void metodoD() throws Exception{
		metodoE();
	}

	public static void metodoE() throws Exception {
		// Deberia ir dentro de un if
		
		throw new RuntimeException("Ocurrio una excepcion");
	}
	
	public static void main(String[] args) {
		try {
			metodoA();
		}
		catch(Exception ex) {
			System.out.println("Ocurrio una excepcion");
		}
	}
}
