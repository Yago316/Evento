package com.example.evento.evento.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.evento.evento.DTO.AtividadeDTO;
import com.example.evento.evento.Service.EventoService;
import com.example.evento.evento.entities.Atividade;

@RestController
@RequestMapping(value = "/evento")
public class EventoController {
	
	@Autowired
	EventoService service;

	@GetMapping
	public ResponseEntity<List<AtividadeDTO>> buscar(){
		return ResponseEntity.ok(service.buscarTodos());
	
	}
	
	@PostMapping
    public ResponseEntity<Atividade> criarAtividade(@RequestBody Atividade novaAtividade) {
        Atividade atividadeSalva = service.save(novaAtividade);
        return new ResponseEntity<>(atividadeSalva, HttpStatus.CREATED);
}
}

