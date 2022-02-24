package ClaseMath;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v1 =(Math.random()*50);
		double v2 =(Math.random()*50);
		int vr1 = (int)(Math.round(v1));
		int vr2 = (int)(Math.round(v2));
		int vr1c = (int)(Math.ceil(Math.round(v1)));
		int vr2f = (int)(Math.floor(Math.round(v2)));
		int max = (int)Math.max(vr1c, vr2f);
		System.out.println("El numero 1 es " + v1);
		System.out.println("El numero 2 es " + v2);
		System.out.println("El numero 1 redondeado es " + vr1);
		System.out.println("El numero 2 redondeado es " + vr2);
		System.out.println("El numero 1 redondeado con ceil es " + vr1c);
		System.out.println("El numero 2 redondeado con floor es " + vr2f);
		System.out.println("El maxino numero entro  1 y 2 es  " + max);
	}
}
