package ejemplo;

/**
*Clase de ejemplo para demo Gradle en SG
*@author HMrles
*/
public class HolaJava{
	
	/*
	*Devuelve un saludo a la persona que se identifique.
	*@param quien La pesona a quien hay que saludar
	*@return Una cadena a la persona indicada.
	*/
	public String saluda(String quien){
		return String.format("Hola, %s!(en Java)", quien);
	}
}