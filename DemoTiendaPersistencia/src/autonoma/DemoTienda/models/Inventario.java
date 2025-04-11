/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.DemoTienda.models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Educacion
 */
public class Inventario {

    ////////////////////////////////////////////////////////////////////////////
    // Atributos
    private ArrayList<Producto> productos;

    private Escritor escritor;

    ////////////////////////////////////////////////////////////////////////////
    // Constructor
    public Inventario() {
        this.productos = new ArrayList<>();
        escritor = new EscritorArchivoTextoPlano("productos.txt");
    }

    ////////////////////////////////////////////////////////////////////////////
    // Métodos de acceso
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    ////////////////////////////////////////////////////////////////////////////
    // Metodos de gestión de productos o CRUD de productos
    ////////////////////////////////////////////////////////////////////////////
    public boolean agregarProducto(Producto producto) {
        if (this.productos.add(producto)) {
            this.actualizarArchivo(this.convertirProductos());
            return true;
        } else {
            return false;
        }

    }

    ////////////////////////////////////////////////////////////////////////////
    public Producto buscarProducto(Producto producto) {

        for (int i = 0; i < this.productos.size(); i++) {
            Producto p = this.productos.get(i);
            if (p.equals(producto)) {
                return p;
            }
        }
        return null;
    }

    public Producto buscarProducto(long id) {

        for (int i = 0; i < this.productos.size(); i++) {
            Producto p = this.productos.get(i);
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public Producto buscarProducto(String nombre) {

        for (int i = 0; i < this.productos.size(); i++) {
            Producto p = this.productos.get(i);
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

    private int buscarIndiceProducto(long id) {
        for (int i = 0; i < this.productos.size(); i++) {
            Producto p = this.productos.get(i);
            if (p.getId() == id) {
                return i;
            }
        }
        return -1;
    }

    ////////////////////////////////////////////////////////////////////////////
    public Producto actualizarProducto(long id, Producto producto) {
        int index = this.buscarIndiceProducto(id);
        if (index >= 0) {
            if (this.productos.set(index,producto) != null ){
                this.actualizarArchivo(this.convertirProductos());
                return producto;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    public Producto eliminarProducto(long id) {

        int index = this.buscarIndiceProducto(id);
        if (index >= 0) {
                Producto p = this.productos.remove(index);
                if(p != null){
                     this.actualizarArchivo(this.convertirProductos());
                     return p;
                }else{
                    return p;
                }
           
        } else {
            return null;
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    public String mostrarInventario() {
        String inventario = "";
        for (int i = 0; i < this.productos.size(); i++) {
            Producto p = this.productos.get(i);
            inventario += p.toString() + "\n";
        }
        return inventario;
    }

    ////////////////////////////////////////////////////////////////////////////
    public void cargarProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    /////////////////////////////////////////////////////////////////////////////
    public ArrayList<String> convertirProductos() {
        ArrayList<String> productosStr = new ArrayList<>();

        for (Producto producto : this.productos) {
            String p = producto.getNombre() + ";" + producto.getPrecio();
            productosStr.add(p);

        }
        return productosStr;

    }

    /////////////////////////////////////////////////////////////////////////////////////
    public void actualizarArchivo(ArrayList<String> productos) {
        try {
            this.escritor.escribir(productos);
        } catch (IOException ex) {
            System.out.println("No se pudo actualizar el archivo");
        }
    }

}
