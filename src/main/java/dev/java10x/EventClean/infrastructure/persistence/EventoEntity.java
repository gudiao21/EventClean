package dev.java10x.EventClean.infrastructure.persistence;

import java.time.LocalDateTime;
import dev.java10x.EventClean.core.enums.EventoTipo;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "eventos")
public class EventoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private String identificador;
    private String localEvento;
    private Integer capacidade;
    private String organizador;
    @Enumerated(EnumType.STRING) // Indica que o enum "EventoTipo" deve ser convertido para uma string no banco
                                 // de dados.
    private EventoTipo tipo; // Puxando o enum "EventoTipo" que está na pasta "core/enums". A camada externa
                             // pode acessar o enum "EventoTipo"(camada interna) que está na pasta
                             // "core/enums", mas o contrário não, pois na "arquitetura limpa" isto não é
                             // possível.
}
