package org.mockito;

// TODO: Auto-generated Javadoc
/**
 * The Class Apple Bean
 */
public class Apple {
	
	/** The name. */
	private String name ;
	
	/** The type. */
	private String type;
	
	/** The source. */
	private String source;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the source.
	 *
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * Sets the source.
	 *
	 * @param source the new source
	 */
	public void setSource(String source) {
		this.source = source;
	}
	
	/**
	 * To json.
	 *
	 * @return the string
	 */
	public String toJson (){
		
		return this.getName() + this.getSource() + this.getType();
	}

}
