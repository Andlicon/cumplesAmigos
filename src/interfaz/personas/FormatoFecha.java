package interfaz.personas;

/**
 * Constante para formatos de fecha
 * 
 * @author Andlicon
 */
public enum FormatoFecha {
		//CONSTANTES
	YYYYMMDD("[0-9]{4}[-/][0-9]{2}[-/][0-9]{2}");
	
	
		//ATRIBUTOS
	private String regex;
	
	 
		//CONSTRUCTORES
	FormatoFecha(String regex) {
		this.regex = regex;
	}

	
		//METODOS
	/**
	 * @return the regex
	 */
	public String getRegex() {
		return regex;
	}
}
