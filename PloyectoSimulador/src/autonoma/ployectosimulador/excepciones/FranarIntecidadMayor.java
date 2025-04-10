/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.excepciones;

/**
 *
 * @author mateo
 */
public class FranarIntecidadMayor extends RuntimeException{
    
    
    public FranarIntecidadMayor () {
        
        super("El vehículo freno con una catida mayor de la velocida que hay");
    
    }
    
}
