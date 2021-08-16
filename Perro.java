/******************************************************************
persona.java
Autor: Sofía Escobar
Última modificación: 16-08-2021

Objeto perro.
******************************************************************/
import java.util.Random;
import java.util.Scanner;

class perro{

	private Random rand;
	public String raza;
	public String color;
	public String size;
	public String name;
	public String numero;
	
	// Clase perro
	public perro(){
		Scanner scan = new Scanner(System.in);
		rand = new Random();
		//Colocar las preguntas para describir al perro y hacer los anuncios
		System.out.println("Comencemos con algunas preguntas sobre tu perro: ");
		System.out.println("\n¿Cual es la raza de tu perro?");
		raza = scan.nextLine();
		System.out.println("¿De que color es su perro?");
		color  = scan.nextLine();
		System.out.println("¿Que complextura tiene su perro?");
		size = scan.nextLine();
		System.out.println("¿Cual es el nombre de su perro?");
		name = scan.nextLine();
		System.out.println("¿A que numero desea que lo contacten?");
		numero = scan.nextLine();
	}
	
	// Propiedades del perro
	public void setperro(){
		nuevo_perro();
	} 
	
	// Crear al perro	
	private void nuevo_perro(){
		rand = new Random();
		Scanner scan = new Scanner(System.in);
		rand = new Random();
		//Colocar las preguntas para describir al nuevo perro y para los anuncios
		System.out.println("Comencemos con algunas preguntas sobre tu perro: ");
		System.out.println("\n¿Cual es la raza de tu perro?");
		raza = scan.nextLine();
		System.out.println("¿De que color es su perro?");
		color  = scan.nextLine();
		System.out.println("¿Que complextura tiene su perro?");
		size = scan.nextLine();
		System.out.println("¿Cual es el nombre de su perro?");
		name = scan.nextLine();
		System.out.println("¿A que numero desea que lo contacten?");
		numero = scan.nextLine();
	}
	
	//Cartel del perro
	public void cartelperro(){
		System.out.println("");
		System.out.println("El anuncio que deseas imprimir es: ");
		System.out.println("");
		System.out.println("Se busca un pero de raza: " + raza);
		System.out.println("Es de color: " + color);
		System.out.println("Tiene un tamaño: " + size);
		System.out.println("Responde al nombre de:" + name);
		System.out.println("Si lo encuentra porfavor llamar al:" + numero);
		System.out.println("HAY RECOMPENZA");
	}
}