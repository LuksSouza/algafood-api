package com.algaworks.algafood.di.annotation;

import com.algaworks.algafood.di.enumeration.NivelUrgencia;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoDoNotificador {
    NivelUrgencia value();
}