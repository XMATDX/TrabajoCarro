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
 * Representa un carro con la capacidad de encender, apagar, acelerar y frenar,
 * controlando el estado del motor, la velocidad y el patinaje.
 * 
 * @author maribel ceballos
 */
public class Carro {

    ////////////////////////////////
    /// Atributos
    ///

    /**
     * Tipo de carro (por ejemplo: deportivo, sedán, SUV).
     */
    private String tipo;

    /**
     * Velocidad actual del carro en km/h.
     */
    private int velocidad = 0;

    /**
     * Llantas del carro.
     */
    private Llanta llanta;

    /**
     * Motor del carro.
     */
    private Motor motor;

    /**
     * Indica si el carro está patinando debido a una frenada brusca.
     */
    private boolean pantidando = false;

    /////////////////////////////////
    /// Constructor
    ////

    /**
     * Crea una nueva instancia de Carro con tipo, motor y llanta especificados.
     * El motor se inicializa apagado por defecto.
     * 
     * @param tipo El tipo de carro.
     * @param motor El motor asignado al carro.
     * @param llanta Las llantas asignadas al carro.
     */
    public Carro(String tipo, Motor motor, Llanta llanta) {
        this.tipo = tipo;
        this.motor = motor;
        this.llanta = llanta;
        this.motor.setEncendido(false);
    }

    //////////////////////////////////
    /// Metodos de acceso (get)
    ///

    /**
     * Obtiene el tipo del carro.
     * 
     * @return tipo del carro.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Obtiene la velocidad actual del carro.
     * 
     * @return velocidad en km/h.
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Verifica si el carro está patinando.
     * 
     * @return true si está patinando, false en caso contrario.
     */
    public boolean getPantidando(){
        return pantidando;
    }

    /**
     * Obtiene las llantas del carro.
     * 
     * @return llantas del carro.
     */
    public Llanta getLlanta() {
        return llanta;
    }

    /**
     * Obtiene el motor del carro.
     * 
     * @return motor del carro.
     */
    public Motor getMotor() {
        return motor;
    }

    //////////////////////////////////
    /// Metodos de acceso (set)
    ///

    /**
     * Establece el tipo del carro.
     * 
     * @param tipo nuevo tipo del carro.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Establece la velocidad actual del carro.
     * 
     * @param velocidad nueva velocidad en km/h.
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Establece si el carro está patinando.
     * 
     * @param pantidando true si el carro patina, false si no.
     */
    public void setPantidando(boolean pantidando) {
        this.pantidando = pantidando;
    }

    //////////////////////////////////
    /// Metodos
    /// 

    /**
     * Enciende el motor del carro.
     * 
     * @throws YaEncedido si el motor ya estaba encendido.
     */
    public void encender(){
        if (this.motor.isEncendido()){
            throw new YaEncedido();
        }
        this.motor.setEncendido(true);
    }

    /**
     * Apaga el motor del carro.
     * 
     * @throws Max60 si la velocidad es mayor o igual a 60 km/h.
     * @throws EstaApagado si el motor ya estaba apagado.
     */
    public void apagar(){
        if(this.velocidad >= 60 ){
            throw new Max60();
        }
        if (!this.motor.isEncendido()){
            throw new EstaApagado();
        }
        this.motor.setEncendido(false);
    }

    /**
     * Aumenta la velocidad del carro en una cantidad específica.
     * 
     * @param cantidad cantidad de km/h a acelerar.
     * @throws PantidandoCarro si el carro está patinando.
     * @throws LimiteCapacidad si se supera la velocidad máxima del motor.
     * @throws EstaApagado si el motor está apagado.
     * @throws Max30 si la aceleración es mayor o igual a 30 km/h.
     */
    public void acelerar(int cantidad ){
        if(this.pantidando){
            throw new PantidandoCarro();
        }
        if(cantidad > this.motor.getVelocidadMaxima()){
            throw new LimiteCapacidad();
        }
        if(cantidad+this.velocidad > this.motor.getVelocidadMaxima()){
            throw new LimiteCapacidad();
        }
        if (!this.motor.isEncendido()){
            throw new EstaApagado();
        }
        if (cantidad >= 30){
            this.velocidad += cantidad;
            throw new Max30();
        }

        this.velocidad += cantidad;
    }

    /**
     * Reduce la velocidad del carro en una cantidad específica.
     * 
     * @param cantidad cantidad de km/h a reducir.
     * @throws EstaApagado si el motor está apagado.
     * @throws Velocidad0 si la velocidad ya es cero.
     * @throws FrenarBruscamente si la cantidad excede el límite permitido por las llantas.
     * @throws FranarIntecidadMayor si la frenada es más fuerte que la velocidad actual y mayor a 30.
     * @throws Max30 si se frena con una intensidad mayor o igual a 30 km/h.
     */
    public void frenar(int cantidad ){
        if (!this.motor.isEncendido()){
            throw new EstaApagado();
        }
        if(this.velocidad == 0){
            this.setPantidando(false);
            throw new Velocidad0();
        }
        if (cantidad >= this.llanta.getLimitePermitido()){
            this.setPantidando(true);
            throw new FrenarBruscamente();
        }
        if (cantidad >= this.velocidad && cantidad > 30){
            this.setPantidando(true);
            throw new FranarIntecidadMayor();
        }
        if (cantidad >= 30){
            this.velocidad -= cantidad;
            throw new Max30();
        }

        this.velocidad -= cantidad;

        if(this.velocidad < 0){
            this.velocidad = 0;
        }
    }

    /**
     * Verifica el estado general del carro.
     * (Método no implementado aún).
     */
    public void combroparEstado(){
        // Método pendiente de implementación
    }
}