/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vistas.*;

/**
 *
 * @author USER
 */
public class ProductoController {
    public static VistaProducto ventana = new VistaProducto();
    public static void mostrar(){
        ventana.setVisible(true);
    }
    public static void ocultar(){
        ventana.setVisible(false);
    
    }
    
}
