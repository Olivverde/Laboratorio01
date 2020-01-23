/*************************************************************
 * Radio.java						Fecha de creacion: 17/01/2020
 * 
 * Controla el estado recurrente del radio
 * Importa paquetes java.util
 * 
 * @author Oliver de Leon 19270
 * @author Diego Alvarez 19498 
 * @version 22/01/2020
 ************************************************************/

package radio;

import java.util.*;

public class Radio implements RadioInterface{

	/**Declaracion de atributos*/
	private String estacionActual = "FM"; 
	private boolean estado = false; 
	private double FM = 87.9;
	private int AM = 530; 
	private int[] AMGuardado = new int[12]; 
	private double[] FMGuardado = new double[12];

	
	/**Implementacion de metodos*/
	
	/**
	 * Metodo que permite obtener los valores actuales de la 
	 * emisora, frecuencia y estaciones guardadas
	 * @return String de estacionActual, Emisora AM o FM y emisoras guardadas
	 * concatenadas
	 */
	public String estacionActual() {
		String a = "";
		if(estacionActual.equalsIgnoreCase("FM")) {
			String b = "";
			
			for(int i = 0; i<12 ;i++) {
				b += FMGuardado[i]+" | ";
			}
			a = "\nEstas sintonizando la emisora "+estacionActual+" - "+FM+"\nGuardadas: "+b;
			
		}else if(estacionActual.equalsIgnoreCase("AM")) {
			String b = "";
			
			for(int i = 0; i<12 ;i++) {
				b += AMGuardado[i]+" | ";
			}
			a = "\nEstas sintonizando la emisora "+estacionActual+" - "+AM+"\nGuardadas: "+b;
		}
		return a;
	}
	
	/**
	 * Metodo para corroborar el estado del radio (encendido o apagado)
	 * @return true (radio encendido) o false (radio apagado)
	 */
	public boolean estado() {
		return estado;
	}
	
	/**
	 * Metodo para encender o apagar el radio
	 * Si esta encendida la apaga y viceversa
	 */
	public void onOff() {
		if(estado == false) {
			System.out.println("La radio se ha encendido");
			estado = true;
			
		}else if (estado == true) {
			System.out.println("La radio se ha apagado");
			estado = false;
		}
	}
	
	/**
	 * Metodo que permite cambiar la frecuencia de la radio
	 * Cambia de AM a FM y viceversa
	 * Al cambiar la frecuencia cambia igualmente la emisora que se esta escuchando
	 */
	public void cambiarFrecuencia() {
		if (estacionActual.equalsIgnoreCase("FM")) {
			estacionActual = "AM";
		
		}else if (estacionActual.equalsIgnoreCase("AM")) {
			estacionActual = "FM";
		}
	}
	/**
	 * Metodo que permite cambiar la emisora de la radio avanzando
	 */
	public void avanzar() {
		
		if (estacionActual.equalsIgnoreCase("AM")) {
			if (AM >= 1610) {
				//Cuando el recorrido de emisoras esta completo regresa a la 
				//emisora inicial. Por lo que pone 10 digitos menos en esta
				//ya que la suma del cambio sigue efectuandose
				AM = 520;
			}
		AM += 10;
		
		}else if (estacionActual.equalsIgnoreCase("FM")) {
			if (FM >= 107.9) {
				//Cuando el recorrido de emisoras esta completo regresa a la 
				//emisora inicial. Por lo que pone 0.2 decimales menos en esta
				//ya que la suma del cambio sigue efectuandose
				FM = 87.7;
			}
		FM += 0.2;
		}
	}
	
	/**
	 * Metodo para guardar una emisora en la lista de preferidos
	 * @param boton. Numero entero que indica la posicion donde se guardara la emisora
	 */
	public void guardar(int boton) {
		//Si se guardara una emisora AM
		if (estacionActual.equalsIgnoreCase("AM")) {
			try {
				AMGuardado[boton-1] = AM;
			}catch(Exception e) {
				System.out.println("Guardado fuera de rango, intente nuevamente");
			}
		
			//Si se guardara una emisora FM
		}else if (estacionActual.equalsIgnoreCase("FM")) {
			try {
				FMGuardado[boton-1] = FM;
			}catch(Exception e) {
				System.out.println("Guardado fuera de rango, intente nuevamente");
			}
		}
	}
	/**
	 * Metodo para acceder a las estaciones guardadas dentro de la lista de preferidas
	 * @param boton. Numero entero que indica la posicion de la que se extraera la estacion
	 */
	public void seleccionarEmisora(int boton) {
		//Si se selecciona una emisora AM
		if(estacionActual.equalsIgnoreCase("AM")) {
			try {
				AM = AMGuardado[boton-1];
				estacionActual = "AM";
					
			}catch (Exception e) {
				System.out.println("Busqueda fuera de rango, intente nuevamente");
			}
		//Si se selecciona una emisora FM
		}else if(estacionActual.equalsIgnoreCase("FM")) {
			try {
				FM = FMGuardado[boton-1];
				estacionActual = "FM";
			}catch(Exception e) {
				System.out.println("Busqueda fuera de rango, intente nuevamente");
			}	
		}
	}
}