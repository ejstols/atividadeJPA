/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ejstols.AtividadeJPA.Model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author elton
 */
@Entity
@Table(name="Patrocinadores")
public class Patrocinadores implements Serializable{
 
 @Id
 @GeneratedValue
 @Column(name="id", nullable=false)
 private long id;
 
 @Column(name="nome", nullable=false,length=60)
 private String nome; 
 @ManyToMany
 @JoinColumn(name="id_time")
 private Collection<Time> times;

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

    public Collection<Time> getTimes() {
        return times;
    }

    public void setTimes(Collection<Time> times) {
        this.times = times;
    }
    
 
}
