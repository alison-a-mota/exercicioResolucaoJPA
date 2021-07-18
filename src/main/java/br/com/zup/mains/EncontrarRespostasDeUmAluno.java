package br.com.zup.mains;

import br.com.zup.model.Aluno;
import br.com.zup.model.RespostaAlunos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class EncontrarRespostasDeUmAluno {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aluno");
        EntityManager em = emf.createEntityManager();

        //usando o método find para localizar o objeto Aluno
        Aluno aluno = em.find(Aluno.class, 1);

        String jpql = "select r from RespostaAlunos r where r.aluno = :Aluno";
        System.out.println("Aluno: " + aluno.getNome());

        Query query = em.createQuery(jpql);
        query.setParameter("Aluno", aluno);
        List<RespostaAlunos> respostaAlunosList = query.getResultList();

        for (RespostaAlunos resposta : respostaAlunosList) {
            System.out.println("Resposta: " + resposta.getResposta());
            System.out.println("Autoavaliação: " + resposta.getNotaAutoAvaliacao());

        }
    }
}
