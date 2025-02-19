package com.example.evento.evento.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Participantes")
public class Participante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String nome;
	private String email;
	
	@ManyToMany(mappedBy = "participante")
	private List<Atividade>atividades;
	
	public Participante() {
		
	}

	public Participante(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static List<Participante> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Participante save(Participante participante) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
