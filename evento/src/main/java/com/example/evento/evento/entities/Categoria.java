package com.example.evento.evento.entities;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "TEXT")
	private String descricao;
	
	@OneToMany(mappedBy = "categoria")
	private List<Atividade>atividades;
	
	public Categoria() {
		
	}

	public Categoria(Integer id, String descricacao) {
		this.id = id;
		this.descricao = descricacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricacao() {
		return descricao;
	}

	public void setDescricacao(String descricacao) {
		this.descricao = descricacao;
	}
	
	

	
}


