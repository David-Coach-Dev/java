package ClaseMath;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1=(int)(Math.random()*10);
		double n2=(int)(Math.random()*10);
		double n3=(int)(Math.random()*10);
		double n4=(int)(Math.random()*10);
		double n5=(int)(Math.random()*10);
		double pro=((n1+n2+n3+n4+n5/5));
		
		System.out.println("La nota 1 es " + n1);
		System.out.println("La nota 2 es " + n2);
		System.out.println("La nota 3 es " + n3);
		System.out.println("La nota 4 es " + n4);
		System.out.println("La nota 5 es " + n5);
		System.out.println("El promedio es " + pro);
	}
}
