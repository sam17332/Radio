public class Radio implements RadioI {

private double frecActual;
private double[] am;
private double[] fm;
private boolean estado;
private boolean amfm; //true es am, false es fm

public void Radio(){

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
    return true;
  }
            
  public boolean apagar(){
      estado = false;
    return false;
  }
}
