/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.entity;

import br.com.card_editor.annotation.ComposedID;
import br.com.card_editor.annotation.Table;
import br.com.card_editor.entity.key.IdPlayer;
import br.com.card_editor.util.EntityBase;

/**
 *
 * @author lucas.santos
 */
@Table(collectionName = "PLAYER")
public class Player extends EntityBase {

    @ComposedID
    private IdPlayer idPlayer;
    
    private String descricao;
    
    private String email;
    
    private String nome;
    
    private String dataNascimento;
    
    private String usuarioSistema;

    public IdPlayer getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(IdPlayer idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getUsuarioSistema() {
        return usuarioSistema;
    }

    public void setUsuarioSistema(String usuarioSistema) {
        this.usuarioSistema = usuarioSistema;
    }

}
