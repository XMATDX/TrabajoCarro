/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.ployectosimulador.main;

import autonoma.ployectosimulador.models.Carro;
import autonoma.ployectosimulador.views.PantallaPrincipal;

/**
 *
 * @author mateo
 */
public class PloyectoSimulador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro carro = new Carro("Ford mustang");
        
        //secrea la clase PantallaPrincipal para que funcione el codigo
        PantallaPrincipal pantalla =new PantallaPrincipal(carro);
        
        //para se active el Jfrems (pantalla)
        pantalla.setVisible(true);
    }
    
}
