package personas;

public class PersonaFachada {
		// ATRIBUTOS
	/**
	 * Informacion de la persona
	 */
	private PersonaData data;
	
	
		// CONSTRUCTORES
	public PersonaFachada(PersonaData data) {
		this.data = data;
	}
	
		// GETTERS y SETTERS
	/**
	 * @return the data
	 */
	public PersonaData getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(PersonaData data) {
		this.data = data;
	}
	
}
