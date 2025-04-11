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
 * Clase principal del simulador de vehículos.
 * 
 * Esta clase se encarga de inicializar la configuración del simulador leyendo un archivo,
 * instanciar los componentes del vehículo (llantas, motor, carro) y lanzar la interfaz gráfica.
 * 
 * @author maribel ceballos 
 * @version 1.0
 * @since 1.0
 */
public class PloyectoSimulador {

    /**
     * Método principal del programa.
     * 
     * Lee la configuración desde un archivo, crea los objetos correspondientes y lanza
     * la interfaz gráfica del simulador.
     *
     * @param args Argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        
        try {
            // Se crea un lector de archivos de texto plano
            LectorArchivoDeTextoPlano lector = new LectorArchivoDeTextoPlano();
            // Se lee el archivo de configuración
            ArrayList<String> configuracion = lector.leer("src/autonoma/ployectosimulador/archivos/config.txt");

            String tipoLlantas = null;
            String cilindrajeMotor = null;

            // Se procesan las líneas de configuración
            for (String linea : configuracion) {
                String[] partes = linea.trim().split("\\s+");
                if (partes[0].equalsIgnoreCase("llantas")) {
                    tipoLlantas = partes[1];
                } else if (partes[0].equalsIgnoreCase("motor")) {
                    cilindrajeMotor = partes[1];
                }
            }

            // Se crean los objetos Motor, Llanta y Carro
            Llanta l = new Llanta(tipoLlantas);
            Motor m = new Motor(cilindrajeMotor);
            Carro carro = new Carro("Ford mustang", m, l);

            // Se lanza la interfaz gráfica
            PantallaPrincipal pantalla = new PantallaPrincipal(carro);
            pantalla.setVisible(true);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error en la configuración: " + e.getMessage());
        }
    }
}
        
        
        
        
        
        
        
    
        
        
        
    
    

