/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.excepciones;

/**
 * Excepción lanzada cuando se intenta apagar el vehículo mientras se encuentra
 * a una velocidad igual o superior a 60 km/h.
 * 
 * Esta acción se considera peligrosa y por eso se evita mediante esta excepción.
 * 
 * @author mateo
 * @version 1.0
 * @since 1.0
 */
public class Max60 extends RuntimeException {

    /**
     * Crea una nueva excepción {@code Max60} con un mensaje por defecto.
     */
    public Max60() {
        super("No se puede apagar el vehículo: está circulando a más de 60 km/h.");
    }
}