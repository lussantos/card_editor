/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.card_editor.player;

import br.com.card_editor.entity.Player;

/**
 *
 * @author lucas.santos
 */
public interface PlayerService {

    void cadastrarPlayer(Player user);

    void excluirPlayer(Player user);

    void alterarPlayer(Player user);

}
