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
    private String local;
    private Long capacidade;
    private EventoTipo tipo;

    public Event(Long id, String nome, String descricao, LocalDateTime inicio, LocalDateTime fim, String identificador, String local,
            Long capacidade, EventoTipo tipo) { // Da linha 16 a 26 é o construtor.
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = inicio;
        this.dataFim = fim;
        this.identificador = identificador;
        this.local = local;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Long getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Long capacidade) {
        this.capacidade = capacidade;
    }

    public EventoTipo getTipo() {
        return tipo;
    }

    public void setTipo(EventoTipo tipo) {
        this.tipo = tipo;
    }
}
