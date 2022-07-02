package testSel;

public class Ejemplo_CO_DemoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejemplo_CO_Vehiculo minivan = new Ejemplo_CO_Vehiculo();
		 
		int rango;
		
		//Asignar valores a los campos minivan
		minivan.capacidad = 15;
		minivan.kmh = 20;
		minivan.pasajeros = 9;
		
		//Calcular el rango asumiendo 1 tanque lleno de gasolina
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de: "+ rango + " km");
		
		
		Ejemplo_CO_Vehiculo carro = new Ejemplo_CO_Vehiculo();
		carro.pasajeros = 7;
		System.out.println("Número de pasajero de carro es de: " + carro.pasajeros);

	}

}
