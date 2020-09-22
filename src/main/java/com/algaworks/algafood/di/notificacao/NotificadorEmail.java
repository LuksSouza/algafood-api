package com.algaworks.algafood.di.notificacao;

import com.algaworks.algafood.di.annotation.TipoDoNotificador;
import com.algaworks.algafood.di.enumeration.NivelUrgencia;
import com.algaworks.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

	@Value("${notificador.email.host-server}")
	private String host;

	@Value("${notificador.email.port-server}")
	private Integer port;
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Hostname: " + this.host);
		System.out.println("Port: " + this.port);

		System.out.printf("Notificando %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(),  mensagem);
	}
	
}
