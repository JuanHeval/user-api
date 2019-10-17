package com.usuario.service;

import java.util.List;

import com.usuario.entity.usuario;

public interface usuarioServicee {
	public List<usuario> getAllList();  
	public usuario getById(Long id);
}
