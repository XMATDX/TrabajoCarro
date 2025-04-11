/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.models;

/**
 *
 * @author mateo
 */
public class Llanta {
    
    //////////////////////////////////
    /// Atributos
    ///
    private String nombre;
    private int limitePermitido;

    
    
    /////////////////////////////////
    /// Constructor
    ////
    public Llanta(String nombre) {
        this.nombre = nombre;
        switch (nombre.toLowerCase()) {
            case "buenas": this.limitePermitido = 110; break;
            case "bonitas": this.limitePermitido = 70; break;
            case "baratas": this.limitePermitido = 50; break;
            default: throw new IllegalArgumentException("Tipo de llanta desconocido: " + nombre);
        }
    }

    
    //////////////////////////////////
    /// Metodos de acceso (get)
    ///
    public String getNombre() {
        return nombre;
    }

    public int getLimitePermitido() {
        return limitePermitido;
    }

    
    //////////////////////////////////
    /// Metodos de acceso (set)
    ///
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLimitePermitido(int limitePermitido) {
        this.limitePermitido = limitePermitido;
    }
    
    
    
}
