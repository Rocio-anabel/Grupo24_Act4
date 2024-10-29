
package Main;

import Clases.Auto;
import Clases.Celular;
import Clases.Hijo;
import Clases.Padre;


public class Grupo24_Act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto cascajo = new Auto("123LATA", "Renault 12");
        Auto ford = new Auto("AE678QZ", "Ford Focus gris");
        Auto autoAmigo = new Auto("999POWR", "Ford Focus");
        Celular celular = new Celular("Claro",15673901,5000);
        
        Padre padre = new Padre(ford);
        System.out.println("Papá me dejo esta casa en zona "+ padre.getPatrimonio().getZona());
        
        Hijo hijo = new Hijo("Juan Carlos", celular, cascajo);
        System.out.println("Papá me dejó este auto: " + hijo.getAuto().getModelo());
        hijo.conducirAuto(autoAmigo);
        hijo.jugarFutbol();
        hijo.bailar();
        System.out.println("SALIO EL NUMERO DE LA SUERTE "+ hijo.jugarLoteria());
        hijo.cantar();
        hijo.heredarDinero(2000);
        System.out.println("Jugando al Futbol, Hoy has hecho "+ hijo.hacerGoles() + " goles");
        
    }
    
}
