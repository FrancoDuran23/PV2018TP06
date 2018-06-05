/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabla.Usuario;

import Usuario.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Judith Aldonate
 */
public class TablaUsuario {
     private ArrayList <Usuario> usuarios;

    public TablaUsuario() {
        usuarios = new ArrayList();
        usuarios.add(new Usuario("nuevo", "nuevo"));
        usuarios.add(new Usuario("admin", "admin"));
    }

    public Usuario validarUsuario(String nombreUs, String passUs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    
}
