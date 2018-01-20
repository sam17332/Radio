/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
/**
 * @author Rodrigo Samayoa 17332
 * @author Miguel Valle 17102
 * @version 19.01.2018
 * Clase que implementa la interfaz de RadioI, donde se encuentran los metodos que imitan una radio 
 */
public class Radio implements RadioI {
/**
 * atributo donde se almacena la frecuencia actual
 */
private double frecActual;
/**
 * array donde se guardan las estaciones guardadas en cada boton para AM
 */
private double[] am = new double[12];
/**
 * array donde se guardan las estaciones guardadas en cada boton para FM
 */
private double[] fm = new double[12];
/**
 * indica si el radio está encendido o apagado
 */
private boolean estado;
/**
 * indica si el radio está en AM o FM
 */
private boolean amfm; //true es am, false es fm
/**
 * Constructor
 */
public void Radio(){
amfm = false;
estado = false;
frecActual = 87.9;

}
/**
 * Metodo que avanza a la siguiente estación de radio de acuerdo
 * a si se encuentra en AM o FM
 * @return devuelve la frecuencia a la que ha cambiado
 */
  public String frecAdelante(){
  if (amfm){
    if (frecActual < 1610.0){ 
    frecActual = frecActual + 10;
    }
    return (String.format("%.0f", frecActual));
  } else {
    if((frecActual < 107.9)){
    frecActual = frecActual + 0.2;
    }
    return (String.format("%.1f", frecActual));
  } 
    
  }
/**
 * Metodo que retrocede a la estación anterior de radio de acuerdo
 * a si se encuentra en AM o FM
 * @return devuelve la frecuencia a la que ha cambiado
 */            
  public String frecAtras(){
  if (amfm){
    if (frecActual > 530.0){
    frecActual = frecActual - 10;
    }
    return (String.format("%.0f", frecActual));
  } else {
     if(frecActual > 87.9){
    frecActual = frecActual - 0.2;
     }
    return (String.format("%.1f", frecActual));
  } 
    
  }
  /**
 * Metodo que enciende el radio
 * @return devuelve true indicando que esta encendido
 */
  public boolean prender(){
      estado = true;
      amfm = false;
      frecActual = 87.9;
    return true;
  }
/**
 * Metodo que apaga el radio
 * @return devuelve false indicando que esta apagado
 */            
  public boolean apagar(){
      estado = false;
    return false;
  }
 
  /**
 * Metodo que cambia a AM o FM
 * @return devuelve en texto AM o FM, dependiendo a la cual ha cambiado
 */
  public String cambioFrecuencia(){
      amfm = !amfm;
      if(amfm == true){
          frecActual = 530.0;
          return("AM");
      } else {
          frecActual = 87.9;
          return ("FM");
      }
  }
  
  /**
 * Metodo que guarda una estacion en un array
 * @param pos es el numero del boton donde se guarda
 */
  public void guardarEstacionActual(int pos)
	{
                if (amfm){
                    am[pos-1] = frecActual;
                } else{
                    fm[pos-1] = frecActual;
                }
	} 
  
  /**
 * Metodo que obtiene la estacion almacenada en un botón 
 * @param pos es el numero del boton donde se guarda
 * @return devuelve la estacion que esta almacenada
 */
	public String obtenerEstacion(int pos)
	{   
                if (amfm){
		String estacion = String.format("%.0f",am[pos-1]);
                return estacion;
                } else{
                String estacion = String.format("%.1f",fm[pos-1]);
                return estacion;
                }
		
	} 
        
        /**
 * Metodo que devuelve la estación actual donde está la ardio 
 * @return devuelve la estación en la que está la radio
 */
	public String mostrarEstacion() 
	{
                if (amfm){
		return String.format("%.0f",frecActual);
                } else {
                return String.format("%.1f",frecActual);   
                }
	}
        
        /**
 * Metodo que devuelve el estado del radio
 * @return devuelve si esta encedido o apagado
 */
	public boolean estaPrendido() 
	{
		return estado;
	}
        
          /**
 * Metodo que devuelve si el radio esta en AM o FM
 * @return devuelve si esta en AM o FM
 */
	public String obtenerEstado() 
	{
		String state = "";
		if (amfm == false) 
		{
			state = "FM";
		}
		else if(amfm == true) 
		{
			state = "AM";
		}
		return state;
	}
    }


