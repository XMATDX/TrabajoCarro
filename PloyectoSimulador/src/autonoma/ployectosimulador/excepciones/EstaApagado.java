/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.excepciones;

/**
 *
 * @author mateo
 */
public class EstaApagado extends RuntimeException{
    
    public EstaApagado(boolean estado){
    
        // Lanzamos si el carro  esta apagado
        if (!estado){
            throw this; // Lanzamos la excepción
        
        }
    }
    
}
