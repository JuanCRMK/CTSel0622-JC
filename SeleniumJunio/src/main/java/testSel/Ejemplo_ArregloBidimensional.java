package testSel;

public class Ejemplo_ArregloBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{2,4,6},{7,8,3}, {5,2,7}};
		
		//imprimir el valor de una posicion
		//System.out.println(arr[2][2]);
		
		//imprimir arreglo 2D
		for(int i=0; i < arr.length;i++) {
			for(int j = 0; j< arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
