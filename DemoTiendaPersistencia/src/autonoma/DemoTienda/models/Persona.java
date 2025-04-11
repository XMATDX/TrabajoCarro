
package autonoma.DemoTienda.models;

/**
 *
 * @author Educacion
 */
public abstract class Persona {
    ////////////////////////////////////////////////////////////////////////////
    // Atributos
    private String nombre;
    private String cedula;
    private String direccion;
    
    ////////////////////////////////////////////////////////////////////////////
    // Constructor

    public Persona(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Metodos de Acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
    
    
}
