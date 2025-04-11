/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.excepciones;

/**
 * Excepción lanzada cuando se intenta encender un vehículo que ya está encendido.
 * 
 * Esta excepción evita encendidos redundantes que podrían representar fallos
 * en la lógica del sistema o acciones innecesarias del usuario.
 * 
 * @author mateo
 * @version 1.0
 * @since 1.0
 */
public class YaEncedido extends RuntimeException {

    /**
     * Crea una nueva excepción {@code YaEncedido} con un mensaje por defecto.
     */
    public YaEncedido() {
        super("El automóvil ya está encendido");
    }
}