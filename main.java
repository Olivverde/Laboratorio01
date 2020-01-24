/**************************************************************
 * main.java						Fecha de creacion: 17/01/2020
 * 
 * Clase para interactuar con el usuario
 * importa paquete java.util
 * 
 * @author Oliver de Leon 19270
 * @author Diego Alvarez 19498
 * @version 22/01/2020
 *************************************************************/


//Se importa paquetes JAVA
import java.util.*;

public class main {
	public static void main(String args[]) {
		
		//Se llama al Scaner y el controlador
		Scanner scan = new Scanner(System.in);
		RadioInterface radio = new Radio();
		
		int optionA = 0;
		//Se mantendra encendido el radio mientras no escoga
		//la opcion 2 del menu inicial
		while(optionA != 2) {
			
			//Menu inicial (A)
			System.out.println("Bienvenido a My First Radio");
			System.out.println("1) Si?");
			System.out.println("2) salir");
			
			String A = scan.nextLine();
			
			//Si el usuario decide activar el radio
			if (A.equalsIgnoreCase("1")) {
				
				radio.onOff(); //Enciende el radio
				int optionB = 0;
				//Mientras el radio este encendido, seguira
				//en el menu interno (B)
				while(optionB != 1) { 

					//Menu interno
					System.out.println("Ingrese una opcion:");
					System.out.println();
					System.out.println("1) Apagar Radio");
					System.out.println("2) Señal FM/AM");
					System.out.println("3) Avanzar");
					System.out.println("4) Guardar emisora");
					System.out.println("5) Seleccionar emisora guardada");
					
					//Pide opcion al usuario
					String B = scan.nextLine();
					
					//Si decide apagar
					if (B.equalsIgnoreCase("1")) {
						radio.onOff();//Apaga radio
						optionB = 1;
						
					//Cambio de frecuencia	
					}else if(B.equalsIgnoreCase("2")) {
						radio.cambiarFrecuencia();
						
					//Avanzar a traves de emisoras
					}else if (B.equalsIgnoreCase("3")) {
						radio.avanzar();
						
					//Guardar emisoras	
					}else if (B.equalsIgnoreCase("4")) {
						System.out.println("Ingrese el apartado en el que quiere guardar:");
						try{
							int boton = scan.nextInt();
							radio.guardar(boton);
							
						}catch(Exception e) {
							System.out.println("Ingrese un valor valido");
						}
						
					//Llamar emisora guardada	
					}else if (B.equalsIgnoreCase("5")) {
						System.out.println("Ingrese el apartado en el que quiere guardar:");
						try{
							int boton= scan.nextInt();
							radio.seleccionarEmisora(boton);
						
						}catch(Exception e) {
							System.out.println("Ingrese un valor valido");
						}
					}
					System.out.println(radio.estacionActual());
				}
			//Salir del programa
			}else if (A.equalsIgnoreCase("2")) {
			
				System.out.println("Vuelva pronto");
				optionA = 2;
			}
		}
	}
}
//Fin del programa
