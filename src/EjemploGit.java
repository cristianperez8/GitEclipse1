import java.util.Scanner;
public class EjemploGit {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub 
	Scanner sc = new Scanner(System.in);
	int numero1, numero2, resultado;
	System.out.print("Introduce primer número: ");
	numero1 = sc.nextInt();
	System.out.print("Introduce segundo número: ");
	numero2 = sc.nextInt();
	
	resultado = resta(numero1, numero2);
	System.out.println("resta: " + resultado);
	}
	public static int resta(int a, int b) {
		int c;
		c = a - b;
		return c;
		}

	}
