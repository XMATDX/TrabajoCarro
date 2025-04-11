/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.excepciones;

/**
 * Excepción lanzada cuando el vehículo realiza una aceleración o frenado
 * mayor o igual a 30 km/h, lo cual se considera un movimiento brusco.
 * 
 * Esta excepción se utiliza para alertar al usuario sobre maniobras que
 * podrían ser peligrosas o dañar componentes del vehículo.
 * 
 * @author mateo
 * @version 1.0
 * @since 1.0
 */
public class Max30 extends RuntimeException {

    /**
     * Crea una nueva excepción {@code Max30} con un mensaje por defecto.
     */
    public Max30() {
        super("El vehículo hizo un movimiento muy brusco");
    }
}

