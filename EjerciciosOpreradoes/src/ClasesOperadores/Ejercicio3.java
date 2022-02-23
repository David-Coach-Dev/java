package ClasesOperadores;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroUno = 8;
		int numeroDos = 2;
		int aux = numeroUno;
				System.out.println("Numero una vale : "+ numeroUno);
		System.out.println("Numero dos vale : "+ numeroDos);
		numeroUno=numeroDos;
		numeroDos=aux;
		System.out.println("intercambiamos los valores de las variable.");
		System.out.println("Numero una vale : "+ numeroUno);
		System.out.println("Numero dos vale : "+ numeroDos);
	}
}
