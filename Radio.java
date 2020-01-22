import java.util.*;

public class Radio implements InterRadio{

	private String estacionActual = "FM";
	private boolean estado = false;
	private double FM = 87.9;
	private int AM = 530;
	private int[] AMGuardado = new int[12];
	private double[] FMGuardado = new double[12];

	
	//Getter para la estacion actual
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
	//Getter para estado del radio
	public boolean estado() {
		return estado;
	}
	//Funcion de encendido
	public void onOff() {
		if(estado == false) {
			System.out.println("La radio se ha encendido");
			estado = true;
		}else if (estado == true) {
			System.out.println("La radio se ha apagado");
			estado = false;
		}
	}
	//Cambio de frecuencia
	public void cambiarFrecuencia() {
		if (estacionActual.equalsIgnoreCase("FM")) {
			estacionActual = "AM";
			
		}else if (estacionActual.equalsIgnoreCase("AM")) {
			estacionActual = "FM";
		}
	}
	//Avanzar entre emisoras
	public void avanzar() {
		if (estacionActual.equalsIgnoreCase("AM")) {
			if (AM >= 1610) {
				AM = 520;
			}
		AM += 10;
		
		}else if (estacionActual.equalsIgnoreCase("FM")) {
			if (FM >= 107.9) {
				FM = 87.7;
			}
		FM += 0.2;
		}
	}
	public void guardar(int boton) {
		if (estacionActual.equalsIgnoreCase("AM")) {
			try {
				AMGuardado[boton-1] = AM;
			}catch(Exception e) {
				System.out.println("Guardado fuera de rango, intente nuevamente");
			}
			
		}else if (estacionActual.equalsIgnoreCase("FM")) {
			try {
				FMGuardado[boton-1] = FM;
			}catch(Exception e) {
				System.out.println("Guardado fuera de rango, intente nuevamente");
			}
		}
	}
	public void seleccionarEmisora(int boton) {
		if(estacionActual.equalsIgnoreCase("AM")) {
			try {
				AM = AMGuardado[boton-1];
				estacionActual = "AM";
					
			}catch (Exception e) {
				System.out.println("Busqueda fuera de rango, intente nuevamente");
			}
			
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
