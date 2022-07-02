package testSel;

public class Ejemplo_Arreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declarar arreglo
		int intArr[];
		
		int [] intArray2;
		
		//Tipos de datos
		byte byteArray;
		float floatArray;
		
		//Declarar un array String
		String [] arr;
	
		//asginar memoria para 5 enteros/datos
		arr = new String[5];
		
		
		// inicializamos el primer elemento del arreglo  / los arreglos siempre empiezan en 0
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		for(int i=0; i < arr.length; i++) {
			System.out.println("El elemento en la posicion "+ i + ": "+ arr[i]);
		}

		//ejemplo de arreglo
		int [] intarraylinea = new int[] {1,2,3,4,5};
		
	}

}
