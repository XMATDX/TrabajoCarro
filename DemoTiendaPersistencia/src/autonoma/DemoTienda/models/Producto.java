
package autonoma.DemoTienda.models;

/**
 *
 * @author Educacion
 */
public class Producto {
    
    ////////////////////////////////////////////////////////////////////////////
    private static int contadorProducto = 1;

    // Atributos
    private long id;
    private String nombre;
    private double precio;

    ////////////////////////////////////////////////////////////////////////////
    // Constructores
    
    public Producto() {
        this.id = Producto.contadorProducto;
        this.nombre = "";
        this.precio = 0;
        contadorProducto++;
    }

    public Producto(String nombre, double precio) {
        this.id = Producto.contadorProducto;
        this.nombre = nombre;
        this.precio = precio;
        contadorProducto++;
    }

    //////////////////////////////////////////////////////////////////
    // Métodos de acceso

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //////////////////////////////////////////////////////////////////
    // Métodos 
    
    @Override
    public String toString(){
       return "Producto " +id+ "\n"+
               "  Nombre: "+nombre+"\n"+
               "  Precio: "+precio+"\n";
    }
    
    
    
    
}
