package Clases;



public class Auto {

	private String patente;
	private String modelo;
	private double combustible = 50;

	public Auto(String patente, String modelo){
                this.patente = patente;
                this.modelo = modelo;
	}

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

	
}//end Auto