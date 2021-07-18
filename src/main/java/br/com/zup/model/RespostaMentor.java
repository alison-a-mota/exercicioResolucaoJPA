package br.com.zup.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_resposta_mentor")

public class RespostaMentor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Avaliacao idAvaliacao;
    @Column(length = 8000)
    private String Resposta;

    public RespostaMentor(Avaliacao idAvaliacao, String resposta) {
        this.idAvaliacao = idAvaliacao;
        Resposta = resposta;
    }

    @Deprecated
    public RespostaMentor() {
    }
}
