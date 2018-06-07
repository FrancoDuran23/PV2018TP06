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
    private String usurio;
    private String contraseña;

    /**
     * Creates a new instance of LoginFormBeans
     */
    public LoginFormBeans() {
    }

    public LoginFormBeans(String usurio, String contraseña) {
        this.usurio = usurio;
        this.contraseña = contraseña;
    }

  
public String validarUsuario(){
        String resultado = null;
        Usuario usuario = null;
        TablaUsuario unUsuario = new TablaUsuario();
        usuario = unUsuario.validarUsuario(usurio, contraseña);
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
        resultado = "/Electrodomesticos";
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
       String resultado="/Login";
       return resultado;
   }
   public boolean verificarSesion(){
       boolean sesionValida=false;
       if(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado")!=null)
           sesionValida=true;
       
       return sesionValida;
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
