/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprogra3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/**
 *
 * @author Estuardo
 */
public class Logica {
    
    HashMap <String, Producto> listaProductos = new HashMap <String, Producto>();
    
    public static void agregarProducto(String id, Producto producto, HashMap <String, Producto> listaProductos){
    if (listaProductos.containsKey(id)) {
        System.out.println("No se puede introducir el producto. El código esta repetido.");
    } else {
        listaProductos.put(id, producto);               
    }
}
   
    public static void mostrarInventario (HashMap<String, Producto> listaProductos) {
        String clave;
        Iterator<String> productos = listaProductos.keySet().iterator();
        System.out.println("Hay los siguientes productos:");
        while (productos.hasNext()) {
            clave = productos.next();
            System.out.println(clave + " - " + listaProductos.get(clave));
        }
    }
    
}
