/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.models;

import autonoma.ployectosimulador.excepciones.EstaApagado;
import autonoma.ployectosimulador.excepciones.Max30;
import autonoma.ployectosimulador.excepciones.Velocidad0;

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
    private Llanta llanta;
    private Motor motor;

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
    
    public Llanta getLlanta() {
        return llanta;
    }
    
    public Motor getMotor() {
        return motor;
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
        //se verfica si esta encendido
        
        
        this.velocidad += cantidad;
    }
    
    public void frenar(int cantidad ){
        // Lanzamos si el carro  esta apagado
        if (!this.encendido){
            throw new EstaApagado() ; // Lanzamos la excepción
        }
        //se comprueba si la velocidad del carro es cero par decir que no es necesario frenar
        if(this.velocidad== 0){
            throw new Velocidad0 (); // Lanzamos la excepción
        
        }
        //condicion donse avisa al usuari que se apago el carro en velocidad mas 60 km/h
        if (this.velocidad >= 30){
           throw new Max30 (); // Lanzamos la excepción
        }
        
        
        this.velocidad -= cantidad;
    }
    
    public void combroparEstado(){
    
    }
}
