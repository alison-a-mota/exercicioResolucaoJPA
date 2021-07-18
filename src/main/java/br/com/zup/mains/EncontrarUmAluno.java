package br.com.zup.mains;

import br.com.zup.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EncontrarUmAluno {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aluno");
        EntityManager em = emf.createEntityManager();

        //usando o método find
        Aluno aluno = em.find(Aluno.class, 1);

        System.out.println("O nome do aluno é " + aluno.getNome());

    }
}