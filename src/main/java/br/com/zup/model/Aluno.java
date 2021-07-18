package br.com.zup.model;

import javax.persistence.*;

@Entity
@Table(name = "tb_alunos")

public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 30)
    private String email;
    @Column(length = 30)
    private String nome;
    @Column(length = 3)
    private Integer idade;

    public Aluno(String email, String nome, Integer idade) {
        this.email = email;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    @Deprecated
    public Aluno() {
    }
}
