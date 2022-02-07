package com.prueba.zemoga.app.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import com.prueba.zemoga.app.dto.ConsultarPortafolioDTO;
import com.prueba.zemoga.app.dto.ConsultarPortafolioResponseDTO;
import com.prueba.zemoga.app.dto.StatusDTO;
import com.prueba.zemoga.app.entity.Portfolio;
import com.prueba.zemoga.app.enums.ErrorCode;
import com.prueba.zemoga.app.repository.PortfolioRepository;
import com.prueba.zemoga.app.util.Util;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.prueba.zemoga.app.enums.ErrorCode.CLIENTO_NO_EXISTE;
import static com.prueba.zemoga.app.enums.ErrorCode.DATA_INVALIDA;
import static com.prueba.zemoga.app.enums.ErrorCode.EXITOSO;
import static com.prueba.zemoga.app.enums.ErrorCode.FALLIDO;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class PortfolioServiceImplTest {

  @InjectMocks
  private PortfolioServiceImpl portfolioServiceImpl;

  @Mock
  private PortfolioRepository portfolioRepository;

  @Mock
  private Util util;

  @Mock
  private TwitterTimeLineImpl twitterTimeLineImpl;

  private Integer idportfolio;
  private Optional<Portfolio> oPortfolio;
  private Portfolio portfolio = new Portfolio();
  private List<String> twitterTimeLineList = new ArrayList<String>();
  private String twitterTimeLine;
  private ConsultarPortafolioDTO consultarPortafolioDTO = new ConsultarPortafolioDTO();
  private ConsultarPortafolioResponseDTO consultarPortafolioResponseDTO;

  @BeforeEach
  public void setUp() {
  }
  
  @Test
  public void consultClientDataTest(){
    consultarPortafolioResponseDTO = new ConsultarPortafolioResponseDTO();
    idportfolio = 8;
    portfolio.setIdportfolio(idportfolio);
    oPortfolio = Optional.ofNullable(portfolio);
    twitterTimeLine  = "Este es un tweet de prueba";
    twitterTimeLineList.add(twitterTimeLine);
    consultarPortafolioDTO.setTweetsTimeLine(twitterTimeLineList);
    consultarPortafolioResponseDTO.setConsultarPortafolioDTO(consultarPortafolioDTO);
    consultarPortafolioResponseDTO.setStatusDTO(generateStatusDTO(EXITOSO));
    
    
      Mockito.when(portfolioRepository.findById(idportfolio)).thenReturn(oPortfolio);
      Mockito.when(twitterTimeLineImpl.readTweet()).thenReturn(twitterTimeLineList);
      Mockito.when(util.generateConsultarPortafolioDTO(portfolio, twitterTimeLineList)).thenReturn(consultarPortafolioDTO);
      Mockito.when(util.generateStatusDTO(EXITOSO)).thenReturn(generateStatusDTO(EXITOSO));
      
      ConsultarPortafolioResponseDTO expected = portfolioServiceImpl.findById(idportfolio);
      
      assertThat(expected).isNotNull();
      
  
  }
  
  public StatusDTO generateStatusDTO (ErrorCode errorCode) {
    
    StatusDTO statusDTO = new StatusDTO();
    statusDTO.setCode(errorCode.getCode());
    statusDTO.setMessage(errorCode.getMessage());
    
    return statusDTO;
}
}
