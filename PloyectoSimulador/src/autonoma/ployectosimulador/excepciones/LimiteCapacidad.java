/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.excepciones;

/**
 * Excepción lanzada cuando el vehículo intenta superar la velocidad máxima
 * permitida por el motor.
 * 
 * Esta excepción evita que el vehículo exceda sus capacidades mecánicas,
 * protegiendo la integridad del motor.
 * 
 * @author mateo
 * @version 1.0
 * @since 1.0
 */
public class LimiteCapacidad extends RuntimeException {

    /**
     * Crea una nueva excepción {@code LimiteCapacidad} con un mensaje por defecto.
     */
    public LimiteCapacidad() {
        super("El carro superó la velocidad máxima del motor");
    }
}