package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.annotation.TipoDoNotificador;
import com.algaworks.algafood.di.enumeration.NivelUrgencia;
import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(),  mensagem);
	}
	
}
