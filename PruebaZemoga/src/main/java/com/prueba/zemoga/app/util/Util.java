package com.prueba.zemoga.app.util;

import java.util.List;
import com.prueba.zemoga.app.dto.ActualizarPortafolioDTO;
import com.prueba.zemoga.app.dto.ConsultarPortafolioDTO;
import com.prueba.zemoga.app.dto.StatusDTO;
import com.prueba.zemoga.app.entity.Portfolio;
import com.prueba.zemoga.app.enums.ErrorCode;

public interface Util {
	public StatusDTO generateStatusDTO (ErrorCode errorCode);

	public ConsultarPortafolioDTO generateConsultarPortafolioDTO (Portfolio portfolio, List<String> tweetsTimeLine);
	
	public Portfolio generatePortfolio (ActualizarPortafolioDTO actualizarPortafolioDTO, Portfolio portfolio);
	
	public Boolean validateActualizarPortafolioDTO (ActualizarPortafolioDTO actualizarPortafolioDTO);
}
