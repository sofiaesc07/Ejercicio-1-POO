/******************************************************************
amigo.java
Autor: Sofía Escobar
Última modificación: 16-08-2021

Objeto amigo.
******************************************************************/
import java.util.Random;

class amigo{
	private double dinero;
	private double llamar;
	private double periodico;
	private Random rand;
	
	// Clase Persona
	public amigo(){
		rand = new Random();
		dinero = (int)(rand.nextDouble()*999+1); //colocar un numero random para darle dinero
		//Imprimir mensaje para mostrar al amigo con el que se inicia
		System.out.println("");
		System.out.println("Hola! Soy tu primer amigo");
		System.out.println("El dinero en mi cuenta es de: " + dinero);
	}
	
	// Propiedades de la persona 
	public void setamigo(){
		nueva_amigo();
	} 
	
	// Crear a la persona
	private void nueva_amigo(){
		rand = new Random();
		dinero = (int)(rand.nextDouble()*999+1); //colocar un numero random para darle dinero
		System.out.println("");
		System.out.println("Hola! Soy un amigo nuevo.");
		System.out.println("El dinero en tu cuenta es de: " + dinero);
	}
	
	// Dinero del amigo
	public double getdinero(){
		System.out.println("El dinero en tu cuenta es de: " + dinero);
		return dinero;
	}		
	
	//Llamar perrera
	public void llamarperrera(){
		llamar = (int)(rand.nextDouble()*19+1); //colocar un numero random del 1-20 para ver si tiene suerte con esta opcion
		if (llamar < 5){
			System.out.println("");
			System.out.println("Lo lamentamos pero ya se han llevado a su perro");
		}else if (llamar>=5){
			System.out.println("");
			System.out.println("Aqui tenemos a su perro, por favor pase a buscarlo");
		}
	}
	
	//Colocar auncio en el periodico
	public void aperiodico(){
		if (dinero >= 125){ //opciones para ver si tiene suficiente dinero
			dinero = dinero - 125; //restar dinero cada vez que use esta opcion
			System.out.println("");
			System.out.println("El anuncio a sido colocado con exito");
			llamar = (int)(rand.nextDouble()*19+1); //colocar un numero random del 1-20 para ver si tiene suerte con esta opcion
			if (periodico < 15){
				System.out.println("");
				System.out.println("Tu perro no ha sido encontrado, lo siento");
			}else if (periodico>=15){
				System.out.println("Han visto un perro muy parecido al que se está buscando pasa a verlo");
			}
		}
		else if (dinero < 125){ //opciones para ver si tiene suficiente dinero
			System.out.println("");
			System.out.println("No tienes suficiente dinero para colocar este anuncio");
		}
	}
	
		//Colocar auncio en los postes
	public void postes(){
		if (dinero >= 25){ //opciones para ver si tiene suficiente dinero
			dinero = dinero - 25; //restar dinero cada vez que use esta opcion
			System.out.println("");
			System.out.println("El anuncio a sido colocado con exito");
			llamar = (int)(rand.nextDouble()*19+1);//colocar un numero random del 1-20 para ver si tiene suerte con esta opcion
			if (periodico < 10){ 
				System.out.println("");
				System.out.println("Tu perro no ha sido encontrado, lo siento");
			}else if (periodico>=10){ 
				System.out.println("");
				System.out.println("Han visto un perro muy parecido al que se está buscando pasa a verlo");
			}
		}
		else if (dinero < 25){ //opciones para ver si tiene suficiente dinero
			System.out.println("");
			System.out.println("No tienes suficiente dinero para colocar este anuncio");
		}
	}
}