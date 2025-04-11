/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.excepciones;

/**
 * Excepción lanzada cuando se intenta realizar una acción mientras el vehículo
 * está patinando, lo cual no está permitido por razones de seguridad.
 * 
 * Esta excepción indica que el vehículo no puede ejecutar ciertas maniobras
 * hasta recuperar la estabilidad.
 * 
 * @author mateo
 * @version 1.0
 * @since 1.0
 */
public class PantidandoCarro extends RuntimeException {

    /**
     * Crea una nueva excepción {@code PantidandoCarro} con un mensaje por defecto.
     */
    public PantidandoCarro() {
        super("El carro está patinando. No se puede realizar ninguna acción.");
    }
}
