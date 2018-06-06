/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormBean;

import Tabla.Usuario.TablaUsuario;
import Usuario.Usuario;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Judith Aldonate
 */
@ManagedBean
@ViewScoped
public class LoginFormBeans {
    private String nombreUs;
    private String passUs;

    /**
     * Creates a new instance of LoginFormBeans
     */
    public LoginFormBeans() {
    }

    public LoginFormBeans(String nombreUs, String passUs) {
        this.nombreUs = nombreUs;
        this.passUs = passUs;
    }
public String validarUsuario(){
        String resultado = null;
        Usuario usuario = null;
        TablaUsuario unUsuario = new TablaUsuario();
        usuario = unUsuario.validarUsuario(nombreUs, passUs);
        if(usuario==null){
            FacesMessage facesMessage =
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Credenciales Invalidas", "No existe el Usuario");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        }
        else{
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO,
            "Usuario Valido", "Usuario Valido");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("UsuarioValidado", usuario);
        resultado = " menu";
        }
        return resultado;
    }
   public String getNombreUsuarioValidado(){
       Usuario usuario=(Usuario)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado");
       return usuario.getUsurio();     
    
    }
   public String cerrarSesion(){
       FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
       FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO,"Sesion Cerrada","Sesion Cerrada");
       FacesContext.getCurrentInstance().addMessage(null, facesMessage);
       String resultado="/login";
       return resultado;
   }
   public boolean verificarSesion(){
       boolean sesionValida=false;
       if(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado")!=null)
           sesionValida=true;
       return sesionValida;
   }
    /**
     * @return the nombreUs
     */
    public String getNombreUs() {
        return nombreUs;
    }

    /**
     * @param nombreUs the nombreUs to set
     */
    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    /**
     * @return the passUs
     */
    public String getPassUs() {
        return passUs;
    }

    /**
     * @param passUs the passUs to set
     */
    public void setPassUs(String passUs) {
        this.passUs = passUs;
    }
    
}
