package com.prueba.zemoga.app.dto;

public class ActualizarPortafolioDTO {
	
    private String description;
	
	private String experience;
	
	private Integer idPortfolio;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	public Integer getIdPortfolio() {
		return idPortfolio;
	}

	public void setIdPortfolio(Integer idPortfolio) {
		this.idPortfolio= idPortfolio;
	}

}
