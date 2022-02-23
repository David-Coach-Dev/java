package ClasesOperadores;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cuadrado
		int ladoCuadrado = 8;
		System.out.println("El cuadrado con un lado de " + ladoCuadrado);
		System.out.println("El area es : "+ (ladoCuadrado*ladoCuadrado));
		System.out.println("El perimetro es :" + (ladoCuadrado*4));
		//triangulo
		int baseTriangulo = 9;
		int alturaTrinagulo = 8;
		int ladoUnoTriangulo = 8;
		int ladodosTriangulo = 8;
		System.out.println("El triangulo con base de " + baseTriangulo);
		System.out.println("y una altura de " + alturaTrinagulo);
		System.out.println("y el lado uno de " + ladoUnoTriangulo);
		System.out.println("y el lado dos de " + ladodosTriangulo);
		System.out.println("El area es :"+((baseTriangulo*alturaTrinagulo)/2));
		System.out.println("El perimetro es :" +(baseTriangulo+ladoUnoTriangulo+ladodosTriangulo));
		//rectangulo
		int baseRectangulo = 8;
		int alturaRectangulo = 6;
		System.out.println("El rectangulo con la base de " + baseRectangulo);
		System.out.println("y la alrura de " + alturaRectangulo);
		System.out.println("El area es :"+(baseRectangulo*alturaRectangulo));
		System.out.println("El perimetro es :" + (2*(baseRectangulo*alturaRectangulo)));
	}
}
