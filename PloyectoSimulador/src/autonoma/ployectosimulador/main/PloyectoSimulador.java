/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.ployectosimulador.main;

import autonoma.ployectosimulador.models.Carro;
import autonoma.ployectosimulador.models.Llanta;
import autonoma.ployectosimulador.models.Motor;
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
        Motor m = new Motor("nombre",100);
        Llanta l = new Llanta("tipo",190);
        Carro carro = new Carro("Ford mustang",m,l );
        
        //secrea la clase PantallaPrincipal para que funcione el codigo
        PantallaPrincipal pantalla =new PantallaPrincipal(carro);
        
        //para se active el Jfrems (pantalla)
        pantalla.setVisible(true);
    }
    
}
