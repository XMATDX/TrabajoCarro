/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package autonoma.ployectosimulador.excepciones;

/**
 * Excepción lanzada cuando el vehículo intenta frenar con una intensidad
 * mayor a la velocidad actual, lo que podría generar una pérdida de control
 * o derrape.
 * 
 * Se utiliza para indicar una frenada excesiva e inadecuada según la velocidad.
 * 
 * @author mateo
 * @version 1.0
 * @since 1.0
 */
public class FranarIntecidadMayor extends RuntimeException {

    /**
     * Crea una nueva excepción {@code FranarIntecidadMayor} con un mensaje por defecto.
     */
    public FranarIntecidadMayor() {
        super("El vehículo frenó con una cantidad mayor a la velocidad que tenía");
    }
}