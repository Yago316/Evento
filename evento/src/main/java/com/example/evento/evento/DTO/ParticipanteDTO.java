package com.example.evento.evento.DTO;

import com.example.evento.evento.entities.Participante;

public class ParticipanteDTO {
			private Integer id;
			private String nome;
			private String email ;

	public ParticipanteDTO(Participante x) {
		// TODO Auto-generated constructor stub
	}
	

	public ParticipanteDTO(Integer id, String nome, String email) {
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
	
}
