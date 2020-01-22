import java.util.*;

public class main {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		InterRadio radio = new Radio();
		
		int a = 0;
		while(a != 2) {
			
			System.out.println("Bienvenido a My First Radio");
			System.out.println("1) Si?");
			System.out.println("2) salir");
			
			String A = scan.nextLine();
			
			if (A.equalsIgnoreCase("1")) {
				
				radio.onOff();
				int b = 0;
				while(b != 1) {

					System.out.println("Ingrese una opcion:");
					System.out.println();
					System.out.println("1) Apagar Radio");
					System.out.println("2) Señal FM/AM");
					System.out.println("3) Avanzar");
					System.out.println("4) Guardar emisora");
					System.out.println("5) Seleccionar emisora guardada");
					
					String B = scan.nextLine();
					
					if (B.equalsIgnoreCase("1")) {
						radio.onOff();
						b = 1;
						
					}else if(B.equalsIgnoreCase("2")) {
						radio.cambiarFrecuencia();
						
					}else if (B.equalsIgnoreCase("3")) {
						radio.avanzar();
						
					}else if (B.equalsIgnoreCase("4")) {
						System.out.println("Ingrese el apartado en el que quiere guardar:");
						int boton = scan.nextInt();
						radio.guardar(boton);
						
					}else if (B.equalsIgnoreCase("5")) {
						System.out.println("Ingrese el apartado en el que quiere guardar:");
						int boton= scan.nextInt();
						radio.seleccionarEmisora(boton);
					}
					System.out.println(radio.estacionActual());
				}	
			}else if (A.equalsIgnoreCase("2")) {
			
				System.out.println("Vuelva pronto");
				a = 2;
			}
		}
	}
}
		
		
		
		
		