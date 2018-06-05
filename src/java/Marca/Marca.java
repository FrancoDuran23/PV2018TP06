/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marca;

import java.io.Serializable;

/**
 *
 * @author Judith Aldonate
 */
public class Marca implements Serializable {
    private String codigo;
    private String nombre;

    public Marca(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Marca() {
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
