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
    public Llanta(String nombre, int limitePermitido) {
        this.nombre = nombre;
        this.limitePermitido = limitePermitido;
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
