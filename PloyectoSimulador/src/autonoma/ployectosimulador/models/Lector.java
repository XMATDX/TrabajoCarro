/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.models;

/**
 *
 * @author maribel
 */
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * Lee el archivo
 *
 * @author Maribel Ceballos Castrillon
 * @version 1.0.0
 */
public interface Lector {
    
    //////////////////////////////////////////////////////////////////////////
    /**
     * Lee el archivo
     * 
     * @param localizacionArchivo
     * @return
     * @throws IOException 
     */
     public abstract ArrayList<String> leer(String localizacionArchivo)
                                                    throws IOException;
     
     //////////////////////////////////////////////////////////////////////////
    
}
