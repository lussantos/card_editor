/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.bean;

import br.com.card_editor.input.IdPlayerBean;
import java.io.Serializable;

/**
 *
 * @author lucas.santos
 */
public class PlayerBean implements Serializable {

    private IdPlayerBean idPlayer;

    private String descricao;

    private String email;

    private String nome;

    private String dataNascimento;

    private String usuarioSistema;

    public IdPlayerBean getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(IdPlayerBean idPlayer) {
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
