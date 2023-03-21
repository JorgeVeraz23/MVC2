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
public class LoginController {
    public static VentanaLogin ventana = new VentanaLogin();
    public static void mostrar(){
        ventana.setVisible(true);
    }
    public static void ocultar(){
        ventana.setVisible(false);
    
    }
    public static void eventoBoton1(){
        String usuario = ventana.getjTextField1().getText();
        String clave = ventana.getjTextField2().getText();
        //deberia usar las clases del modelo para ver si el usuario y la clave son correctas
        if(usuario.equals("admin")&& clave.equals("1234")){
            ocultar();
            PrincipalController.mostrar();
        }else{
            System.out.println("usuario o clave incorrecta");
        }
        System.out.println("Evento!");
    }
}
