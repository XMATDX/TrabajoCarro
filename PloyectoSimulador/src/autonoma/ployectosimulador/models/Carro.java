/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.models;

import autonoma.ployectosimulador.excepciones.EstaApagado;
import autonoma.ployectosimulador.excepciones.FrenarBruscamente;
import autonoma.ployectosimulador.excepciones.Max30;
import autonoma.ployectosimulador.excepciones.Max60;
import autonoma.ployectosimulador.excepciones.Velocidad0;
import autonoma.ployectosimulador.excepciones.YaEncedido;
import autonoma.ployectosimulador.excepciones.FranarIntecidadMayor;
import autonoma.ployectosimulador.excepciones.LimiteCapacidad;
import autonoma.ployectosimulador.excepciones.PantidandoCarro;

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
    private boolean pantidando = false;

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
    public boolean getPantidando(){
        return pantidando;
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

    public void setPantidando(boolean pantidando) {
        this.pantidando = pantidando;
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
        
        if(this.velocidad >= 60 ){
            //condicion donse avisa al usuari que se apago el carro en velocidad mas 60 km/h
            throw new Max60();
        }
        // Lanzamos si el carro ya esta apagado
        if (!this.motor.isEncendido()){
            throw new EstaApagado() ; // Lanzamos la excepción
        }
        this.motor.setEncendido(false);
    }
    
    public void acelerar(int cantidad ){
        
        if(this.pantidando){
         
            throw new PantidandoCarro();
        }
        if(cantidad > this.motor.getVelocidadMaxima()){
            throw new LimiteCapacidad (); // Lanzamos la excepción
        }
        if(cantidad+this.velocidad > this.motor.getVelocidadMaxima()){
            throw new LimiteCapacidad (); // Lanzamos la excepción
        }
        //se verfica si esta encendido
        if (!this.motor.isEncendido()){
            throw new EstaApagado() ; // Lanzamos la excepción
        }//condicion donse avisa al usuari hixo movimiento bruco
        if (cantidad >= 30){
            this.velocidad += cantidad;
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
            this.setPantidando(false);
            throw new Velocidad0 (); // Lanzamos la excepción
        
        }
        //condicion donse avisa que se va patinar el carro porsuperar frenar mas del limite de las llantas
        
        if (cantidad>= this.llanta.getLimitePermitido()){
            this.setPantidando(true);
            throw new FrenarBruscamente (); // Lanzamos la excepción
        }
        if (cantidad>= this.velocidad && cantidad>30){
            this.setPantidando(true);
            throw new FranarIntecidadMayor (); // Lanzamos la excepción
        }
        //condicion donse avisa al usuari hizo movimiento bruco
        if (cantidad >= 30){
           
           this.velocidad -= cantidad;
           throw new Max30 (); // Lanzamos la excepción
        }
        
        
        this.velocidad -= cantidad;
        // se cambia los valores negativos a  cero
        if(this.velocidad<0){
            
        this.velocidad = 0;
        }
    }
    
    public void combroparEstado(){
    
    }
}
