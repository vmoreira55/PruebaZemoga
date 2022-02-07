package com.prueba.zemoga.app.service;

import org.springframework.http.ResponseEntity;

import com.prueba.zemoga.app.dto.ActualizarPortafolioDTO;
import com.prueba.zemoga.app.dto.ConsultarPortafolioResponseDTO;
import com.prueba.zemoga.app.dto.StatusDTO;

public interface PortfolioService {
	
	public ConsultarPortafolioResponseDTO findById(Integer idportfolio);
	
	public ResponseEntity<StatusDTO> save(ActualizarPortafolioDTO portfolio);

}
