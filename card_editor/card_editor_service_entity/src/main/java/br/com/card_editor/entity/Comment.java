/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.entity;

import br.com.card_editor.annotation.ID;
import br.com.card_editor.annotation.Table;
import br.com.card_editor.util.EntityBase;

/**
 *
 * @author lucas.santos
 */
@Table(collectionName = "COMMENT")
public class Comment extends EntityBase {

    @ID
    private Long id;

    private Long postId;

    private String nickName;

    private String comment;

    private Integer upVoteCount;

    private Integer downVoteCount;

    private Long answerCommentId;

    private String playerNickName;

    private String playerTpConta;

    private Long postRefId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getUpVoteCount() {
        return upVoteCount;
    }

    public void setUpVoteCount(Integer upVoteCount) {
        this.upVoteCount = upVoteCount;
    }

    public Integer getDownVoteCount() {
        return downVoteCount;
    }

    public void setDownVoteCount(Integer downVoteCount) {
        this.downVoteCount = downVoteCount;
    }

    public Long getAnswerCommentId() {
        return answerCommentId;
    }

    public void setAnswerCommentId(Long answerCommentId) {
        this.answerCommentId = answerCommentId;
    }

    public String getPlayerNickName() {
        return playerNickName;
    }

    public void setPlayerNickName(String playerNickName) {
        this.playerNickName = playerNickName;
    }

    public String getPlayerTpConta() {
        return playerTpConta;
    }

    public void setPlayerTpConta(String playerTpConta) {
        this.playerTpConta = playerTpConta;
    }

    public Long getPostRefId() {
        return postRefId;
    }

    public void setPostRefId(Long postRefId) {
        this.postRefId = postRefId;
    }

}
