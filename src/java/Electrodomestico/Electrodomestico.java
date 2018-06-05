/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomestico;

import Marca.Marca;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Judith Aldonate
 */
public class Electrodomestico implements Serializable{
    private String codigo;
    private String tipo;
    private Marca marca;
    private Date fecha;

    public Electrodomestico() {
    }

    public Electrodomestico(String codigo, String tipo, Marca marca, Date fecha) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.fecha = fecha;
    }
    

}
