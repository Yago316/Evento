package com.example.evento.evento.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atividade")
public class Atividade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	@Column(columnDefinition = "TEXT")
	private String descricao;
	private Double preco;
	
	@ManyToMany
	@JoinTable(name = "participante_atividade", joinColumns = @JoinColumn(name = "atividade_id"), inverseJoinColumns = @JoinColumn(name = "participante_id"))
	private List<Participante>participante;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;
	
	@ManyToMany
	@JoinTable(name = "atividade_bloco", joinColumns = @JoinColumn(name = "atividade_id"), inverseJoinColumns = @JoinColumn(name = "bloco_id"))
	private List<Bloco>blocos;
	
	public Atividade () {
		
	}

	public Atividade(Integer id, String nome, String descricao, Double preco) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
}
