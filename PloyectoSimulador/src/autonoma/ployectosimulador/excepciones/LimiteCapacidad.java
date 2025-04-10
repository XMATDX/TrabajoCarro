/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.excepciones;

/**
 *
 * @author mateo
 */
public class LimiteCapacidad extends RuntimeException{
    
    public LimiteCapacidad () {
        
        super("el carro supero la velocidad maxima de motor");
    }
    
}
