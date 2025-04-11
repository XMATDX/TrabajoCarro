/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ployectosimulador.models;

/**
 *
 * @author maribel
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Clase encargada de leer un archivo de texto plano y guardar su contenido línea por línea.
 * Implementa la interfaz {@code Lector}.
 * 
 * @author Maribel Ceballos Castrillon
 * @version 1.0.0
 */
public class LectorArchivoDeTextoPlano implements Lector {

    /**
     * Lista que almacena el contenido del archivo leído, línea por línea.
     */
    private ArrayList<String> archivo;

    /**
     * Charset utilizado para la lectura del archivo.
     */
    private Charset charset = Charset.forName("UTF-8");

    ////////////////////////////////////////////////////////////////////////
    /**
     * Constructor de la clase. Inicializa la lista donde se guarda el archivo.
     */
    public LectorArchivoDeTextoPlano() {
        this.archivo = new ArrayList<>();
    }

    /////////////////////////////////////////////////////////////////////////
    /**
     * Lee un archivo de texto desde la ruta proporcionada, línea por línea.
     * 
     * @param localizacionArchivo Ruta absoluta o relativa del archivo a leer.
     * @return ArrayList con el contenido del archivo, una línea por posición.
     * @throws IOException Si ocurre un error de lectura o el archivo no existe.
     */
    @Override
    public ArrayList<String> leer(String localizacionArchivo) throws IOException {
        archivo.clear();
        File file = null;
        FileReader reader = null;
        BufferedReader buffer = null;

        file = new File(localizacionArchivo);
        reader = new FileReader(file);
        buffer = new BufferedReader(reader);

        String linea;
        while ((linea = buffer.readLine()) != null) {
            agregarLinea(linea);
        }

        reader.close();
        return this.archivo;
    }

    ///////////////////////////////////////////////////////////////////////////
    /**
     * Agrega una línea de texto al contenido almacenado del archivo.
     * 
     * @param linea Línea de texto a añadir.
     */
    public void agregarLinea(String linea) {
        archivo.add(linea);
    }

    //////////////////////////////////////////////////////////////////////////
    /**
     * Elimina las líneas vacías (en blanco) de un texto dado.
     * 
     * @param texto Lista de líneas que se desea limpiar de líneas vacías.
     */
    public void limpiarTexto(ArrayList<String> texto) {
        for (int i = 0; i < texto.size(); i++) {
            if (texto.get(i).length() == 0) {
                texto.remove(i);
            }
        }
    }

    //////////////////////////////////////////////////////////////////////////

}