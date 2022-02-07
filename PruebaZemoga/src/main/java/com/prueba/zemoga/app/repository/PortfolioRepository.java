package com.prueba.zemoga.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.zemoga.app.entity.Portfolio;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Integer>{

	
}
