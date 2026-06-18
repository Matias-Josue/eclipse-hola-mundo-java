package ec.edu.puce;

public class Holamundo {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		System.out.println("Hola mundo");

		int edad = 25;
		
		boolean mayorEdad = false;
		
		String nombre = "Matias";
		
		System.out.printf("la edad es:%s y su nombre es %s\n", edad, nombre);

		if (edad >= 18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");

		}
	}

}