/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ejstols.AtividadeJPA.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author elton
 */
@Entity
@Table(name="Jogador")
public class Jogador implements Serializable{
 
 @Id
 @GeneratedValue
 @Column(name="id", nullable=false)
 private long id;
 
 @Column(name="nome", nullable=false,length=60)
 private String nome; 
 @Column(name="idade", nullable=false)
 private long idade;
 @ManyToOne
 @JoinColumn(name="id_time")
 private Time time;

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

    public long getIdade() {
        return idade;
    }

    public void setIdade(long idade) {
        this.idade = idade;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
 
 
}
