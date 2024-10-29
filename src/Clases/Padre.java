package Clases;



public class Padre {

	private String nombre;
	protected String apellido;
	private Casa patrimonio;
	protected Auto auto;

	public Padre(){
            nombre = "Papá";
            apellido = "López";
            patrimonio = construirCasa();
	}

	/**
	 * 
	 * @param auto
	 */
	public Padre(Auto auto){
            nombre = "Papá";
            apellido = "López";
            patrimonio = construirCasa();
            comprarAuto(auto);
	}
        
        
	public Casa construirCasa(){
		return new Casa("Centro. (2)pisos");
	}

	/**
	 * 
	 * @param auto
	 */
	public void comprarAuto(Auto auto){
            this.auto = auto;
	}

	public void cantar(){
            System.out.print("Asi canta tu padre, Don "+ apellido);
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Casa getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Casa patrimonio) {
        this.patrimonio = patrimonio;
    }

    public Auto getAuto() {
        return auto;
    }

        
        
}//end Padre