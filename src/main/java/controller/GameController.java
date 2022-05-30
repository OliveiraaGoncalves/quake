package controller;

import dao.GameRepository;
import dao.GameRepositoryImpl;

public class GameController {
    private GameRepository game = new GameRepositoryImpl();

    public void getGameById(String id) {
        if (game.getGameById(id) != null) {
            System.out.println(game.getGameById(id));
        } else {
            System.out.println("Nao foi encontrado um game com ID: " + id);
        }
    }

    public void showAllGamesScore() {
        game.showAllGamesScore();
    }
}
