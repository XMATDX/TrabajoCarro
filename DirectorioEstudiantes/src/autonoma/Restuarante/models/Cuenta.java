/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.Restuarante.models;

import autonoma.Restuarante.models.Plato;
import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class Cuenta {
   
    //////////////////////////////////
    ///Metodos
    
    
    public  double valorTotalReal(ArrayList<Plato> cantidadPlatos){
    
        
        double total =0;
        ///crea un For-each Loop para separa objetos de la lista
        
        for (Plato plato : cantidadPlatos) {
              total= total +(plato.getPrecio()*plato.getCantidad());
           }
        return total;}
    
    public double valorConPropina(double total, double porsetajePropina){

     total =total+(total*porsetajePropina);
     
    return total;
    }
    
    
    public double valorPropinayImpuesto(double total, double impuesto){
        
        total =total+(total*impuesto);
        return total;
    }

    
    
    public double valorPorIntegrante(double total, int cantidadParcipiantes){

            total = total/cantidadParcipiantes;
    return total;
    
    }
}
