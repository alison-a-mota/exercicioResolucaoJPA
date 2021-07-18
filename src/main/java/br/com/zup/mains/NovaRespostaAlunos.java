package br.com.zup.mains;

import br.com.zup.model.Aluno;
import br.com.zup.model.Avaliacao;
import br.com.zup.model.RespostaAlunos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovaRespostaAlunos {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aluno");
        EntityManager em = emf.createEntityManager();

        Aluno aluno = em.find(Aluno.class, 1);
        Avaliacao avaliacao = em.find(Avaliacao.class, 2);
        System.out.println("O aluno é o " + aluno.getNome());

        RespostaAlunos respostaAlunos = new RespostaAlunos(avaliacao, aluno, "Resposta da avaliação Avançando um pouco mais no JPQL");

        em.getTransaction().begin();
        em.persist(respostaAlunos);
        em.getTransaction().commit();
        em.close();
    }
}
