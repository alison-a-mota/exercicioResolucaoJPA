package br.com.zup.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_avaliacoes")

public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100)
    private String titulo;
    @Column(length = 3000)
    private String descricao;

    public Avaliacao(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    @Deprecated
    public Avaliacao() {
    }
}
