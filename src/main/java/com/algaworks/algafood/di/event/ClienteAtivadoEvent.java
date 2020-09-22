package com.algaworks.algafood.di.event;

import com.algaworks.algafood.di.modelo.Cliente;

public class ClienteAtivadoEvent {

    private Cliente clienteAtivado;

    public ClienteAtivadoEvent(Cliente clienteAtivado) {
        this.clienteAtivado = clienteAtivado;
    }

    public Cliente getClienteAtivado() {
        return clienteAtivado;
    }

}