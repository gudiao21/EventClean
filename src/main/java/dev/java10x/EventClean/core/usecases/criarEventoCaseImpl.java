package dev.java10x.EventClean.core.usecases;

import dev.java10x.EventClean.core.entities.Event;

public class criarEventoCaseImpl implements criarEventoCase { // Implementa a interface criarEventoCase é obrigatório implementar todos os métodos da interface, fornecendo o seu escopo.

    @Override // Esta annotation é permitida porque ela é nativa do Java puro.
    public Event execute(Event event) {
        return null; // Agora sim, como foi assinado o contrato aqui, ele deve retornar um Event para ser implementado, que é o caso aqui nesta linha.
    }
}
