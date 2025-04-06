/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.models;

/**
 *
 * @author mateo
 */
public class Carro {
    
    
    //////////////////////////////////
    /// Atributos
    ///
    private String tipo;
    private int velocidad = 0;
    private boolean encendido = false;

    //////////////////////////////////
    /// Constructor
    ///
    public Carro(String tipo) {
        this.tipo = tipo;
    }

    //////////////////////////////////
    /// Metodos de acceso (get)
    ///
    public String getTipo() {
        return tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    //////////////////////////////////
    /// Metodos de acceso (set)
    ///
    public boolean isEncendido() {
        return encendido;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
   //////////////////////////////////
    /// Metodos
    /// 
    
    public void encender(){
    
        this.encendido = true;
    }
    
    public void apagar(){
    
        this.encendido = false;
    }
    
    public void acelerar(int cantidad ){
    }
    
    public void frenar(int cantidad ){
    
    }
    
    public void combroparEstado(){
    
    }
}
