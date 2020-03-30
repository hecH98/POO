import java.util.ArrayList;
import java.util.Arrays;

public class PruebaWildCard {
	public static double suma(ArrayList<? extends Number> numeros) {
		double res=0;
		for(Number numero:numeros) {
			res+=numero.doubleValue();
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		ArrayList<Number> numeros=new ArrayList<>((Arrays.asList(new Number[] {10,20,30,40,50})));
		System.out.println(PruebaWildCard.suma(numeros));
		
		ArrayList<Integer> numeros2=new ArrayList<>((Arrays.asList(new Integer[] {10,20,30,40,50})));
		System.out.println(PruebaWildCard.suma(numeros2));
		
		ArrayList<Double> numeros3=new ArrayList<>((Arrays.asList(new Double[] {3.5,7.5,10.0})));
		System.out.println(PruebaWildCard.suma(numeros3));
	}
	
}

