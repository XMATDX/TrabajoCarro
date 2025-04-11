/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.ployectosimulador.main;

import autonoma.ployectosimulador.models.Carro;
import autonoma.ployectosimulador.models.LectorArchivoDeTextoPlano;
import autonoma.ployectosimulador.models.Llanta;
import autonoma.ployectosimulador.models.Motor;
import autonoma.ployectosimulador.views.PantallaPrincipal;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class PloyectoSimulador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            try {
            LectorArchivoDeTextoPlano lector = new LectorArchivoDeTextoPlano();
            ArrayList<String> configuracion = lector.leer("src/autonoma/ployectosimulador/archivos/config.txt");


            String tipoLlantas = null;
            String cilindrajeMotor = null;
            for (String linea : configuracion) {
                String[] partes = linea.trim().split("\\s+");
                if (partes[0].equalsIgnoreCase("llantas")) {
                    tipoLlantas = partes[1];
                } else if (partes[0].equalsIgnoreCase("motor")) {
                    cilindrajeMotor = partes[1];
                }
            }

            Llanta l = new Llanta(tipoLlantas);
            Motor m = new Motor(cilindrajeMotor);
  
            Carro carro = new Carro("Ford mustang",m,l );
            
        //secrea la clase PantallaPrincipal para que funcione el codigo
        PantallaPrincipal pantalla =new PantallaPrincipal(carro);
        
        //para se active el Jfrems (pantalla)
        pantalla.setVisible(true);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error en la configuración: " + e.getMessage());
        }
        
        
        
        
        
        
        
        
    
        
        
        
    }
    
}
