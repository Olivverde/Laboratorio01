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
package radio;

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
	 * pre:
	 * pos: cambia el estado de la radio. de encendido a apagado y viceversa
	 * @return
	 */
	public void onOff();
	
	/**
	 * pre:
	 * pos: 
	 */
	public void cambiarFrecuencia();
	
	/**
	 * pre:
	 * pos:
	 */
	
	public void avanzar();
	
	/**
	 * 
	 * @param boton
	 */
	public void guardar(int boton);
	
	/**
	 * 
	 * @param boton
	 */
	public void seleccionarEmisora(int boton);
}