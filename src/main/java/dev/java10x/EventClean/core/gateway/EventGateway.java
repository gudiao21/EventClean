package dev.java10x.EventClean.core.gateway;

import dev.java10x.EventClean.core.entities.Event;

public interface EventGateway {
    Event create(Event event);

    Event findById(Long id);
}
