/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author CLIENTE
 */
@Named(value ="nombresBean")
@ManagedBean
@ViewScoped
public class nombresBean {
	private String nombre;
	private List<String> nombres  = new ArrayList<>();
	public void aumentar() {
		this.nombres.add(nombre);
                this.nombres1.add(nombre1);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<String> getNombres() {
		return nombres;
	}
        private String nombre1;
	private List<String> nombres1  = new ArrayList<>();
	
	
	public String getNombre1() {
		return nombre1;
	}
	
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}
	
	public List<String> getNombres1() {
		return nombres1;
	}
        
	
}
