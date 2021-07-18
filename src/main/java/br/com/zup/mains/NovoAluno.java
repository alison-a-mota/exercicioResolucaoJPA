package br.com.zup.mains;

import br.com.zup.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoAluno {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aluno");
        EntityManager em = emf.createEntityManager();

        Aluno aluno = new Aluno("alisonalvesmota@gmail.com", "Alisu", 32);

        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();
        em.close();
    }
}
