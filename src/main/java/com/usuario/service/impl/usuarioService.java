package com.usuario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usuario.entity.usuario;
import com.usuario.repository.usuarioRepository;
import com.usuario.service.usuarioServicee;

@Service
public class usuarioService implements usuarioServicee{

	@Autowired
	private usuarioRepository UsuarioRepository;
	
	@Override
	public List<usuario> getAllList() {
		return UsuarioRepository.findAll();
	}
	
	@Override
	public usuario getById(Long id) {
		return UsuarioRepository.findById(id).get();
	}
}
