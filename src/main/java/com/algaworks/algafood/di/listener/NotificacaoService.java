package com.algaworks.algafood.di.listener;

import com.algaworks.algafood.di.annotation.TipoDoNotificador;
import com.algaworks.algafood.di.enumeration.NivelUrgencia;
import com.algaworks.algafood.di.event.ClienteAtivadoEvent;
import com.algaworks.algafood.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoDoNotificador(NivelUrgencia.NORMAL)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        this.notificador.notificar(event.getClienteAtivado(), "Seu cadastro no sistema está ativo!");
    }

}
