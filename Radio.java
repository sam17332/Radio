public class Radio implements RadioI {

private float frecActual;
private float[] am;
private float[] fm;
private boolean estado;
private boolean amfm; //true es am, false es fm

public void Radio(){

}

  public String frecAdelante(){
  if (amfm && (frecActual < 1610.0)){
    frecActual = frecActual + 10;
    return (Float.toString(frecActual.0f);
  } else if(!amfm && (frecActual > 107.9){
    frecActual = frecActual + 0.2;
    return (Float.toString(frecActual.1f);
  }
    
  }
            
  public String frecAtras(){
  if (amfm && (frecActual > 530.0)){
    frecActual = frecActual - 10;
    return (Float.toString(frecActual.0f);
  } else if(!amfm && (frecActual > 87.9){
    frecActual = frecActual - 0.2;
    return (Float.toString(frecActual.1f);
  }  
  }
  
}
