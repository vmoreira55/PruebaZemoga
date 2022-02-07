package com.prueba.zemoga.app.dto;

public class ConsultarPortafolioResponseDTO {
	
 private ConsultarPortafolioDTO consultarPortafolioDTO;
 
 private StatusDTO statusDTO;

public ConsultarPortafolioDTO getConsultarPortafolioDTO() {
	return consultarPortafolioDTO;
}

public void setConsultarPortafolioDTO(ConsultarPortafolioDTO consultarPortafolioDTO) {
	this.consultarPortafolioDTO = consultarPortafolioDTO;
}

public StatusDTO getStatusDTO() {
	return statusDTO;
}

public void setStatusDTO(StatusDTO statusDTO) {
	this.statusDTO = statusDTO;
}
 
 
}
