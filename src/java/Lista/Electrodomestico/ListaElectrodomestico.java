/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.Electrodomestico;

import Electrodomestico.Electrodomestico;
import java.util.ArrayList;

/**
 *
 * @author Judith Aldonate
 */
public class ListaElectrodomestico {
     private ArrayList <Electrodomestico> listaE;

    public ListaElectrodomestico() {
        listaE = new ArrayList();
    }

    public ListaElectrodomestico(ArrayList<Electrodomestico> listaE) {
        this.listaE = listaE;
    }
     public ArrayList<Electrodomestico> agregarElectrodomestico (Electrodomestico eletrodomestico){
        getListaE().add(eletrodomestico);
        return getListaE();
    }

    /**
     * @return the listaE
     */
    public ArrayList <Electrodomestico> getListaE() {
        return listaE;
    }

    /**
     * @param listaE the listaE to set
     */
    public void setListaE(ArrayList <Electrodomestico> listaE) {
        this.listaE = listaE;
    }
    
}
