/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.models;

/**
 *
 * @author mateo
 */
public class Motor {
    
    
    //////////////////////////////////
    /// Atributos
    ///
    private boolean encendido;
    private String tipo;
    private int velocidadMaxima;
    
    
    /////////////////////////////////
    /// Constructor
    ////
    public Motor(String tipo, int velocidadMaxima) {
        this.tipo = tipo;
        this.velocidadMaxima = velocidadMaxima;
    }

    
    //////////////////////////////////
    /// Metodos de acceso (get)
    ///
    public boolean isEncendido() {
        return encendido;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    
    //////////////////////////////////
    /// Metodos de acceso (set)
    ///
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    
    
    
}
