/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormBean;

import Electrodomestico.Electrodomestico;
import Lista.Electrodomestico.ListaElectrodomestico;
import Listamarca.ListaMarcas;
import Marca.Marca;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Judith Aldonate
 */
@ManagedBean
@ViewScoped
public class ElectrodomesticoFormBean {
    private String codigo;
    private String tipo;
    private Marca marca;
    private Date fecha;
    private Electrodomestico unElectrodomestico;
    private ListaElectrodomestico electrodomestico;
    private ArrayList <Electrodomestico> lista;
    private ListaMarcas listadoM;
    private ArrayList <Marca> listaMarcas;

    public ElectrodomesticoFormBean() {
        electrodomestico = new ListaElectrodomestico();
        lista = new ArrayList();
        listadoM = new ListaMarcas();
        listadoM.getListaM().add(new Marca("l","Sony"));
        listadoM.getListaM().add(new Marca("2","KoK"));
        listadoM.getListaM().add(new Marca("3","A+"));
        listadoM.getListaM().add(new Marca("4","Philips"));
    }
    

    public ElectrodomesticoFormBean(String codigo, String tipo, Marca marca, Date fecha, Electrodomestico unElectrodomestico, ListaElectrodomestico electrodomestico, ArrayList<Electrodomestico> lista, ListaMarcas listadoM, ArrayList<Marca> listaMarcas) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.marca = marca;
        this.fecha = fecha;
        this.unElectrodomestico = unElectrodomestico;
        this.electrodomestico = electrodomestico;
        this.lista = lista;
        this.listadoM = listadoM;
        this.listaMarcas = listaMarcas;
    }
 
    public void agregarElectrodomestico(){
        setUnElectrodomestico(new Electrodomestico(getCodigo(), getTipo(), getMarca(),getFecha()));        
        setLista(getElectrodomestico().agregarElectrodomestico(getUnElectrodomestico()));
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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the unElectrodomestico
     */
    public Electrodomestico getUnElectrodomestico() {
        return unElectrodomestico;
    }

    /**
     * @param unElectrodomestico the unElectrodomestico to set
     */
    public void setUnElectrodomestico(Electrodomestico unElectrodomestico) {
        this.unElectrodomestico = unElectrodomestico;
    }

    /**
     * @return the electrodomestico
     */
    public ListaElectrodomestico getElectrodomestico() {
        return electrodomestico;
    }

    /**
     * @param electrodomestico the electrodomestico to set
     */
    public void setElectrodomestico(ListaElectrodomestico electrodomestico) {
        this.electrodomestico = electrodomestico;
    }

    /**
     * @return the lista
     */
    public ArrayList <Electrodomestico> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList <Electrodomestico> lista) {
        this.lista = lista;
    }

    /**
     * @return the listadoM
     */
    public ListaMarcas getListadoM() {
        return listadoM;
    }

    /**
     * @param listadoM the listadoM to set
     */
    public void setListadoM(ListaMarcas listadoM) {
        this.listadoM = listadoM;
    }

    /**
     * @return the listaMarcas
     */
    public ArrayList <Marca> getListaMarcas() {
        return listaMarcas;
    }

    /**
     * @param listaMarcas the listaMarcas to set
     */
    public void setListaMarcas(ArrayList <Marca> listaMarcas) {
        this.listaMarcas = listaMarcas;
    }
}