/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.excepciones;

/**
 *
 * @author mateo
 */
public class Max60 extends RuntimeException{

    public Max60() {
        
        super("El vehículo freno superando el límite permitido sus llantas el vehículo patinará.");
    }
    
    
    
}
