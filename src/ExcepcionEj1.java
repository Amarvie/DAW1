import java.util.Scanner;

/**
 * 
 * @author marviead
 *
 */
public class ExcepcionEj1 {

	public void isPar(int a) throws ParException, ImparException{
		
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Indique un número");
		Scanner leer = new Scanner (System.in);
		boolean noPar, noImpar;
		do {
			try {
				noPar = false;
				noImpar = false;
				int num = leer.nextInt();
				isPar(num);
			}
			catch(ParException e) {
				noPar = true;
				System.out.println("El numero introducido no es par");
				leer.nextLine();
			}
			catch(ImparException e) {
				noImpar = true;
				System.out.println("El numero introducido no es impar");
				leer.nextLine();
			}
		}while (!(noPar && noImpar)||(noPar && noImpar));
	}

}
