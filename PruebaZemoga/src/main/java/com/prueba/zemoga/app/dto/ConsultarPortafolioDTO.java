package com.prueba.zemoga.app.dto;

import java.util.List;

public class ConsultarPortafolioDTO {


	
	private String description;
	
	private String experience;
		
	private String imageUrl;
	
	private String lastNames;
	
	private String names;
	
	private List<String> tweetsTimeLine;

  public List<String> getTweetsTimeLine() {
    return tweetsTimeLine;
  }

  public void setTweetsTimeLine(List<String> tweetsTimeLine) {
    this.tweetsTimeLine = tweetsTimeLine;
  }

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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getLastNames() {
		return lastNames;
	}

	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}


}
