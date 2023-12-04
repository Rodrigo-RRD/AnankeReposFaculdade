package com.sabertech.ananke.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabertech.ananke.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}
