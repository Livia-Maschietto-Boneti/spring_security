package com.livia.atividade.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "TBL_ANIMES")
@Data
public class AnimeModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String nome;
    private String descricao;
    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
