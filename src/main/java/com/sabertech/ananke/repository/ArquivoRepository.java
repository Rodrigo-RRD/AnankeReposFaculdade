package com.sabertech.ananke.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabertech.ananke.model.Arquivo;

public interface ArquivoRepository extends JpaRepository<Arquivo, Long>{
    
}
