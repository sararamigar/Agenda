package arraydinamico;

public class arrayContacto implements Comparable 
{
	private String telefono;
	private String nombre;
	
	/**
	 * Contructor de la clase
	 * @param nombre
	 * @param telefono
	 */
	public arrayContacto(String nombre, String telefono) 
	{
		this.nombre = nombre;
		this.telefono = telefono;
	
	}
	/**
	 * Devuelve el dato
	 * @return
	 */
	public String getTelefono() 
	{
		return telefono;
	}

	/**
	 * Modifica el dato
	 * @param telefono
	 */
	public void setTelefono(String telefono) 
	{
		this.telefono = telefono;
	}

	/**
	 * Devuelve el dato
	 * @return
	 */
	public String getNombre() 
	{
		return nombre;
	}

	/**
	 * Modifica el dato
	 * @param telefono
	 */
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	/**
	 * Envia a pantalla el nombre y el telefono del contacto
	 */
	public String toString() 
	{ 
		//este metodo sobrecargado muestra los atributos de la clase
		return this.nombre+" ("+this.telefono+")";
	}
	
	/**
	 * Comprueba si un contacto es igual a otro
	 * @param otro
	 * @return
	 */
	//////////////////////////////////
	public boolean equals(arrayContacto otro) 
	{
		
		return (nombre.equals(otro.nombre) && otro.telefono.equals(telefono)) ;
	}
	
	/**
	 * Comprueba si un objeto es igual a otro
	 * @param otro
	 * @return
	 */
	///////////////////////////////////
	public boolean equals(Object otro) {
		arrayContacto contacto = (arrayContacto) otro; 
		return (nombre.equals(contacto.nombre) && telefono.equals(contacto.telefono));
		
	}
	
	/**
	 * Compara un contacto con otro
	 * @param otro
	 * @return
	 */
	////////////////////////////////////
	public int compareTo(arrayContacto other) {
		
		return this.nombre.compareTo(other.getNombre());
		
	}

	/**
	 * Compara un objeto con otro
	 * @param otro
	 * @return
	 */
	///////////////////////////
	public int compareTo(Object arg0) 
	{
		arrayContacto contacto = (arrayContacto) arg0;
		return (nombre.compareTo(contacto.nombre));
	}
	
	/**
	 * Muestra los datos de los contactos
	 */
	//////////////////////////////
	public void mostrarDatos()
	{
		System.out.println(nombre + " (" + telefono + ")");
	}

}
