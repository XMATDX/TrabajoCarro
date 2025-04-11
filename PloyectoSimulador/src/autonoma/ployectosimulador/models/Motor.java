/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.models;

/**
 * Representa un motor de vehículo. Cada motor tiene un tipo (cilindraje),
 * una velocidad máxima permitida según ese tipo y un estado de encendido/apagado.
 * 
 * @author mateo
 */
public class Motor {

    //////////////////////////////////
    /// Atributos
    ///

    /**
     * Indica si el motor está encendido o apagado.
     */
    private boolean encendido;

    /**
     * Tipo de motor según su cilindraje ("1000", "2000", "3000").
     */
    private String tipo;

    /**
     * Velocidad máxima permitida para este tipo de motor.
     */
    private int velocidadMaxima;

    /////////////////////////////////
    /// Constructor
    ////

    /**
     * Crea una nueva instancia del motor con un tipo de cilindraje determinado.
     * Dependiendo del tipo, se establece su velocidad máxima.
     * 
     * @param tipo Tipo o cilindraje del motor.
     * @throws IllegalArgumentException Si el tipo de motor no es reconocido.
     */
    public Motor(String tipo) {
        this.tipo = tipo;
        this.encendido = false;
        switch (tipo) {
            case "1000":
                this.velocidadMaxima = 100;
                break;
            case "2000":
                this.velocidadMaxima = 160;
                break;
            case "3000":
                this.velocidadMaxima = 220;
                break;
            default:
                throw new IllegalArgumentException("Cilindraje desconocido: " + tipo);
        }
    }

    //////////////////////////////////
    /// Metodos de acceso (get)
    ///

    /**
     * Indica si el motor está encendido.
     * 
     * @return true si está encendido, false si está apagado.
     */
    public boolean isEncendido() {
        return encendido;
    }

    /**
     * Devuelve el tipo o cilindraje del motor.
     * 
     * @return tipo del motor.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Devuelve la velocidad máxima permitida para este motor.
     * 
     * @return velocidad máxima del motor.
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    //////////////////////////////////
    /// Metodos de acceso (set)
    ///

    /**
     * Establece el estado del motor (encendido o apagado).
     * 
     * @param encendido true para encender el motor, false para apagarlo.
     */
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    /**
     * Establece el tipo del motor.
     * 
     * @param tipo nuevo tipo o cilindraje del motor.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Establece una nueva velocidad máxima para el motor.
     * 
     * @param velocidadMaxima nueva velocidad máxima.
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

}
