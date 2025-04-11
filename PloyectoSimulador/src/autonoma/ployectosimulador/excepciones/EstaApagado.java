/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.excepciones;

/**
 * Excepción lanzada cuando se intenta realizar una acción que requiere
 * que el vehículo esté encendido, pero actualmente está apagado.
 * 
 * Por ejemplo, intentar acelerar o frenar un vehículo que no ha sido encendido.
 * 
 * @author mateo
 * @version 1.0
 * @since 1.0
 */
public class EstaApagado extends RuntimeException {

    /**
     * Crea una nueva excepción {@code EstaApagado} con un mensaje por defecto.
     */
    public EstaApagado() {
        super("El vehículo está apagado");
    }
}
