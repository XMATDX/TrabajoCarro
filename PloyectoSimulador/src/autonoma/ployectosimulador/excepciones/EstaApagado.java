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
    
    public EstaApagado(){
        
        super("el vehiculo esta apagado");
    }
    
}
