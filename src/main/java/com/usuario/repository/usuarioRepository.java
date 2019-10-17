package com.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuario.entity.usuario;

public interface usuarioRepository extends JpaRepository<usuario, Long>{
		
}

