/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.excepciones;

/**
 * Excepción lanzada cuando se intenta frenar un vehículo que ya se encuentra detenido.
 * 
 * Esta excepción indica que no es necesario aplicar freno ya que la velocidad es cero.
 * 
 * @author mateo
 * @version 1.0
 * @since 1.0
 */
public class Velocidad0 extends RuntimeException {

    /**
     * Crea una nueva excepción {@code Velocidad0} con un mensaje por defecto.
     */
    public Velocidad0() {
        super("El automóvil no está en movimiento");
    }
}
