/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.freteweb.atividadeeltonJPA;

import br.com.ejstols.AtividadeJPA.Model.Goleiros;
import br.com.ejstols.AtividadeJPA.Model.Jogador;
import br.com.ejstols.AtividadeJPA.Model.Patrocinadores;
import br.com.ejstols.AtividadeJPA.Model.Time;
import br.com.ejstols.AtividadeJPA.Model.Zagueiros;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author elton
 */
public class app {

     public static void main(String[] args) 
     {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.com.freteweb_atividadeEltonJTA_jar_1.0-SNAPSHOTPU");
        EntityManager em         = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        Time interPOA= new Time();  
        interPOA.setNome("Internacional"); 
        
        Time criciuma= new Time();  
        criciuma.setNome("Criciuma Esporte Clube"); 
        
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();

        jogador1.setNome("Alisson");
        jogador1.setIdade(22);
        jogador2.setNome("Juan");
        jogador2.setIdade(38);

        Goleiros goleiro1 = new Goleiros();
        goleiro1.setJogador(jogador1);
        
        Zagueiros zagueiro = new Zagueiros();
        zagueiro.setJogador(jogador2);
        
        jogador1.setTime(interPOA);
        jogador2.setTime(interPOA);
        
        Patrocinadores empresa1 = new Patrocinadores();
        empresa1.setNome("Patrocinador 1");
        
        Patrocinadores empresa2 = new Patrocinadores();
        empresa2.setNome("Patrocinador 2");
        
        List<Time> times = new ArrayList();
        times.add(interPOA);
        times.add(criciuma);
        empresa1.setTimes(times);
        
        List<Patrocinadores> empresas = new ArrayList();
        empresas.add(empresa1);
        empresas.add(empresa2);
        interPOA.setPatrocinadores(empresas);
        
        trans.begin();
        
        em.persist(interPOA);
        em.persist(criciuma);
        em.persist(jogador1);
        em.persist(jogador2);
        em.persist(zagueiro);
        em.persist(goleiro1);
        em.persist(empresa1);
        em.persist(empresa2);
        trans.commit();
       
        /*
        //--Cria um valor em centavos
        ValoresDinheiro cincoCentavos = new ValoresDinheiro();
        cincoCentavos.setDescricao("Cinco Centavos");
        cincoCentavos.setValor(5);
        
        //--Cria um valor em reais
        ValoresDinheiro dezReais = new ValoresDinheiro();
        dezReais.setDescricao("10 Reais");
        dezReais.setValor(5);
        
        //--Cria uma moeda
        Cedula  cedulaDezReais = new Cedula();
        cedulaDezReais.setTipoDinheiro(dezReais);
        
        trans.begin();
        em.persist(cincoCentavos);
        em.persist(dezReais);
        em.persist(cedulaDezReais);
        
        trans.commit();*/
        
     }
    
    
}
