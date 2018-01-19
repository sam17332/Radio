/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Radio implements RadioI {

private double frecActual;
private double[] am = new double[12];
private double[] fm = new double[12];
private boolean estado;
private boolean amfm; //true es am, false es fm

public void Radio(){
amfm = false;
estado = false;
frecActual = 87.9;

}

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
  
  public boolean prender(){
      estado = true;
      amfm = false;
      frecActual = 87.9;
    return true;
  }
            
  public boolean apagar(){
      estado = false;
    return false;
  }
  
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
  public void guardarEstacionActual(int pos)
	{
                if (amfm){
                    am[pos-1] = frecActual;
                } else{
                    fm[pos-1] = frecActual;
                }
	} 
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
	public String mostrarEstacion() 
	{
                if (amfm){
		return String.format("%.0f",frecActual);
                } else {
                return String.format("%.1f",frecActual);   
                }
	}
	public boolean estaPrendido() 
	{
		return estado;
	}
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


