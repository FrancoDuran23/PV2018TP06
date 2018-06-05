/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import java.io.Serializable;

/**
 *
 * @author Judith Aldonate
 */
public class Usuario implements Serializable{
    private String usurio;
    private String contraseña;

    public Usuario(String usurio, String contraseña) {
        this.usurio = usurio;
        this.contraseña = contraseña;
    }

    public Usuario() {
    }

    /**
     * @return the usurio
     */
    public String getUsurio() {
        return usurio;
    }

    /**
     * @param usurio the usurio to set
     */
    public void setUsurio(String usurio) {
        this.usurio = usurio;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    
}
