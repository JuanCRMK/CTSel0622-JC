package testSel;

public class Ejemplo_Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado = suma(12,3);
		System.out.println(resultado);
		
		
		int resultado2 = suma(2,4,13);
		System.out.println(resultado2);
		
//		int resultado2 = suma(2,3);
//		System.out.println(resultado2);
//		
//		int resultado3 = suma(33,7);
//		System.out.println(resultado3);
//		
//		String car = carro(0);
//		System.out.println(car);

	}
	
	
	public static int suma(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static int suma(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	public static String carro(int a) {
		String [] cars = {"Volvo", "BMV", "Ford"};
		return cars[a];
	}

}
