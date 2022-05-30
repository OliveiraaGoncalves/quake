package dao;

import model.Game;

public interface GameRepository {
    /*
     *  RETORNA O GAME PELO ID PASSADO COMO PARAMETRO
     */
    Game getGameById(String id);

    void showAllGamesScore();
}
