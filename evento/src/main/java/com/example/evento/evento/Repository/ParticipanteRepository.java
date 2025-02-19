package com.example.evento.evento.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.evento.evento.entities.Participante;
@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, Integer>{

}
