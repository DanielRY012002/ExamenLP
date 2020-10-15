package com.pe.lp2exa1danielrojas.service;

import java.util.List;
import java.util.Map;

import com.pe.lp2exa1danielrojas.entity.Detalle_pedido;

public interface Detalle_pedidoService {
	Detalle_pedido read(int id);
	List<Map<String,Object>> readAll();
}
