/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author USER
 */
import vistas.*;
public class PrincipalController {
    //esta clase va a controlar a la ventana de principal
    public static VistaPrincipal ventana = new VistaPrincipal();
    public static void mostrar(){
        ventana.setVisible(true);
    }
    public static void ocultar(){
        ventana.setVisible(false);
    }
    public static void botonSalir(){
        ocultar();
        LoginController.mostrar();
    }
    public static void botonVenta(){
        ocultar();
        VentaController.mostrar();
    }
    public static void botonProducto(){
        ocultar();
        ProductoController.mostrar();
    }
    
}
