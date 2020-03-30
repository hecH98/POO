import java.awt.Color;

public class EjemploMetodoGenerico {
	public static <E> E imprimeArreglo(E[] arreglo) {
		for(int i=0; i<arreglo.length;i++) {
			System.out.print(arreglo[i]+",");
		}
		System.out.println();
		return arreglo[0];
	}
	
	/*public static void imprimeArreglo(double[] arreglo) {
		for(int i=0; i<arreglo.length;i++) {
			System.out.print(arreglo[i]+",");
		}
		System.out.println();
	}
	
	public static void imprimeArreglo(String[] arreglo) {
		for(int i=0; i<arreglo.length;i++) {
			System.out.print(arreglo[i]+",");
		}
		System.out.println();
	}*/
	
	public static void main(String[] args) {
		Integer[] arreglo= {10,20,30,40,50,60,70};
		Integer dato = EjemploMetodoGenerico.imprimeArreglo(arreglo);
		
		Double[] arreglo2= {10.0,20.5,30.1,40.7,50.123,60.98,70.01};
		Double dato2 = EjemploMetodoGenerico.imprimeArreglo(arreglo2);
		
		String[] arreglo3= {"hola","que","tal","como","estas","?"};
		String palabra = EjemploMetodoGenerico.imprimeArreglo(arreglo3);
		
		Bolita[] arreglo4= {new Bolita(10,10,Color.black),new Bolita(20,20,Color.blue)};
		Bolita bol= EjemploMetodoGenerico.imprimeArreglo(arreglo4);
	}
}
