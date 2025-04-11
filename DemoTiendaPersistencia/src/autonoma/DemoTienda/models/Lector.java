
package autonoma.DemoTienda.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * Lee el archivo
 *
 * @author Carlos Andres Rojas Parra
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
