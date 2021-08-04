package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    private long id;
    @ManyToOne // varios usuarios pra uma categoria
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne // vários usuários pra uma empresa
    private Empresa empresa;
    @ManyToOne // vários usuários pra um nível de acesso
    private NivelAcesso nivelAcesso;
    @ManyToOne // vários usuários pra uma jornada de trabalho
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;

}
