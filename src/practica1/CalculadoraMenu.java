package practica1;

import java.util.Scanner;

public class CalculadoraMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner leer=new Scanner(System.in);
		
		int seleccion_de_operacion=0;
		int A =0;
		int B =0;
		int resultado =0;
		
		do {
			
			System.out.println("\n");
			System.out.println("SELECCIONE UN NUMERO DE OPERCION A REALIZAR:");
			System.out.println("1. -SUMA ");
			System.out.println("2. -RESTA");
			System.out.println("3. -MULTIPLICACION");
			System.out.println("4. -DIVIDIR");
			System.out.println("5. -POTENCIA");
			System.out.println("6. -RAIZ");
			System.out.println("7. -SALIR");
			seleccion_de_operacion= leer.nextInt();
			
			if(seleccion_de_operacion !=7) {
			
				System.out.print("Inserte primer numero");
				
				A = leer.nextInt();
				System.out.println("Inserte segundo numero");
				B = leer.nextInt();
				
				
			}
				
			switch(seleccion_de_operacion) {
			case 1:
				seleccion_de_operacion =1;
				resultado = A + B;
				System.out.println("El resultado de la suma: " + resultado);
				break;
				
			case 2:
				seleccion_de_operacion = 2;
				resultado= A - B;
				System.out.println("El resultado de la resta: " + resultado);
				break;
				
			case 3:
				seleccion_de_operacion = 3;
				resultado = A * B;
				System.out.println("El resultado de la multiplicacion: " + resultado);
				break;
				
			case 4:
				seleccion_de_operacion = 4;
				resultado = A / B;
				System.out.println("El resultado de la division: " + resultado);
				break;
				
			case 5:
				seleccion_de_operacion = 5;
				resultado = (int) Math.pow(A,B);
				System.out.println("El resultado de la potencia: " + resultado);
				break;
				
			case 6:
				seleccion_de_operacion = 7;
				double raiz= Math.sqrt(A);
				System.out.println("El resultado de la raiz " + A + raiz);
				break;
				
			}
			
			
		}while(seleccion_de_operacion !=7);
		System.out.println("Ah elegido salir de la calculadora");
		
		
		
		
		
	}

}
