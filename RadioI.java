/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public interface RadioI {
  public String frecAdelante(); //avanza en la frecuencia actual
  public String frecAtras(); //retrocede en la frecuencia actual
  public boolean prender(); //enciende el radio
  public boolean apagar(); //apaga el radio
  public String cambioFrecuencia(); //cambia entre AM y FM y devuelve si esta en "AM" o "FM"
  //public void guardarEstacionActual(int pos); //guarda la estacion actual en la posicion "pos"
  //public String obtenerEstacion(int pos); //se obtiene la estacion guardada en la posicion "pos"
  //public String mostrarEstacion(); //para obtener la estacion actual
  //public boolean estaPrendido(); //para saber si el radio esta prendido 
  //public String obtenerEstado(); //devuelve "AM" o "FM" 
}
