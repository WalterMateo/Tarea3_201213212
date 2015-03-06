import java.util.Scanner;
public class Parimpar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero;
		System.out.print("Ingrese un numero por favor: ");
		numero = s.nextInt();
		if (numero%2==0)
		System.out.println("El numero es par");
		else 
		System.out.println("El numero es impar");
		
	}

}
