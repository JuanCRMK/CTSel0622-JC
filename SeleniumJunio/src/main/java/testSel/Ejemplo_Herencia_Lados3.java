package testSel;

public class Ejemplo_Herencia_Lados3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejemplo_Herencia_Triangulo t1 = new Ejemplo_Herencia_Triangulo();
		
		//Se puede acceder a "base" desde t1 por que es una subclase de la clase dosDimensiones
		t1.altura = 4.0;
		t1.base = 4.0;
		t1.estilo = "Estilo 1";
		
		System.out.println("Informacion para t1");
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("Su area es: " + t1.area());
		
		
		System.out.println();
		
		Ejemplo_Herencia_Triangulo t2 = new Ejemplo_Herencia_Triangulo();
		
		//Se puede acceder a "base" desde t1 por que es una subclase de la clase dosDimensiones
		t2.altura = 8.0;
		t2.base = 12.0;
		t2.estilo = "Estilo 2";
		
		System.out.println("Informacion para t2");
		t2.mostrarEstilo();
		t2.mostrarDimension();
		System.out.println("Su area es: " + t2.area());

	}

}
