/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprogra3;

import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
/**
 *
 * @author Estuardo
 */
public class Logica {
    
    HashMap <String, Producto> listaProductos = new HashMap <String, Producto>();
    
    //Metodo para insertar cada registro en la tabla Hash, se usa el código de producto como identificador
    //y un Objeto Producto para almacenar el resto de los datos requeridos
    public static void agregarProducto(String id, Producto producto, HashMap <String, Producto> listaProductos){
    if (listaProductos.containsKey(id)) {
        System.out.println("Error al ingresar producto, revise los datos y si el código está repetido.");
    } else {
        listaProductos.put(id, producto);               
    }
}
    //Metodo eliminar, elimina un registro del inventario (Tabla Hash)
    public static void eliminarProducto(String id, HashMap<String, Producto> listaProductos) {
        if (listaProductos.containsKey(id)) {
            listaProductos.remove(id);
        } else {
            System.out.println("No hay ningun producto con ese código.");
        }
    }
}
