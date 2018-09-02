package com.hawk.mc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hawk.mc.domain.Pedido;
import com.hawk.mc.repositories.PedidoRepository;
import com.hawk.mc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository categoriaRepository;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + " , Tipo : "
		+ Pedido.class.getName()));
	}

}
