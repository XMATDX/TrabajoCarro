/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.models;

import autonoma.ployectosimulador.excepciones.EstaApagado;
import autonoma.ployectosimulador.excepciones.Max30;
import autonoma.ployectosimulador.excepciones.Velocidad0;
import autonoma.ployectosimulador.excepciones.YaEncedido;

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
    private Llanta llanta;
    private Motor motor;

    /////////////////////////////////
    /// Constructor
    ////
    public Carro(String tipo, Motor motor, Llanta llanta) {
        this.tipo = tipo;
        this.motor = motor;
        this.llanta = llanta;
        this.motor.setEncendido(false);
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


    
   //////////////////////////////////
    /// Metodos
    /// 
    
    public void encender(){
        // Lanzamos si el carro  esta encendido
        if (this.motor.isEncendido()){
            throw new YaEncedido() ; // Lanzamos la excepción
        }
        this.motor.setEncendido(true);
    }
    
    public void apagar(){
        // Lanzamos si el carro  esta apagado
        if (!this.motor.isEncendido()){
            throw new EstaApagado() ; // Lanzamos la excepción
        }
        this.motor.setEncendido(false);
    }
    
    public void acelerar(int cantidad ){
        //se verfica si esta encendido
        
        // Lanzamos si el carro  esta apagado
        if (!this.motor.isEncendido()){
            throw new EstaApagado() ; // Lanzamos la excepción
        }//condicion donse avisa al usuari que se apago el carro en velocidad mas 60 km/h
        if (cantidad >= 30){
           throw new Max30 (); // Lanzamos la excepción
        }
        this.velocidad += cantidad;
    }
    
    public void frenar(int cantidad ){
        // Lanzamos si el carro  esta apagado
        if (!this.motor.isEncendido()){
            throw new EstaApagado() ; // Lanzamos la excepción
        }
        //se comprueba si la velocidad del carro es cero par decir que no es necesario frenar
        if(this.velocidad== 0){
            throw new Velocidad0 (); // Lanzamos la excepción
        
        }
        //condicion donse avisa al usuari que se apago el carro en velocidad mas 60 km/h
        if (cantidad >= 30){
           throw new Max30 (); // Lanzamos la excepción
        }
        
        
        this.velocidad -= cantidad;
    }
    
    public void combroparEstado(){
    
    }
}
