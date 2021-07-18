package br.com.zup.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_resposta_alunos")

public class RespostaAlunos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Avaliacao idAvaliacao;
    @ManyToOne
    private Aluno idAluno;
    @Column(length = 8000)
    private String Resposta;
    @Column(length = 2)
    private Integer notaAutoAvaliacao;

    public RespostaAlunos(Avaliacao idAvaliacao, Aluno idAluno, String resposta) {
        this.idAvaliacao = idAvaliacao;
        this.idAluno = idAluno;
        Resposta = resposta;
    }

    public void setNotaAutoAvaliacao(Integer notaAutoAvaliacao) {
        this.notaAutoAvaliacao = notaAutoAvaliacao;
    }

    public String getResposta() {
        return Resposta;
    }

    public Integer getNotaAutoAvaliacao() {
        return notaAutoAvaliacao;
    }

    @Deprecated
    public RespostaAlunos() {
    }
}
