package com.example.evento.evento.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.evento.evento.DTO.AtividadeDTO;
import com.example.evento.evento.Repository.AtividadeRepository;
import com.example.evento.evento.entities.Atividade;
import com.example.evento.evento.entities.Participante;

@Service
public class EventoService {
	@Autowired
	AtividadeRepository repo;
	
	public List<AtividadeDTO> buscarTodos() {
		List<Atividade> list = repo.findAll();
		return list.stream().map(x -> new AtividadeDTO(x)).toList();
	}

	public Participante save(Participante novoParticpante) {

		return null;
	}
}
