package ExemploEstrutura;

public class ExemploVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numeros = new int[3];

numeros[0] = 2;
numeros[1] = 4;
numeros[2] = 3;
for(int i = 0; numeros.length >i; i++) {
	
	System.out.println(numeros[i]);
}

int[][] bidimensional = new int[3][3];
bidimensional[0][0] = 10;
bidimensional[2][2] = 100;
System.out.println("Bidimensional");
for(int i = 0; i < 3;i++) {
	for(int j = 0; j < 3; j++) {
		System.out.print(bidimensional[i][j] + " ");
	}
	System.out.println(" ");
	
}




//int[][][] tridimensional = new int[3][3][3];
//int[][][][] tetradimensional = new int[3][3] [3][3];




























	}

}
