/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.models;

/**
 * Representa una llanta de vehículo, la cual tiene un nombre y un límite permitido
 * que define cuánto puede frenar el vehículo antes de derrapar, según el tipo de llanta.
 * 
 * @author maribel ceballos
 */
public class Llanta {

    //////////////////////////////////
    /// Atributos
    ///

    /**
     * Nombre o tipo de la llanta (ej: buenas, bonitas, baratas).
     */
    private String nombre;

    /**
     * Límite permitido de frenado seguro según el tipo de llanta.
     */
    private int limitePermitido;

    /////////////////////////////////
    /// Constructor
    ////

    /**
     * Crea una nueva instancia de {@code Llanta} según su nombre/tipo.
     * Asigna un límite permitido dependiendo del tipo ingresado.
     * 
     * @param nombre Tipo de llanta ("buenas", "bonitas", "baratas").
     * @throws IllegalArgumentException Si el tipo de llanta no es reconocido.
     */
    public Llanta(String nombre) {
        this.nombre = nombre;
        switch (nombre.toLowerCase()) {
            case "buenas":
                this.limitePermitido = 110;
                break;
            case "bonitas":
                this.limitePermitido = 70;
                break;
            case "baratas":
                this.limitePermitido = 50;
                break;
            default:
                throw new IllegalArgumentException("Tipo de llanta desconocido: " + nombre);
        }
    }

    //////////////////////////////////
    /// Metodos de acceso (get)
    ///

    /**
     * Obtiene el nombre o tipo de la llanta.
     * 
     * @return nombre de la llanta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el límite de frenado seguro permitido por la llanta.
     * 
     * @return límite permitido en unidades de velocidad.
     */
    public int getLimitePermitido() {
        return limitePermitido;
    }

    //////////////////////////////////
    /// Metodos de acceso (set)
    ///

    /**
     * Establece el nombre o tipo de la llanta.
     * 
     * @param nombre nuevo nombre de la llanta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece un nuevo límite de frenado permitido.
     * 
     * @param limitePermitido nuevo valor del límite permitido.
     */
    public void setLimitePermitido(int limitePermitido) {
        this.limitePermitido = limitePermitido;
    }

}