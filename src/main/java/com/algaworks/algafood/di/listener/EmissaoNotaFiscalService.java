package com.algaworks.algafood.di.listener;

import com.algaworks.algafood.di.event.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        System.out.printf("Nota fiscal emitida para o cliente : %s\n", event.getClienteAtivado().getNome());
    }

}