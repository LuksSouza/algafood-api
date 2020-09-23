package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.annotation.TipoDoNotificador;
import com.algaworks.algafood.di.enumeration.NivelUrgencia;
import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.properties.NotificacaoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

	@Autowired
	private NotificacaoProperties properties;
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Hostname: " + properties.getHostServer());
		System.out.println("Port: " + properties.getPortServer());

		System.out.printf("Notificando %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(),  mensagem);
	}
	
}
