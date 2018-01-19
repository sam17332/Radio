public class Radio implements RadioI 
{
	private double frecActual;
	private double[] am;
	private double[] fm;
	private boolean estado;
	private boolean amfm; //true es am, false es fm
	private double[] estaciones;
	
	public Radio()
	{
		amfm = false;
		estado = false;
		frecActual = 87.9;
		estaciones = new double[12];
	}

	public String frecAdelante()
	{
		if (amfm)
		{
		    if (frecActual < 1610.0)
		    { 
		    		frecActual = frecActual + 10;
		    }
		    	return (String.format("%.0f", frecActual));
		} 
		else 
		{
		    if((frecActual < 107.9))
		    {
		    		frecActual = frecActual + 0.2;
		    }
		    return (String.format("%.1f", frecActual));
		  } 	
	}
		            
	public String frecAtras()
	{
		if (amfm)
		{
		    if (frecActual > 530.0)
		    {
		    		frecActual = frecActual - 10;
		    }
		    return (String.format("%.0f", frecActual));
		} 
		else 
		{
		     if(frecActual > 87.9)
		     {
		    	 	frecActual = frecActual - 0.2;
		     }
		    return (String.format("%.1f", frecActual));
		  }   
	}
		  
	public boolean prender()
	{
		estado = true;
		//amfm = false; al prender no deberia de cambiar la variable, entonces esto no deberia de estar 
		//frecActual = 530;
		return true;
	}
		            
	public boolean apagar()
	{
		estado = false;
		return false;
	}
		  
	public String cambioFrecuencia()
	{
		amfm = !amfm;
		if(amfm == true)
		{
			frecActual = 530.0;
			return("AM");
		} 
		else 
		{
			frecActual = 87.9;
		    return ("FM");
		}
	}

	public void guardarEstacionActual(int pos)
	{
		estaciones[pos-1] = frecActual;
	} 
	public String obtenerEstacion(int pos)
	{
		String estacion = String.format("%.1f",estaciones[pos-1]);
		return estacion;
	} 
	public String mostrarEstacion() 
	{
		return String.format("%.1f",frecActual);
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