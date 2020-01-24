/*************************************************************
 * Radio.java						Fecha de creacion: 17/01/2020
 * 
 * Indica los metodos que usara la clase radio
 * Es una interfaz
 * 
 * @author Oliver de Leon 19270
 * @author Diego Alvarez 19498
 * @version 22/01/2020
 ************************************************************/


public interface RadioInterface {
	
	/**
	 * 
	 * @return String con informacion del radio
	 */
	public String estacionActual();
	
	/**
	 * 
	 * @return boolean acerca del estado del radio (encendido/apagado)
	 */
	public boolean estado();
	
	/**
	 * pre: comienza apagado
	 * pos: cambia el estado de la radio. de apagado a encendido y viceversa
	 * @return
	 */
	public void onOff();
	
	/**
	 * pre:Tiene una frecuencia pre-establecida
	 * pos:Cambia a la otra frecuencia
	 */
	public void cambiarFrecuencia();
	
	/**
	 * pre:Tiene una estacion pre-establecida
	 * pos:Avanza a otra emisora
	 */
	
	public void avanzar();
	
	/**
	 * pre:sin datos guardados, 12 espacios disponibles
	 * pos:radios almacenadas
	 * @param boton
	 */
	public void guardar(int boton);
	
	/**
	 * pre:
	 * pos:coloca emisora guardada
	 * @param boton
	 */
	public void seleccionarEmisora(int boton);
}
