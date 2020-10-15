package com.pe.lp2exa1danielrojas.dao;

import java.util.List;
import java.util.Map;

import com.pe.lp2exa1danielrojas.entity.Detalle_pedido;

public interface Detalle_pedidoDao {
	Detalle_pedido read(int id);
	List<Map<String,Object>> readAll();
}
