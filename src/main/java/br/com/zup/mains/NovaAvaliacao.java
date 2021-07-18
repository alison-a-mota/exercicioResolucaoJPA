package br.com.zup.mains;

import br.com.zup.model.Avaliacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovaAvaliacao {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aluno");
        EntityManager em = emf.createEntityManager();

        Avaliacao avaliacao = new Avaliacao("Java e JPA: Avançando um pouco mais", "Aqui fica a descriçãod a avaliação");

        em.getTransaction().begin();
        em.persist(avaliacao);
        em.getTransaction().commit();
        em.close();
    }
}
