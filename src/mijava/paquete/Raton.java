package mijava.paquete;

/**
 * @author LuisArquillos
 * @version 1.0.0
 */
public class Raton {
    /**
     * Se crea la edad, el peso y la tasa de crecimiento
     * @param edad - edad del raton
     * @param peso - peso del raton
     * @paran tasaCrecimiento - tasa de crecimiento del ratón
     */
    public int edad;
    public double peso;
    public double tasaCrecimiento;

    /**
     * Metodo vacío
     */
    public Raton(){
    }

    /**
     * Este metodo hace que aumente la edad y el peso dependiendo de la tasa de crecimiento
     */
    public void crecer() {
        this.peso +=(this.peso*this.tasaCrecimiento/100.0);
        this.edad++;
    }

    /**
     * Este metodo devuelve la edad y el peso en un formato String
     * @return edad y peso
     */
    public String datos() {
        return String.format("(%d;%.2f)",this.edad,this.peso);
    }
}
