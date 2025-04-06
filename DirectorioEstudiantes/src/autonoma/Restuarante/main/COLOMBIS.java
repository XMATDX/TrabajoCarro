/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.Restuarante.main;

import autonoma.Restuarante.models.Cena;
import autonoma.Restuarante.views.Ventana;

/**
 *
 * @author mateo
 */
public class COLOMBIS {
    
    public static void main(String[] args){
        Cena cena = new Cena();
        //secrea la clase ventana para que funcione el codigo
        Ventana ventana = new Ventana(cena);
        
        //para se active el Jfrems (ventanas)
        ventana.setVisible(true);
    }
    
}
