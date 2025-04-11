/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DemoTienda.main;

import autonoma.DemoTienda.models.Administrador;
import autonoma.DemoTienda.models.Tienda;
import autonoma.DemoTienda.views.IniciarSesion;
import autonoma.DemoTienda.views.VentanaPrincipal;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Educacion
 */
public class DemoTienda {
    
    public static void main(String[] args) {
        
        
        Tienda tienda = new Tienda("Nuevo Milenio", "Calle 20 #7b-13");
        try {
            tienda.cargarProductos();
        } catch (IOException ex) {
            System.out.println("No veo el archivo");
            JOptionPane.showConfirmDialog(null, "Error al iniciar el programa, no se puede acceder al archivo productos.txt", "Error", JOptionPane.ERROR);
        }
        Administrador admin = new Administrador("andresr31", "12345678", "Carlos Andrés Rojas Parra", "12454153", "Calle 20");
        tienda.setAdministrador(admin);
        
        VentanaPrincipal ventana = new VentanaPrincipal(tienda);
        IniciarSesion login = new IniciarSesion(ventana, true, tienda, ventana);
        login.setVisible(true);
        
        
    }
          
}
