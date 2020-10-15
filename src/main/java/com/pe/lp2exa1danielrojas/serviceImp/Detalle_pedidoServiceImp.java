package com.pe.lp2exa1danielrojas.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.lp2exa1danielrojas.dao.Detalle_pedidoDao;
import com.pe.lp2exa1danielrojas.entity.Detalle_pedido;
import com.pe.lp2exa1danielrojas.service.Detalle_pedidoService;

@Service
public class Detalle_pedidoServiceImp implements Detalle_pedidoService{
	@Autowired
	private Detalle_pedidoDao detalle_pedidoDao;

	@Override
	public Detalle_pedido read(int id) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.readAll();
	}
}
