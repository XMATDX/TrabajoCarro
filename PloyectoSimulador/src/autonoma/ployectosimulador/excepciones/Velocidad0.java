/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.excepciones;

/**
 *
 * @author mateo
 */
public class Velocidad0 extends RuntimeException{

    public Velocidad0(int velocidad) {
        
        //se comprueba si la velocidad del carro es cero par decir que no es necesario frenar
        if(velocidad== 0){
            
            throw this; // Lanzamos la excepción
        
        }
    
    }
    
}
