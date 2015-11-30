/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ejstols.AtividadeJPA.Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author elton
 */
@Entity
@Table(name="Time")
public class Time implements Serializable{

 @Id
 @GeneratedValue
 @Column(name="id",nullable=false)
 private long id;
 @Column(name="nome",nullable=false, length=100)
 private String nome;
 @OneToMany(mappedBy = "Time")
 private List<Jogador> jogadores;
 @ManyToMany
 private List<Patrocinadores> patrocinadores;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public List<Patrocinadores> getPatrocinadores() {
        return patrocinadores;
    }

    public void setPatrocinadores(List<Patrocinadores> patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

  
}
