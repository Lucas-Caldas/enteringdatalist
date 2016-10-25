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
@Named(value ="idadesBean")
@ManagedBean
@ViewScoped
public class idadesBean {
	private String idade;
	private List<String> idades  = new ArrayList<>();
	public void aumentar() {
		this.idades.add(idade);
	}
	
	public String getIdade() {
		return idade;
	}
	
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public List<String> getIdades() {
		return idades;
	}
	
}
