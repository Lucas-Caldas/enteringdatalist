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
@Named(value ="nomesBean")
@ManagedBean
@ViewScoped
public class nomesBean {
	private String nome;
	private List<String> nomes  = new ArrayList<>();
	public void aumentar() {
		this.nomes.add(nome);
                this.idades.add(idade);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<String> getNomes() {
		return nomes;
	}
        private String idade;
	private List<String> idades  = new ArrayList<>();
	
	
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
