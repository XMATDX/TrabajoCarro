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

    public Max60(int velocidad) {
        
        //condicion donse avisa al usuari que se apago el carro en velocidad mas 60 km/h
        if (velocidad >= 60){
           throw this; // Lanzamos la excepción
        }
    }
    
    
    
}
