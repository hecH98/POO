import java.awt.Color;

public class EjemploClaseGenerica <E extends Comparable<E>>{
	public E min(E[] datos) {
		E menor=datos[0];
		for (int i = 0; i < datos.length; i++) {
			if(datos[i].compareTo(menor)<0) {
				menor=datos[i];
			}
		}
		return menor;
	}

	public static void main(String[] args) {
		EjemploClaseGenerica<Integer> obj1= new EjemploClaseGenerica<>();
		Integer[] arreglo= {10,20,30,40,50,60,70};
		Integer valor1= obj1.min(arreglo);
		System.out.println(valor1);
		
		EjemploClaseGenerica<Double> obj2= new EjemploClaseGenerica<>();
		Double[] arreglo2= {10.0,20.5,30.1,40.7,50.123,60.98,70.01};
		Double valor2= obj2.min(arreglo2);
		System.out.println(valor2);
		
		EjemploClaseGenerica<String> obj3= new EjemploClaseGenerica<>();
		String[] arreglo3= {"hola","que","tal","como","estas","?"};
		String valor3= obj3.min(arreglo3);
		System.out.println(valor3);
		
		EjemploClaseGenerica<Bolita> obj4= new EjemploClaseGenerica<>();
		Bolita[] arreglo4= {new Bolita(10,10,Color.black),new Bolita(20,20,Color.blue)};
		Bolita valor4= obj4.min(arreglo4);
		System.out.println(valor4);
	}

}
