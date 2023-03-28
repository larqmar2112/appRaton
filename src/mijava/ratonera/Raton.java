package mijava.ratonera;

/**
 * @author LuisArquillos
 * @version 2.0.0
 */
public class Raton {
    /**
     * Se crea la edad, el peso y la tasa de crecimiento
     * @param edad - edad del raton
     * @param peso - peso del raton
     * @paran tasaCrecimiento - tasa de crecimiento del ratón
     * @see <a href="https://es.wikipedia.org/wiki/Rat%C3B3n">Enlace a metodos getter y setter asociados a la tasa de crecimiento</a>
     * @since 2.0.0
     */
    public int edad;
    public double peso;
    public double tasaCrecimiento;

    /**
     * Metodo constructor que crea una sobrecarga en los parametros edad y peso
     * @since 2.0.0
     */
    public Raton(){
        this.edad = edad;
        this.peso = peso;
    }

    /**
     * Este metodo hace que aumente la edad
     * @since 1.0.0
     */
    public void desarrollar() {
        this.edad++;
    }

    /**
     * Este metodo hace que el peso cambie por la tasa de crecimiento
     * @since 2.0.0
     */
    public void crecida(){
        this.peso +=(this.peso*this.tasaCrecimiento/100.0);
    }

    /**
     * Este metodo devuelve la edad y el peso en un formato String
     * @return edad y peso
     * @since 1.0.0
     */
    public String datos() {
        return String.format("(%d;%.2f)",this.edad,this.peso);
    }
}
