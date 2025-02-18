package com.example.evento.evento.entities;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Bloco")
public class Bloco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
	@Column(columnDefinition = "DATETIME")
	private Instant inicio;
	@Column(columnDefinition = "DATETIME")
	private Instant fim;
	
	@ManyToMany(mappedBy = "blocos")
	private List<Atividade>atividades;
	
	public Bloco() {
		
	}

	public Bloco(Integer id, Instant inicio, Instant fim) {
		this.id = id;
		this.inicio = inicio;
		this.fim = fim;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Instant getInicio() {
		return inicio;
	}

	public void setInicio(Instant inicio) {
		this.inicio = inicio;
	}

	public Instant getFim() {
		return fim;
	}

	public void setFim(Instant fim) {
		this.fim = fim;
	}
	
}
