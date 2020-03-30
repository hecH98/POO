
public class For {
	public static void main(String[] args) {
		int[] numeros = {10, 30, 48, 525, 1456, 163, 763, 61, 56, 98};
		int total=0;
		int total2=0;
		for(int i=0; i<numeros.length; i++){
			total+=numeros[i];
		}
		System.out.println(total);
		
		System.out.println("\nfor mejorado\n");
		
		for (int d : numeros) {
			total2+=d;
		}
		
		System.out.println(total2);
	}
}
