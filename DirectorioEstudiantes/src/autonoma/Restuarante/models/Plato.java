/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.Restuarante.models;

/**
 *
 * @author mateo
 */
public class Plato {
    
    
    
    //////////////////////////////////
    ///Atributos
   
    private String tipo;
    private int cantidad;
    private float precio;
    
    
    //////////////////////////////////
    ///Metodos Contructor

    public Plato(String tipo, int cantidad, float precio){
        
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
       
    }
    
    
    //////////////////////////////////
    ///Metodos de Accseoso
    public String getTipo(){
        return tipo;
    } 
    
    
    public void setTipo(String tipo){
    
        this.tipo = tipo;
    }
    
    public int getCantidad(){
        return cantidad;
    } 
    
    public void setCantidad(int cantidad){
    
      this.cantidad = cantidad;
    }


    public double getPrecio(){
        return precio;
    } 
    
    public void setPrecio(int precio){
    
      this.precio = precio;
    }
    
}