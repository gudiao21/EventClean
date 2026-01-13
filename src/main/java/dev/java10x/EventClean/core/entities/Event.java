package dev.java10x.EventClean.core.entities;

import java.time.LocalDateTime;

import dev.java10x.EventClean.core.enums.EventoTipo;

public class Event {// Declaram os atributos (também chamados de campos, variáveis de instância ou
                    // membros) da sua classe. Eles representam as características ou dados que cada
                    // objeto do tipo "Event" vai ter. O modificador private na frente significa que
                    // apenas a própria classe Event tem acesso direto a eles (isso é o
                    // encapsulamento). Para que outras classes leiam ou alterem esses valores, elas
                    // precisam usar os métodos públicos que criamos (os Getters e Setters).

    private Long id;
    private String nome;
    private String descricao;
    private String identificador;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private String localEvento;
    private Long capacidade;
    private String organizador;
    private EventoTipo tipo;

    public Event(Long id, String nome, String descricao, LocalDateTime inicio, LocalDateTime fim, String identificador, String local,
            Long capacidade, String organizador, EventoTipo tipo) { // Da linha 16 a 26 é o construtor.
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = inicio;
        this.dataFim = fim;
        this.identificador = identificador;
        this.localEvento = local;
        this.capacidade = capacidade;
        this.organizador = organizador;
        this.tipo = tipo;
} // Fim do construtor.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getLocalEvento() {
        return localEvento;
    }

    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    public Long getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Long capacidade) {
        this.capacidade = capacidade;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public void setTipo(EventoTipo tipo) {
        this.tipo = tipo;
    }
}
