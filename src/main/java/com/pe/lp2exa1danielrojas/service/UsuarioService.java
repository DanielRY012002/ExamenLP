package com.pe.lp2exa1danielrojas.service;

import java.util.List;
import java.util.Map;

import com.pe.lp2exa1danielrojas.entity.Usuario;

public interface UsuarioService {
	Usuario read(int id);
	List<Map<String,Object>> readAll();
}
