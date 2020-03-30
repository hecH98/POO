
public class pruebas {
	
	static class fruta{
		public int ejeX () {
			int x=(int)Math.round(Math.random()*(-2))+2;
			System.out.println("fruta x "+x);
			return x;
		}
		
		public int ejeY (int y) {
			y=(int)Math.round(Math.random()*10);
			System.out.println("fruta y "+y);
			return y;
		}
	}
	
	public static void main(String[] args) {
		fruta frutita=new fruta();
		
		int x1=(int)Math.round(Math.random()*10);
		System.out.println("X1: "+x1);
		
		int x=frutita.ejeX();
		System.out.println("x: "+x);
		
		int y=frutita.ejeY(x1);
		System.out.println("Y: "+y);
		
	}
}
