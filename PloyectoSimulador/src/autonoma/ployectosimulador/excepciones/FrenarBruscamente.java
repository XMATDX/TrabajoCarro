/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.excepciones;

/**
 * Excepción lanzada cuando el vehículo frena superando el límite permitido
 * por las llantas, lo que provoca que el vehículo patine.
 * 
 * Esta excepción busca alertar sobre una maniobra de frenado peligrosa
 * que compromete la estabilidad del vehículo.
 * 
 * @author mateo
 * @version 1.0
 * @since 1.0
 */
public class FrenarBruscamente extends RuntimeException {

    /**
     * Crea una nueva excepción {@code FrenarBruscamente} con un mensaje por defecto.
     */
    public FrenarBruscamente() {
        super("El vehículo frenó superando el límite permitido por sus llantas. El vehículo patinará.");
    }
}