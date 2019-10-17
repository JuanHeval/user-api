package com.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.usuario.entity.usuario;
import com.usuario.service.usuarioServicee;

@RestController
public class usuarioController {

	@Autowired
	private usuarioServicee usuarioService;
	
	@GetMapping("/list-user")
	public List<usuario> getList(){
		return usuarioService.getAllList();
	}
	
	@GetMapping("/{id}")
	public usuario getById(@PathVariable Long id) {
		return usuarioService.getById(id);
	}
}
