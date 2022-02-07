package com.prueba.zemoga.app.util;

import java.util.List;
import org.springframework.stereotype.Service;
import com.prueba.zemoga.app.dto.ActualizarPortafolioDTO;
import com.prueba.zemoga.app.dto.ConsultarPortafolioDTO;
import com.prueba.zemoga.app.dto.StatusDTO;
import com.prueba.zemoga.app.entity.Portfolio;
import com.prueba.zemoga.app.enums.ErrorCode;

@Service
public class UtilImpl implements Util {

	@Override
	public StatusDTO generateStatusDTO (ErrorCode errorCode) {
		
		StatusDTO statusDTO = new StatusDTO();
		statusDTO.setCode(errorCode.getCode());
		statusDTO.setMessage(errorCode.getMessage());
		
		return statusDTO;
	}

	@Override
	public ConsultarPortafolioDTO generateConsultarPortafolioDTO (Portfolio portfolio, List<String> tweetsTimeLine) {
		ConsultarPortafolioDTO consultarPortafolioDTO = new ConsultarPortafolioDTO();
		
		consultarPortafolioDTO.setDescription(portfolio.getDescription());
		consultarPortafolioDTO.setExperience(portfolio.getExperience_summary());
		consultarPortafolioDTO.setImageUrl(portfolio.getImage_url());
		consultarPortafolioDTO.setNames(portfolio.getNames());
		consultarPortafolioDTO.setLastNames(portfolio.getLast_names());
		consultarPortafolioDTO.setTweetsTimeLine(tweetsTimeLine);
		return consultarPortafolioDTO;
		
	}
	
	@Override
	public Portfolio generatePortfolio (ActualizarPortafolioDTO actualizarPortafolioDTO, Portfolio portfolio) {
		portfolio.setDescription(actualizarPortafolioDTO.getDescription());
		portfolio.setExperience_summary(actualizarPortafolioDTO.getExperience());
		
		return portfolio;
		
	}
	
	@Override
	public Boolean validateActualizarPortafolioDTO (ActualizarPortafolioDTO actualizarPortafolioDTO) {
		return null != actualizarPortafolioDTO.getDescription() 
			&& null != actualizarPortafolioDTO.getExperience()
			&& null != actualizarPortafolioDTO.getIdPortfolio();
	}

}
