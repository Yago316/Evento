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

import com.example.evento.evento.DTO.ParticipanteDTO;
import com.example.evento.evento.Service.EventoService;
import com.example.evento.evento.entities.Participante;

@RestController
@RequestMapping("/evento")
public class EventoController {
	
	@Autowired
	EventoService service;

	@GetMapping
	public ResponseEntity<List<ParticipanteDTO>> buscarTodos(){
		return ResponseEntity.ok(service.buscarTodos());
	
	}
	
	@PostMapping("/cadastrar")
    public ResponseEntity<Participante> cadastarUsuario(@RequestBody Participante novoParticpante) {
        Participante participateSalva = service.save(novoParticpante);
        return new ResponseEntity<>(participateSalva, HttpStatus.CREATED);
}
}

