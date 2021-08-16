/******************************************************************
Menu.java
Autor: Sofía Escobar
Última modificación: 16-08-2021

Driver program que implementa el menú de opciones para el simulador
que 
entrenará voluntari@s.
******************************************************************/
import java.util.Scanner;

class Menu{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//Imprimir mensaje de bienvenida para los que usen el programa
		System.out.println("");
		System.out.println("Hola...¿estas buscando a un perro?");
		System.out.println("Nosotros te ayudamos :)");
		System.out.println("");

		// Instanciar las clases	
		perro dog = new perro();
		amigo a = new amigo();
		
		// Mostrar menu 
		int opcion = 0;
		String continuar = "7";
		
		while (continuar == "7"){
		
			System.out.println("\n\n¿Que deseas hacer a continuacion?");
			System.out.println("1. Nuevo amigo");
			System.out.println("2. Nuevo perro");
			System.out.println("3. Llamar a la perrera (gratis)");
			System.out.println("4. Imprimir anuncio para colocar en postes (Q25.00)");
			System.out.println("5. Publicar anuncio en el periodico local (Q125.00)");
			System.out.println("6. Dinero disponible");
			System.out.println("7. Salir\n\n");
			
			opcion = scan.nextInt();
			//Agregar a la persona, el perro y demas interacciones en el juego
			if (opcion == 1){
				a.setamigo();
			} else if (opcion == 2){
				dog.setperro();
			} else if (opcion == 3){
				a.llamarperrera();
			} else if (opcion == 4){
				dog.cartelperro (); //se agrega el anuncio
				a.postes(); //se mira si tiene el dinero suficiente
			} else if (opcion == 5){
				dog.cartelperro (); //se agrega el anuncio
				a.aperiodico(); // se mira si tiene suficiente dinero
			} else if (opcion == 6){
				a.getdinero();
			} else if (opcion == 7){
				System.out.println("Hasta la proxima!");
				System.out.println("");
				continuar = "n";
			} else {
				System.out.println("Solo puede escoger las opciones que aparecen en el menu. Seleccione una opcion colocando un numero del 1 al 7.");
			}
		}
	}
}