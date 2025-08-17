package practica1;

import java.util.Scanner;

public class GestionPersonaje {

	public static Personaje[] personajes = new Personaje[10];

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

	public static void agregarPersonaje() {    //metodo se define como() {} 

		System.out.println("estamos en agregar personaje");

		String nombrepersonaje = "";

		String armadelpersonaje = "";

		String habilidadesdelpersonaje = "";

		int niveldepoder = 0;

		Scanner t = new Scanner(System.in);

		System.out.println("Ingrese nombre del personaje");

		nombrepersonaje = t.nextLine();

		System.out.println("Ingrese arma del personaje");

		armadelpersonaje = t.nextLine();

		Scanner scanner = new Scanner(System.in);

		String[] habilidades = new String[5];

		for (int i = 0; i < habilidades.length; i++) {

			System.out.println("Ingreseablidad" );

			habilidades[i] = scanner.nextLine();

		}

		System.out.println("Ingrese el nivel de poder");

		niveldepoder = t.nextInt();

		if (niveldepoder <= 0)
			System.out.println("Nivel de poder no permitido");
		else if (niveldepoder > 100)
			System.out.println("Nivel de poder no permitido");

		System.out.println("Se ha ingresado el personaje con la siguiente informacion");

		System.out.println("Nombre: " + nombrepersonaje);

		System.out.println("Arma: " + armadelpersonaje);

		System.out.println("Habilidades");
		for (int i = 0; i < habilidades.length; i++) {
			System.out.println(habilidades[i]);
		}

		System.out.println("Nivel de poder: " + niveldepoder);

		Personaje nuevoPersonaje = new Personaje();

		nuevoPersonaje.nombre = nombrepersonaje;
		nuevoPersonaje.arma = armadelpersonaje;
		nuevoPersonaje.habilidades = habilidades;
		nuevoPersonaje.nivelDePoder = niveldepoder;

		for (int i = 0; i < personajes.length; i++) {

			if (personajes[i] == null) { // == es para comparar y nuell es cuando no hay nada adentro

				personajes[i] = nuevoPersonaje; // if:si osea es una condicional
				break;

			}
		}

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

		for (int i=3; i>0; i--) {

			if (personajes[3] != null) {

				System.out.println("personaje: " + (i +1));

				System.out.println("Nombre: " + personajes[3].nombre);
				System.out.println("Arma: " + personajes[2].arma);
				System.out.println("habilidades: " + personajes[1].habilidades);
				System.out.println("poder: " + personajes[0].nivelDePoder);

			}
		}

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
