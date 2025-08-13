package practica1;

import java.util.Scanner;

public class GestionPersonaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("mi primera practica");

		int opcion = 0;

		Scanner teclado = new Scanner(System.in);

		while (opcion < 9) {
			System.out.println("1. AGREGAR PERSONAJE");

			System.out.println("2. MODIFICAR PERSONAJE");

			System.out.println("3. ELIMINAR PERSONAJE");

			System.out.println("4. VER DATOS DE UN PERSONAJE");

			System.out.println("5. VER LISTADO DE PERSONAJE");

			System.out.println("6. REALIZAR PELEA ENTRE PRESONAJES");

			System.out.println("7. VER HISTORIAL DE PELEAS ");

			System.out.println("8. VER DATOS DE ESTUDIANTE");

			System.out.println("9.SALIR");

			opcion = teclado.nextInt(); // declarar las funciones

			switch (opcion) {
			case 1:
				agregarPersonaje();
				break;

			case 2:
				modificarPersonaje();
				break;

			case 3:
				eliminarPersonaje();
				break;

			case 4:
				verDatosDeUnPersonaje();
				break;

			case 5:
				verListadoDePersonajes();
				break;

			case 6:
				realizarPeleaEntrePersonajes();
				break;

			case 7:
				verHistorialDePeleas();
				break;

			case 8:
				verDatosDeEstudiante();
				break;

			}

		}

	}

	public static void agregarPersonaje() {
		
		System.out.println("estamos en agregar personaje");
		
		int a, b, c = 0;

		String nombrepersonaje = "";
		
		String armadelpersonaje="";
		
		String habilidadesdelpersonaje="";
		
		int niveldepoder=0;

		Scanner t = new Scanner(System.in);

		System.out.println("Ingrese nombre del personaje");

		nombrepersonaje = t.nextLine();

		System.out.println("Ingrese arma del personaje");
		
		armadelpersonaje= t.nextLine();
		
		System.out.println("Ingrese habilidad del personaje");
		
		habilidadesdelpersonaje= t.nextLine();
		
		
		System.out.println("Ingrese el nivel de poder");
		
		niveldepoder= t.nextInt();
		
		System.out.println("Se ha ingresado el personaje con la siguiente informacion");
		
		
		System.out.println("Nombre: " + nombrepersonaje );
		
		System.out.println("Arma: " + armadelpersonaje);
		
		System.out.println("Habilidades:" + habilidadesdelpersonaje );
		
		System.out.println("Nivel de poder: " + niveldepoder );
		
		
		
		
		
		
		
		
		
		
	

	}

	public static void modificarPersonaje()
	
	

	{

		System.out.println("estamos en modificar personaje");
	}

	public static void eliminarPersonaje()

	{
		System.out.println("estamos en eliminar personajre");

	}

	public static void verDatosDeUnPersonaje()

	{
		System.out.println("estamos en datos del personaje");

	}

	public static void verListadoDePersonajes()

	{
		System.out.println("estamos en listado de personajes");

	}

	public static void realizarPeleaEntrePersonajes()

	{
		System.out.println("estamos en peleas entre personajes");

	}

	public static void verHistorialDePeleas()

	{
		System.out.println("estamos en historial de las peleas ");

	}

	public static void verDatosDeEstudiante()

	{
		System.out.println("Estudiante");
		System.out.println("Nombre: Lorena Abigail Arrecis Martinez");
		
		System.out.println("Carnet: 202112134");

	}

}
