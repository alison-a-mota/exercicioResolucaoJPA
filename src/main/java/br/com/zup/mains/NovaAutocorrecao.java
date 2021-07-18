package br.com.zup.mains;

import br.com.zup.model.RespostaAlunos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovaAutocorrecao {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aluno");
        EntityManager em = emf.createEntityManager();

        RespostaAlunos respostaAlunos = em.find(RespostaAlunos.class, 1);
        respostaAlunos.setNotaAutoAvaliacao(8);

        em.getTransaction().begin();
        em.persist(respostaAlunos);
        em.getTransaction().commit();
        em.close();
    }
}
