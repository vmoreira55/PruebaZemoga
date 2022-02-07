package com.prueba.zemoga.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "portfolio") 
public class Portfolio implements Serializable{
    
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6423244453083127246L;

	@Id
	@Column(name = "idportfolio")
	private Integer idportfolio;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "experience_summary")
	private String experience_summary;
	
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "image_url")
	private String image_url;
	
	@Column(name = "last_names")
	private String last_names;
	
	@Column(name = "names")
	private String names;
	
	@Column(name = "tittle")
	private String tittle;
	
	@Column(name = "twitter_user_id")
	private String twitter_user_id;
	
	@Column(name = "twitter_user_name")
	private String twitter_user_name;
	
	@Column(name = "user_id")
	private String user_id;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "experience")
	private String experience;
	
	@Column(name = "image_path")
	private String image_path;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "twitter_user")
	private String twitter_user;
	
	@Column(name = "zip_code")
	private String zip_code;

	public Integer getIdportfolio() {
		return idportfolio;
	}

	public void setIdportfolio(Integer idportfolio) {
		this.idportfolio = idportfolio;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExperience_summary() {
		return experience_summary;
	}

	public void setExperience_summary(String experience_summary) {
		this.experience_summary = experience_summary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getLast_names() {
		return last_names;
	}

	public void setLast_names(String last_names) {
		this.last_names = last_names;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getTwitter_user_id() {
		return twitter_user_id;
	}

	public void setTwitter_user_id(String twitter_user_id) {
		this.twitter_user_id = twitter_user_id;
	}

	public String getTwitter_user_name() {
		return twitter_user_name;
	}

	public void setTwitter_user_name(String twitter_user_name) {
		this.twitter_user_name = twitter_user_name;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTwitter_user() {
		return twitter_user;
	}

	public void setTwitter_user(String twitter_user) {
		this.twitter_user = twitter_user;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	
	
	
}
