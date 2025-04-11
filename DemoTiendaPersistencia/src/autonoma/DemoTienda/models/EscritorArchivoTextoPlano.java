
package autonoma.DemoTienda.models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * Escribe el archivo de memoria interna
 *
 * @author Carlos Andres Rojas Parra
 * @version 1.0.0
 */
public class EscritorArchivoTextoPlano implements Escritor{
    

    /**
     * charset en el cual se desea leer el archivo
     */
    private final Charset charset = Charset.forName("UTF-8");
    
    private String filePath;

    public EscritorArchivoTextoPlano(String filePath) {
        this.filePath = filePath;
    }
 

    
    
    ////////////////////////////////////////////////////////////////////////////
    /**
     * Sobreescribe el archivo de texto
     * 
     * @throws IOException 
     */
    @Override
    public void escribir(ArrayList<String> archivo) throws IOException {

        File fichero = new File(this.filePath);
        FileWriter writer = new FileWriter(fichero,false);
        PrintWriter pw = new PrintWriter(writer);
        
        for (String linea : archivo) {
            pw.println(linea);
        }
        
        writer.close();
    }
   

}
