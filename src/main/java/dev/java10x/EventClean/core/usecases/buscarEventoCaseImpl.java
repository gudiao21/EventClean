package dev.java10x.EventClean.core.usecases;

import dev.java10x.EventClean.core.entities.Event;

public class buscarEventoCaseImpl implements buscarEventoCase {

    @Override // Esta annotation é permitida porque ela é nativa do Java puro.
    public Event execute(Long id) {
        return null;
    }
}
