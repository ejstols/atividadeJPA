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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author elton
 */
@Entity
@Table(name="goleiros")
public class Goleiros implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="id", nullable=false)
    private long id;
    @OneToOne
    //@PrimaryKeyJoinColumn
    @JoinColumn(name="id_jogador", nullable=false)
    private Jogador jogador;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    
}
