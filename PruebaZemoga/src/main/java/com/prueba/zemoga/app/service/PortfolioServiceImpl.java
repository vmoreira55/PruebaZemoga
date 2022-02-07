package com.prueba.zemoga.app.service;

import static com.prueba.zemoga.app.enums.ErrorCode.CLIENTO_NO_EXISTE;
import static com.prueba.zemoga.app.enums.ErrorCode.DATA_INVALIDA;
import static com.prueba.zemoga.app.enums.ErrorCode.EXITOSO;
import static com.prueba.zemoga.app.enums.ErrorCode.FALLIDO;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.prueba.zemoga.app.dto.ActualizarPortafolioDTO;
import com.prueba.zemoga.app.dto.ConsultarPortafolioResponseDTO;
import com.prueba.zemoga.app.dto.StatusDTO;
import com.prueba.zemoga.app.entity.Portfolio;
import com.prueba.zemoga.app.repository.PortfolioRepository;
import com.prueba.zemoga.app.util.Util;

@Service
public class PortfolioServiceImpl implements PortfolioService{
	
	@Autowired
	private PortfolioRepository portfolioRepository;
	
	@Autowired
	private Util util;
	
	@Autowired 
	private TwitterTimeLineImpl twitterTimeLine;
	
	@Override
	@Transactional(readOnly = true)
	public ConsultarPortafolioResponseDTO findById(Integer idportfolio) {
		
		ConsultarPortafolioResponseDTO consultarPortafolioResponseDTO = new ConsultarPortafolioResponseDTO();
		
		Optional<Portfolio> oPortfolio = portfolioRepository.findById(idportfolio);
		
		if(oPortfolio.isPresent()) {
			Portfolio portfolio = oPortfolio.get();	
			List<String> twitterTimeLineList = twitterTimeLine.readTweet(); 
			consultarPortafolioResponseDTO.setConsultarPortafolioDTO(util.generateConsultarPortafolioDTO(portfolio, twitterTimeLineList));
			consultarPortafolioResponseDTO.setStatusDTO(util.generateStatusDTO(EXITOSO));
		}else {
			
			consultarPortafolioResponseDTO.setStatusDTO(util.generateStatusDTO(FALLIDO));
			
		}
		
		return consultarPortafolioResponseDTO;
	}

	@Override
	@Transactional
	public ResponseEntity<StatusDTO> save(ActualizarPortafolioDTO actualizarPortafolioDTO) {
		
		if (!util.validateActualizarPortafolioDTO(actualizarPortafolioDTO)) {
			ResponseEntity<StatusDTO> response = 
					new ResponseEntity<StatusDTO>(util.generateStatusDTO(DATA_INVALIDA), DATA_INVALIDA.getHttpStatus());

			return response;
		}
		
		Optional<Portfolio> oPortfolio = portfolioRepository.findById(actualizarPortafolioDTO.getIdPortfolio());
		
		if(!oPortfolio.isPresent()) {
			ResponseEntity<StatusDTO> response = 
					new ResponseEntity<StatusDTO>(util.generateStatusDTO(CLIENTO_NO_EXISTE), CLIENTO_NO_EXISTE.getHttpStatus());

			return response;
		}
		
		Portfolio portfolio = portfolioRepository.save(util.generatePortfolio(actualizarPortafolioDTO, oPortfolio.get()));
		
		if (null == portfolio) {
			ResponseEntity<StatusDTO> response = 
					new ResponseEntity<StatusDTO>(util.generateStatusDTO(FALLIDO), FALLIDO.getHttpStatus());

			return response;
		}
		 
		ResponseEntity<StatusDTO> response = 
				new ResponseEntity<StatusDTO>(util.generateStatusDTO(EXITOSO), EXITOSO.getHttpStatus());

		return response;
	}
	

	
	
}
