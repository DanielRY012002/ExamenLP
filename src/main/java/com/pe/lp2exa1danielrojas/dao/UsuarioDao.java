package com.pe.lp2exa1danielrojas.dao;

import java.util.List;
import java.util.Map;

import com.pe.lp2exa1danielrojas.entity.Usuario;

public interface UsuarioDao {
	Usuario read(int id);
	List<Map<String,Object>> readAll();
	public Usuario read(String nomuser);
}
