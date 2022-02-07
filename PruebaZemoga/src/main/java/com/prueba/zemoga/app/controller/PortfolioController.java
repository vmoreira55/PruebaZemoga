package com.prueba.zemoga.app.controller;

import static com.prueba.zemoga.app.enums.ErrorCode.EXITOSO;
import static com.prueba.zemoga.app.enums.ErrorCode.FALLIDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.zemoga.app.dto.ActualizarPortafolioDTO;
import com.prueba.zemoga.app.dto.ConsultarPortafolioResponseDTO;
import com.prueba.zemoga.app.dto.StatusDTO;
import com.prueba.zemoga.app.service.PortfolioService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/portfolio")   
public class PortfolioController {
	
	@Autowired
	private PortfolioService portfolioService;
	
	//Read a user
	@GetMapping("/{idportfolio}")
	public ResponseEntity<ConsultarPortafolioResponseDTO> read(@PathVariable Integer idportfolio){
		ConsultarPortafolioResponseDTO consultarPortafolioDTO = portfolioService.findById(idportfolio);
				
		if(!consultarPortafolioDTO.getStatusDTO().getCode().equals(EXITOSO.getCode())) {
			ResponseEntity<ConsultarPortafolioResponseDTO> response = new ResponseEntity<ConsultarPortafolioResponseDTO>(consultarPortafolioDTO, FALLIDO.getHttpStatus());
			return response;
		}
		
		ResponseEntity<ConsultarPortafolioResponseDTO> response = new ResponseEntity<ConsultarPortafolioResponseDTO>(consultarPortafolioDTO, EXITOSO.getHttpStatus());

		return response;
		
	}
	
	// Update a user
	@PutMapping("/update")
	public ResponseEntity<StatusDTO> updateData(@RequestBody ActualizarPortafolioDTO actualizarPortafolioDTO){
		return portfolioService.save(actualizarPortafolioDTO);
	}
}
