package Clases;



public class Hijo extends Padre implements Tio, Hermano, Madre {

	private String nombre;
	private double billetera;
	private Celular telefono;

	public Hijo(String nombre, Celular telefono, Auto auto){
            super();
            this.nombre = nombre;
            this.apellido = super.apellido;
            this.billetera = 0;
            this.telefono = telefono;
            this.auto = auto;
	}

   

    public double getBilletera() {
        return billetera;
    }

    public void setBilletera(double billetera) {
        this.billetera = billetera;
    }

    public Celular getTelefono() {
        return telefono;
    }

    public void setTelefono(Celular telefono) {
        this.telefono = telefono;
    }

    
        
        
	
	/**
	 * 
	 * @param nombre
	 * @param celular
	 * @param auto
	 */
	

        @Override
	public void bailar(){
            System.out.println("Se bailar como mi madre ♪ ♫ ♪”");
	}

	/**
	 * 
	 * @param money
	 */
        @Override
	public void heredarDinero(double money){
            billetera = billetera + money;
            System.out.println("Tio Lucas te regala estos dolaritos! $" + money);
	}

        @Override
	public void jugarFutbol(){
            System.out.println("Se jugar futbol gracias a mi hermano");
	}

	/**
	 * 
	 * @param auto
	 */
	public void conducirAuto(Auto auto){
            System.out.println("Conduciendo un "+ auto.getModelo() +" de un amigo!");
	}

        @Override
	public int hacerGoles(){
		return 0;
	}

        @Override
	public int jugarLoteria(){
            billetera = FORTUNA;
            System.out.println("Heredaste la Fortuna de "+ FORTUNA + " de tu madre la ROSA!! Ahora tienes "+ billetera + "U$$ !!!");
		return NROSUERTE;
	}

        @Override
	public void cantar(){
            super.cantar();
            System.out.println(" y así canta Juan Carlos");
	}
}//end Hijo