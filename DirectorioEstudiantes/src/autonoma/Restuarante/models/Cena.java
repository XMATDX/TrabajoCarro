/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.Restuarante.models;

import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class Cena {
    
    //////////////////////////////////
    ///Atributos
    
    private  int numeroCena;
    private  int cantidadParcipiantes;
    private  ArrayList<Plato> cantidadPlatos;
    private  double porsentajePropina;
    private double impuesto = 0.10;
    public Cena() {
        this.cantidadPlatos = new ArrayList<>();
    }
    



    //////////////////////////////////
    ///Metodos Contructor

    //////////////////////////////////
    ///Metodos de Accseoso
    
    
    ///////////////////////
    ///numero cena
    public int getNumeroCena(){
    return numeroCena;
    }
    
    
    public void setNumeroCena(int numeroCena){
    
    this.numeroCena = numeroCena;
    }
    
    
    ///////////////////////
    ///cantidada Parcipiantes
    
    public int getCantidadParcipiantes(){
        return cantidadParcipiantes;
    }
    
    
    public void setCantidadParcipiantes(int cantidadParcipiantes){
    
    this.cantidadParcipiantes = cantidadParcipiantes;
    }
    
    
    ///////////////////////
    ///Cnatidad de PLatos
    
    public ArrayList<Plato> getCantidadPlatos(){
        return cantidadPlatos;
    }
    
    public void setCantidadPlatos(Plato plato ){
    
    this.cantidadPlatos.add(plato);
    }    

    
    
    ///////////////////////
    ///porsentajePropina
     public double getPorsentajePropina(){
        return porsentajePropina;
    }

    public void setPorsentajePropina(double porsentajePropina){
    
    this.porsentajePropina = porsentajePropina;
    } 
    
    /////////////////////////////
    ////impuesto
    public double impuesto(){
        return impuesto;
    }
    
    //////////////////////////////////
    ///Metodos
    
}
